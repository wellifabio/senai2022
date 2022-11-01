<?php

	require("../process/process.produto.php");

	include("configs.php");

	$Pp = new ProdutoProcess();

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