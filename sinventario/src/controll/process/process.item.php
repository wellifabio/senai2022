<?php

	require("../../domain/connection.php");
	require("../../domain/item.php");

	class ItemProcess {
		var $id;

		function doGet($arr){
			$id = new ItemDAO();
			if(isset($arr["ni"])){
				$result = $id->read($arr["ni"]);
			}else{
			    if(isset($arr["onlyni"])){
			        $result = $id->readni();
			    }else{
			        $result = $id->read(""); 
			    }
			}
			http_response_code(200);
			echo json_encode($result);
		}

		function doPost($arr){
			$id = new ItemDAO();
			if(isset($arr["action"])){
				switch($arr["action"]){
					case "create":
						if(isset($arr["ni"]) && isset($arr["denominacao"]) && isset($arr["valaquis"])){
							$item = new Item();
							$item->setNi($arr["ni"]);
							$item->setDenominacao($arr["denominacao"]);
							$item->setValaquis($arr["valaquis"]);
							$result["sucess"] = $id->create($item);
						}else{
							$result["err"] = "It's need fields ni, denominacao and valaquis to work";
						}
						break;
					case "update":
						if(isset($arr["ni"]) && isset($arr["incorporacao"]) && isset($arr["denominacao"]) && isset($arr["valaquis"])){
							$item = new Item();
							$item->setNi($arr["ni"]);
							$item->setIncorporacao($arr["incorporacao"]);
							$item->setDenominacao($arr["denominacao"]);
							$item->setValaquis($arr["valaquis"]);
							$result["sucess"] = $id->update($item);
						}else{
							$result["err"] = "It's need fields ni, incorporacao, denominacao and valaquis to work";
						}
						break;
					case "delete":
						if(isset($arr["ni"])){
							$result["sucess"] = $id->delete($arr["ni"]);
						}else{
							$result["err"] = "It's need field ni to work";
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