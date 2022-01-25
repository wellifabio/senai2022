<?php

	require("../process/process.local.php");

	include("configs.php");

	$lp = new LocalProcess();

	switch($_SERVER['REQUEST_METHOD']) {
		case "GET":
			$lp->doGet($_GET);
			break;

		case "POST":
			$lp->doPost($_POST);
			break;

		case "PUT":
			$lp->doPut($_PUT);
			break;

		case "DELETE":
			$lp->doDelete($_DELETE);
			break;
	}