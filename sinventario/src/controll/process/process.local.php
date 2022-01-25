<?php

	require("../../domain/connection.php");
	require("../../domain/local.php");

	class LocalProcess {
		var $ld;

		function doGet($arr){
			$ld = new LocalDAO();
			if(isset($arr["nome"])){
				$result = $ld->read($arr["nome"]);
			}else{
				$result = $ld->read("");
			}
			http_response_code(200);
			echo json_encode($result);
		}


		function doPost($arr){
			$ld = new LocalDAO();
			if(isset($arr["action"])){
				switch($arr["action"]){
					case "create":
						if(isset($arr["nome"]) && isset($arr["descricao"])){
							$local = new Local();
							$local->setNome($arr["nome"]);
							$local->setDescricao($arr["descricao"]);
							$result["sucess"] = $ld->create($local);
						}else{
							$result["err"] = "It's need fields nome and descricao to work";
						}
						break;
					case "update":
						if(isset($arr["nome"]) && isset($arr["descricao"])){
							$local = new Local();
							$local->setNome($arr["nome"]);
							$local->setDescricao($arr["descricao"]);
							$result["sucess"] = $ld->update($local);
						}else{
							$result["err"] = "It's need fields nome and descricao to work";
						}
						break;
					case "delete":
						if(isset($arr["nome"])){
							$result["sucess"] = $ld->delete($arr["nome"]);
						}else{
							$result["err"] = "It's need field nome to work";
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