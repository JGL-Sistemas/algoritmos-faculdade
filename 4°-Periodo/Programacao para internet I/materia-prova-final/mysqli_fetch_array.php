<?php

//importa script de outro arquivo
require_once('mysqli_query.php');

//query de consulta do SQL
$result = mysqli_query($conexao,"SELECT * FROM `curso`");

//loop que mostra todos os dados do array gerado do banco de dados 
while($sql = mysqli_fetch_array($result)){
	//linha do codigo	
}

?>