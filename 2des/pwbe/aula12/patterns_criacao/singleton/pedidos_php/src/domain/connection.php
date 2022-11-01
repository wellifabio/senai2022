<?php

	class Connection{
		
		public static $instance;

		public static function getInstance(){
			$url = "mysql:host=localhost;port=3306;dbname=database_name;";

			$user = "root";

			$password = "";

			$config = array(PDO::ATTR_PERSISTENT => true,PDO::ATTR_CASE => PDO::CASE_LOWER);

			if (!isset(self::$instance)) {
				self::$instance = new PDO($url,$user,$password,$config);

				self::$instance->setAttribute(PDO::ATTR_ORACLE_NULLS, PDO::NULL_EMPTY_STRING);
			}

			return self::$instance;
		}
	}