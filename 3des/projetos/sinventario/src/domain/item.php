<?php

	class Item {
		var $ni;
		var $incorporacao;
		var $denominacao;
		var $valaquis;

		function getNi(){
			return $this->ni;
		}
		function setNi($ni){
			$this->ni = $ni;
		}

		function getIncorporacao(){
			return $this->incorporacao;
		}
		function setIncorporacao($incorporacao){
			$this->incorporacao = $incorporacao;
		}

		function getDenominacao(){
			return $this->denominacao;
		}
		function setDenominacao($denominacao){
			$this->denominacao = $denominacao;
		}

		function getValaquis(){
			return $this->valaquis;
		}
		function setValaquis($valaquis){
			$this->valaquis = $valaquis;
		}
	}

	class Ni{
	    
	    var $ni;
	    
	    function getNi(){
			return $this->ni;
		}
		function setNi($ni){
			$this->ni = $ni;
		}
	}

	class ItemDAO {
		function create($item) {
			$result = array();
			$ni = $item->getNi();
			$denominacao = $item->getDenominacao();
			$valaquis = $item->getValaquis();
			$query = "INSERT INTO itens (ni, incorporacao, denominacao, valaquis) VALUES ('$ni', curdate(), '$denominacao', $valaquis)";
			try {
				$con = new Connection();
				if(Connection::getInstance()->exec($query) >= 1){
					$result["sucess"] = "Item cadastrado com sucesso";
				}else{
					$result["err"] = "Erro ao enviar dados para o Banco de Dados";
				}
				$con = null;
			}catch(PDOException $e) {
				$result["err"] = $e->getMessage();
			}

			return $result;
		}

		function read($ni) {
			$result = array();
			if($ni != ''){
				$query = "SELECT * FROM itens WHERE ni like '$ni%'";
			}else{
				$query = "SELECT * FROM itens";
			}
			try {
				$con = new Connection();
				$resultSet = Connection::getInstance()->query($query);
				while($row = $resultSet->fetchObject()){
					$item = new Item();
					$item->setNi($row->ni);
					$item->setIncorporacao($row->incorporacao);
					$item->setDenominacao($row->denominacao);
					$item->setValaquis($row->valaquis);
					$result[] = $item;
				}
				$con = null;
			}catch(PDOException $e) {
				$result["err"] = $e->getMessage();
			}
			return $result;
		}
		
		function readni() {
			$result = array();
			$query = "SELECT ni FROM itens";
			try {
				$con = new Connection();
				$resultSet = Connection::getInstance()->query($query);
				while($row = $resultSet->fetchObject()){
					$ni = new Ni();
					$ni->setNi($row->ni);
					$result[] = $ni;
				}
				$con = null;
			}catch(PDOException $e) {
				$result["err"] = $e->getMessage();
			}
			return $result;
		}

		function update($item) {
			$result = array();
			$ni = $item->getNi();
			$incorporacao = $item->getIncorporacao();
			$denominacao = $item->getDenominacao();
			$valaquis = $item->getValaquis();
			$query = "UPDATE itens SET incorporacao = '$incorporacao', denominacao = '$denominacao', valaquis = '$valaquis' WHERE ni = '$ni'";
			try {
				$con = new Connection();
				$status = Connection::getInstance()->prepare($query);
				if($status->execute()){
					$result["sucess"] = "Item alterado com sucesso";
				}else{
					$result["err"] = "Erro ao alterar dados no Banco de Dados";
				}
				$con = null;
			}catch(PDOException $e) {
				$result["err"] = $e->getMessage();
			}
			return $result;
		}

		function delete($ni) {
			$result = array();
			$query = "DELETE FROM itens WHERE ni = '$ni'";
			try {
				$con = new Connection();
				if(Connection::getInstance()->exec($query) >= 1){
					$result["sucess"] = "Item excluído com sucesso";
				}else{
					$result["err"] = "Erro ao excluir dados no Banco de Dados";
				}
				$con = null;
			}catch(PDOException $e) {
				$result["err"] = $e->getMessage();
			}
			return $result;
		}
	}
