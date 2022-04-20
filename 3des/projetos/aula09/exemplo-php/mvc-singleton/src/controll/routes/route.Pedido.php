<?php

	require("../process/process.pedido.php");

	include("configs.php");

	$Pp = new PedidoProcess();

	switch($_SERVER['REQUEST_METHOD']) {
		case "GET":
			$Pp->doGet($_GET);
			break;

		case "POST":
			$Pp->doPost($_POST);
			break;

		case "PUT":
			$Pp->doPut($_PUT);
			break;

		case "DELETE":
			$Pp->doDelete($_DELETE);
			break;
	}