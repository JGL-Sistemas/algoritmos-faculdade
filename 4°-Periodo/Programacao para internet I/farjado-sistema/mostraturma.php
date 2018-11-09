<?php include('topo.php'); ?>


<div class="container">

<h2><a href="turma.php">Adicionar nova turma</a></h2>

<div class="table-responsive">  
<table class="table" >
  <tr>
    <th>Letra</th>
    <th>curso</th>
    <th>ano</th> 
    <th>semestre</th>
    <th>periodo</th>
    <th></th>
    <th></th>
    <th></th>
  </tr>
	<?php
	$sql = "SELECT * FROM `turma`";
		$consulta = mysqli_query($con, $sql);
		if(mysqli_num_rows ($consulta) > 0 ){
			while($linha = mysqli_fetch_assoc($consulta)){
				echo '<tr>
	         			<td>'.$linha['letra'].'</td>
	         			
	         			<td>'.$linha['cod_curso'].'</td>

	         			<td>'.$linha['ano'].'</td>

	         			<td>'.$linha['semestre'].'</td>
	         			
	         			<td>'.$linha['periodo'].'</td>
	         			<td><a href="mostraturmadealunos.php?abrir='.$linha['cod_turma'].'">Abrir Turma</a></td>
	         			<td><a href="mostraturma.php?excluir='.$linha['cod_turma'].'">Excluir</a></td>
	         			<td><a href="turma.php?editar='.$linha['cod_turma'].'">Editar</a></td>
	       			  </tr>';
	    	}
	   }
?>
<?php

if(isset($_GET['excluir'])){
	$id = $_GET['excluir'];
	$sql = "DELETE FROM `turma` WHERE `turma`.`cod_turma` = $id";
	mysqli_query($con,$sql);
}

?>
</div>	
</table>
	
</div>