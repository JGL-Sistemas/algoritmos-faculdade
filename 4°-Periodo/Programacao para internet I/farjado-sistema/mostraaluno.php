<?php include('topo.php'); ?>


<div class="container">

<h2><a href="aluno.php">Adicionar novo Aluno</a></h2>

<div class="table-responsive">  
<table class="table" >
	<thead>
  <tr>
    <th>matricula</th>
    <th>nome</th> 
    <th>telelefone</th>
    <th></th>
    <th></th>
  </tr>
</thead>
<tbody>
	<?php
	$sql = "SELECT * FROM `aluno`";
		$consulta = mysqli_query($con, $sql);
		if(mysqli_num_rows ($consulta) > 0 ){
			while($linha = mysqli_fetch_assoc($consulta)){
				echo '<tr>
	         			<td>'.$linha['nome'].'</td>
	         			
	         			<td>'.$linha['matricula'].'</td>
	         			
	         			<td>'.$linha['telefone'].'</td>
	         			<td><a href="mostraaluno.php?excluir='.$linha['cod_aluno'].'">Excluir</a></td>
	         			<td><a href="aluno.php?editar='.$linha['cod_aluno'].'">Editar</a></td>
	       			  </tr>';
	    	}
	   }
?>
<?php

if(isset($_GET['excluir'])){
	$id = $_GET['excluir'];
	$sql = "DELETE FROM `aluno` WHERE `aluno`.`cod_aluno` = $id";
	mysqli_query($con,$sql);
}

?>
</tbody>
</table>
</div>
	
</div>