<?php

require_once('mysqli_connect.php');



$sql = "INSERT INTO `curso` (`cod_curso`, `nome`, `sigla`, `periodo`) VALUES (NULL, '$nome', '$sigla','$periodo')";

$inserir = mysqli_query($conexao,$sql);


?>