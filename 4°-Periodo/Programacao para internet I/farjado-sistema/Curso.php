<?php include('topo.php'); ?>


<div class="container">
<form method="post" action="curso.php">
	<label>Curso:</label>
	<input type="text" name="nomecurso" class="form-control">
	<label>Sigla:</label>
	<input type="text" name="sigla" class="form-control">
	<input type="hidden" name="editar" value="<?php if( isset ( $_GET['editar'] ) ) echo $_GET['editar']; ?>" class="form-control"></br>
	<input type="submit" name="cadastra" class="form-control">
</form>
</div>

<?php
if (isset( $_POST['cadastra']) and !isset( $_GET['editar']) ){
	
	 $nome = $_POST['nomecurso'];
	 $sigla = $_POST['sigla'];

	echo $sql = "INSERT INTO `curso` (`cod_curso`, `sigla`, `nome`) VALUES (NULL,'$sigla','$nome')";
	mysqli_query($con,$sql);
	
}


if (isset( $_POST['cadastra']) and isset( $_POST['editar']) ){
	
	 $nome = $_POST['nomecurso'];
	 $sigla = $_POST['sigla'];
	 $id = $_POST['editar'];

	$sql = "UPDATE `curso` SET `sigla` = '$sigla',`nome` = '$nome' WHERE `curso`.`cod_curso` = $id";
	mysqli_query($con,$sql); 
}

?>