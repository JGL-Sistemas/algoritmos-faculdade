<?php include('topo.php'); ?>


<div class="container">

<h2><a href="curso.php">Adicionar novo Aluno</a></h2>
<div class="table-responsive">  
<table class="table" >
  <tr>
    <th>nome</th> 
    <th>Sigla</th>
    <th></th>
    <th></th>
  </tr>
	<?php
	$sql = "SELECT * FROM `curso`";
		$consulta = mysqli_query($con, $sql);
		if(mysqli_num_rows ($consulta) > 0 ){
			while($linha = mysqli_fetch_assoc($consulta)){
				echo '<tr>
	         			<td>'.$linha['nome'].'</td>
	         			
	         			<td>'.$linha['sigla'].'</td>
	         			<td><a href="mostracurso.php?excluir='.$linha['cod_curso'].'">Excluir</a></td>
	         			<td><a href="curso.php?editar='.$linha['cod_curso'].'">Editar</a></td>
	       			  </tr>';
	    	}
	   }
?>
<?php

if(isset($_GET['excluir'])){
	$id = $_GET['excluir'];
	$sql = "DELETE FROM `curso` WHERE `curso`.`cod_curso` = $id";
	mysqli_query($con,$sql);
}

?>

</table>
</div>	
</div>