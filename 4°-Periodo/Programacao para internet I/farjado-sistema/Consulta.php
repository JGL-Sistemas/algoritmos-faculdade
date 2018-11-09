<?php

include 'conecta.php';

$sql_todos_alunos = "SELECT * FROM aluno";

$todos_alunos = mysqli_query($con, $sql_todos_alunos)or die(mysqli_error($con));

    while ($row_alunos = mysqli_fetch_array($todos_alunos)) {
      
        
        
        echo $row_alunos['nome'];
        echo '<a href="Excluir.php"><button>Excluir</button></a>' ;
        echo '<a href="Alt2.php"><button>Alterar</button></a>';
        echo "<br>";
    }

