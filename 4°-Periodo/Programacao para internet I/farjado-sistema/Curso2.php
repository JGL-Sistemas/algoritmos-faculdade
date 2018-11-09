<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <title>Cadastro Realizado</title>
    </head>
    <body>
   
        <span>Cadastro realizado com sucesso!</span>
   
    </body>
</html>


<?php

$name = $_POST['name'];
$sigla = $_POST['sigla'];

include 'Conecta.php';


$sql = "INSERT INTO curso (nome, sigla) VALUES('$name', '$sigla')"; 
mysqli_query($con,$sql);

