<?php

	require("../../domain/connection.php");
	require("../../domain/produto.php");

	class ProdutoProcess {
		var $Pd;

		function doGet($arr){
			$Pd = new ProdutoDAO();
			$result = "use to result to DAO";
			http_response_code(200);
			echo json_encode($result);
		}


		function doPost($arr){
			$Pd = new ProdutoDAO();
			$result = "use to result to DAO";
			http_response_code(200);
			echo json_encode($result);
		}


		function doPut($arr){
			$Pd = new ProdutoDAO();
			$result = "use to result to DAO";
			http_response_code(200);
			echo json_encode($result);
		}


		function doDelete($arr){
			$Pd = new ProdutoDAO();
			$result = "use to result to DAO";
			http_response_code(200);
			echo json_encode($result);
		}
	}