<?php

//importa script de outro arquivo
require_once('mysqli_connect.php');


//inserir no banco de dados 
$sql = "INSERT INTO `curso` (`cod_curso`, `nome`, `sigla`, `periodo`) VALUES (NULL, '$nome', '$sigla','$periodo')";

//inseri dados no banco  
$inserir = mysqli_query($conexao,$sql);


?>