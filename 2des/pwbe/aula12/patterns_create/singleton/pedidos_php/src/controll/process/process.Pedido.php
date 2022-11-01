<?php

	require("../../domain/connection.php");
	require("../../domain/pedido.php");

	class PedidoProcess {
		var $Pd;

		function doGet($arr){
			$Pd = new PedidoDAO();
			$result = "use to result to DAO";
			http_response_code(200);
			echo json_encode($result);
		}


		function doPost($arr){
			$Pd = new PedidoDAO();
			$result = "use to result to DAO";
			http_response_code(200);
			echo json_encode($result);
		}


		function doPut($arr){
			$Pd = new PedidoDAO();
			$result = "use to result to DAO";
			http_response_code(200);
			echo json_encode($result);
		}


		function doDelete($arr){
			$Pd = new PedidoDAO();
			$result = "use to result to DAO";
			http_response_code(200);
			echo json_encode($result);
		}
	}