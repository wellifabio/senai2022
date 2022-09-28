<?php

	class Local {
		var $nome;
		var $descricao;

		function getNome(){
			return $this->nome;
		}
		function setNome($nome){
			$this->nome = $nome;
		}

		function getDescricao(){
			return $this->descricao;
		}
		function setDescricao($descricao){
			$this->descricao = $descricao;
		}
	}

	class LocalDAO {
		function create($local) {
			$result = array();
			$nome = $local->getNome();
			$descricao = $local->getDescricao();
			try {
				$query = "INSERT INTO locais (nome, descricao) VALUES ('$nome', '$descricao')";
				$con = new Connection();
				if(Connection::getInstance()->exec($query) >= 1){
					$result["err"] = "Register created";
				}else{
					$result["err"] = "DB error on insert data";
				}
				$con = null;
			}catch(PDOException $e) {
				$result["err"] = $e->getMessage();
			}
			return $result;
		}

		function read($nome) {
			$result = array();
			if($nome != ''){
				$query = "SELECT * FROM locais WHERE nome Like '%$nome%'";
			}else {
				$query = "SELECT * FROM locais";
			}
			try {
				$con = new Connection();
				$resultSet = Connection::getInstance()->query($query);
				while($row = $resultSet->fetchObject()){
					$local = new Local();
					$local->setNome($row->nome);
					$local->setDescricao($row->descricao);
					$result [] = $local;
				}
				$con = null;
			}catch(PDOException $e) {
				$result["err"] = $e->getMessage();
			}
			return $result;
		}

		function update($local) {
			$result = array();
			$nome = $local->getNome();
			$descricao = $local->getDescricao();
			$query = "UPDATE locais SET descricao = '$descricao' WHERE nome = '$nome'";
			try {
				$con = new Connection();
				$status = Connection::getInstance()->prepare($query);
				if($status->execute()){
					$result["sucess"] = "Updated register";
				}else{
					$result["err"] = "DB error on update data";
				}
				$con = null;
			}catch(PDOException $e) {
				$result["err"] = $e->getMessage();
			}
			return $result;
		}

		function delete($nome) {
			$result = array();
			$query = "DELETE FROM locais WHERE nome = '$nome'";
			try {
				$con = new Connection();
				if(Connection::getInstance()->exec($query) >= 1){
					$result["sucess"] = "Register deleted";
				}else{
					$result["err"] = "DB error on delete data";
				}
				$con = null;
			}catch(PDOException $e) {
				$result["err"] = $e->getMessage();
			}
			return $result;
		}
	}
