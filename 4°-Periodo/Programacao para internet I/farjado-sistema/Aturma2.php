
<?php
include 'conecta.php';
$cod_turma = $_GET['cod_turma'];
?>
<form  method="post" action="Aturma3.php">
    <input type="hidden" name="cod_turma" value="<?= $cod_turma ?>">

    <?php
    $sql_aturma2 = "SELECT aluno.cod_aluno, aluno.nome FROM aluno "
            . "";
    $todos_sem_turma = mysqli_query($con, $sql_aturma2)or die(mysqli_error($con));

    while ($row_aturma2 = mysqli_fetch_array($todos_sem_turma)) {
        echo '<input type="checkbox" name="alunos[]" value="' . $row_aturma2['cod_aluno'] . '">';
        echo $row_aturma2['nome'];
        echo "<br>";
    }
    ?>
    
    <input type="submit" name="" value="enviar">
</form>