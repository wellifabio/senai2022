<?php

	require("../process/process.item.php");

	include("configs.php");

	$ip = new ItemProcess();

	switch($_SERVER['REQUEST_METHOD']) {
		case "GET":
			$ip->doGet($_GET);
			break;

		case "POST":
			$ip->doPost($_POST);
			break;

		case "PUT":
			$ip->doPut($_PUT);
			break;

		case "DELETE":
			$ip->doDelete($_DELETE);
			break;
	}