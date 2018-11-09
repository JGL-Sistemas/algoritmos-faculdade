<?php

include 'conecta.php';
$cod_turma = $_POST['cod_turma'];
foreach ($_POST['alunos'] as $cod_aluno){
        echo $sql = "INSERT INTO aluno_turma values($cod_aluno, $cod_turma)";
       // mysqli_query($sql);
}
