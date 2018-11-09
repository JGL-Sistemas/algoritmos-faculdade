<?php include('topo.php'); ?>


<div class="container">
<form method="post" action="aluno.php">
	<label>aluno:</label>
	<input type="text" name="nomealuno" class="form-control">
	<label>matricula:</label>
	<input type="text" name="matri" class="form-control">
	<label>telefone:</label>
	<input type="text" name="tel" class="form-control"></br>
	<input type="hidden" name="editar" value="<?php if( isset ( $_GET['editar'] ) ) echo $_GET['editar']; ?>" class="form-control">
	<input type="submit" name="cadastra" class="form-control">
</form>
</div>

<?php
if (isset( $_POST['cadastra']) and !isset( $_GET['editar']) ){
	
	 $nome = $_POST['nomealuno'];
	 $matri = $_POST['matri'];
	 $tel = $_POST['tel'];

	$sqlaluno = "INSERT INTO `aluno` (`cod_aluno`, `matricula`, `nome`, `telefone`) VALUES (NULL,'$matri','$nome','$tel')";
	mysqli_query($con,$sqlaluno);
	
}


if (isset( $_POST['cadastra']) and isset( $_POST['editar']) ){
	
	 $nome = $_POST['nomealuno'];
	 $matri = $_POST['matri'];
	 $tel = $_POST['tel'];
	 echo $id = $_POST['editar'];

	$sqlaluno = "UPDATE `aluno` SET `matricula` = '$matri',`nome` = '$nome',`tel` = '$tel' WHERE `aluno`.`cod_aluno` = $id";
	mysqli_query($con,$sqlaluno); 
}

?>