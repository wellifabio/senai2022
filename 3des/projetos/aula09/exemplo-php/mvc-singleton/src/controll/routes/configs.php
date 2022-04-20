<?php

	header("Content-type: application/json; charset=UTF-8");
	header("Access-Control-Allow-Origin: http://localhost/");
	header("Access-Control-Allow-Methods: GET, PUT, POST, DELETE");

	$_PUT = array();
	if (!strcasecmp($_SERVER['REQUEST_METHOD'], 'PUT')) {
		parse_str(file_get_contents('php://input'), $_PUT);
	}

	$_DELETE = array();
	if (!strcasecmp($_SERVER['REQUEST_METHOD'], 'DELETE')) {
		parse_str(file_get_contents('php://input'), $_DELETE);
	}