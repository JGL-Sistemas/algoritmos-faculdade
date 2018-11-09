<?php include 'conecta.php';
?>

<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <title>Cadastrar Aluno na turma</title>
    </head>
    <body>
   
   
    <?php
          $sql_curso = "SELECT nome,periodo,cod_turma FROM curso,turma "
                  . "WHERE curso.cod_curso = turma.cod_curso ";
          
          $todos_turmas = mysqli_query($con, $sql_curso);
          while($row_cursos = mysqli_fetch_assoc($todos_turmas)){
      $cod_turma =  $row_cursos['cod_turma'];
            echo "<a href='aturma2.php?cod_turma=$cod_turma'>".$row_cursos['periodo']."° ".$row_cursos['nome']."</a><br>";
          }
            ?>
           
           
     
    
    
    
    
    </body>
</html>

