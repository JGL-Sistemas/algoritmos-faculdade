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

include 'Conecta.php';

$letra = $_POST['letra'];
$periodo = $_POST['periodo'];
$curso = $_POST['curso'];
$ano = $_POST['ano'];
$semestre = $_POST['semestre'];



$sql = " INSERT INTO turma (letra, periodo, cod_curso, ano, semestre ) VALUES('$letra', '$periodo','$curso', '$ano', '$semestre')"; 
mysqli_query($con,$sql);

?>