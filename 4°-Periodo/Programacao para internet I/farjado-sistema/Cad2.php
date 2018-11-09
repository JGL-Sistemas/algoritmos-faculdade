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
$matricula = $_POST['matricula'];
$telefone = $_POST['telefone'];

include 'Conecta.php';

$sql = "INSERT INTO aluno (matricula, nome, telefone) VALUES('$matricula', '$name', '$telefone')"; 
mysqli_query($con,$sql);



