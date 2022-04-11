<?php

	class Movimentacao {
		var $id;
		var $ni;
		var $local;
		var $data;
		var $tipo;
		var $user;
		var $incorporacao;
		var $denominacao;

		function getId(){
			return $this->id;
		}
		function setId($id){
			$this->id = $id;
		}

		function getNi(){
			return $this->ni;
		}
		function setNi($ni){
			$this->ni = $ni;
		}

		function getLocal(){
			return $this->local;
		}
		function setLocal($local){
			$this->local = $local;
		}

		function getData(){
			return $this->data;
		}
		function setData($data){
			$this->data = $data;
		}

		function getTipo(){
			return $this->tipo;
		}
		function setTipo($tipo){
			$this->tipo = $tipo;
		}
		
		function getUser(){
			return $this->user;
		}
		function setUser($user){
			$this->user = $user;
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
	}

	class MovimentacaoDAO {
		function create($movimentacao) {
			$result = array();
			$ni = $movimentacao->getNi();
			$local = $movimentacao->getLocal();
			$tipo = $movimentacao->getTipo();
			$user = $movimentacao->getUser();
			$query = "INSERT INTO movimentacoes (ni, local, data, tipo, user) VALUES ('$ni', '$local', curdate(),'$tipo','$user')";
			try {
				$con = new Connection();
				if(Connection::getInstance()->exec($query) >= 1){
					$result["sucess"] = "Movimentação cadastrada com sucesso";
				}else{
					$result["err"] = "Erro ao enviar dados para o Banco de Dados";
				}
				$con = null;
			}catch(PDOException $e) {
				$result["err"] = $e->getMessage();
			}
			return $result;
		}

		function read($ni,$tipo) {
			$result = array();
			if($ni == '' && $tipo == ''){
				$query = "SELECT * FROM vw_movimentacoes";
			}elseif($ni != '' && $tipo != ''){
				$query = "SELECT * FROM vw_movimentacoes WHERE ni like '$ni%' AND tipo like '$tipo%'";
			} else if($ni != ''){
				$query = "SELECT * FROM vw_movimentacoes WHERE ni like '$ni%'";
			} else{
				$query = "SELECT * FROM vw_movimentacoes WHERE tipo like '$tipo%'";
			}
			try {
				$con = new Connection();
				$resultSet = Connection::getInstance()->query($query);
				while($row = $resultSet->fetchObject()){
					$movimentacao = new Movimentacao();
					$movimentacao->setId($row->id);
					$movimentacao->setNi($row->ni);
					$movimentacao->setLocal($row->local);
					$movimentacao->setData($row->data);
					$movimentacao->setTipo($row->tipo);
					$movimentacao->setUser($row->user);
					$movimentacao->setIncorporacao($row->incorporacao);
					$movimentacao->setDenominacao($row->denominacao);
					$result[] = $movimentacao;
				}
				$con = null;
			}catch(PDOException $e) {
				$result["err"] = $e->getMessage();
			}
			return $result;
		}

		function update($movimentacao) {
			$result = array();
			$id = $movimentacao->getId();
			$ni = $movimentacao->getNi();
			$local = $movimentacao->getLocal();
			$data  = $movimentacao->getData();
			$tipo = $movimentacao->getTipo();
			$user = $movimentacao->getUser();
			$query = "UPDATE movimentacoes SET ni = '$ni', local = '$local', data = '$data', tipo = '$tipo', user = '$user' WHERE id = $id";
			try {
				$con = new Connection();
				$status = Connection::getInstance()->prepare($query);
				if($status->execute()){
					$result["sucess"] = "Movimentação alterada com sucesso";
				}else{
					$result["err"] = "Erro ao alterar dados no Banco de Dados";
				}
				$con = null;
			}catch(PDOException $e) {
				$result["err"] = $e->getMessage();
			}
			return $result;
		}

		function delete($id) {
			$result = array();
			$query = "DELETE FROM movimentacoes WHERE id = $id";
			try {
				$con = new Connection();
				if(Connection::getInstance()->exec($query) >= 1){
					$result["sucess"] = "Movimentação excluída com sucesso";
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
