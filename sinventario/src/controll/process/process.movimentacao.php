<?php

	require("../../domain/connection.php");
	require("../../domain/movimentacao.php");

	class MovimentacaoProcess {
		var $md;

		function doGet($arr){
			$md = new MovimentacaoDAO();
			if(isset($arr["ni"]) && isset($arr["tipo"])){
				$result = $md->read($arr["ni"],$arr["tipo"]);
			}else if(isset($arr["ni"])){
				$result = $md->read($arr["ni"],'');
			}else if(isset($arr["tipo"])){
				$result = $md->read('',$arr["tipo"]);
			}else{
				$result = $md->read('','');
			}
			http_response_code(200);
			echo json_encode($result);
		}


		function doPost($arr){
			$md = new MovimentacaoDAO();
			if(isset($arr["action"])){
				switch($arr["action"]){
					case "create":
						if(isset($arr["ni"]) && isset($arr["local"]) && isset($arr["tipo"]) && isset($arr["user"])){
							$movimentacao = new Movimentacao();
							$movimentacao->setNi($arr["ni"]);
							$movimentacao->setLocal($arr["local"]);
							$movimentacao->setTipo($arr["tipo"]);
							$movimentacao->setUser($arr["user"]);
							$result["sucess"] = $md->create($movimentacao);
						}else{
							$result["err"] = "It's need fields ni, local, user and tipo to create";
						}
						break;
					case "update":
						if(isset($arr["id"]) && isset($arr["ni"]) && isset($arr["local"]) && isset($arr["data"]) && isset($arr["tipo"]) && isset($arr["user"])){
							$movimentacao = new Movimentacao();
							$movimentacao->setId($arr["id"]);
							$movimentacao->setNi($arr["ni"]);
							$movimentacao->setLocal($arr["local"]);
							$movimentacao->setData($arr["data"]);
							$movimentacao->setTipo($arr["tipo"]);
							$movimentacao->setUser($arr["user"]);
							$result["sucess"] = $md->update($movimentacao);
						}else{
							$result["err"] = "It's need fields id, ni, local, user data and tipo to update";
						}
						break;
					case "delete":
						if(isset($arr["id"])){
							$result["sucess"] = $md->delete($arr["id"]);
						}else{
							$result["err"] = "It's need field id to work";
						}
						break;
					default:
						$result["err"] = "The field action must be filled with create, update or delete to work.";
						break;
				}
			} else {
				$result["err"] = "It's necessary a field named action filled with create, update or delete to work.";
			}
			http_response_code(200);
			echo json_encode($result);
		}
	}