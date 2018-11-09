<?php include('topo.php'); ?>




<div class="container">
<form method="post" action="turma.php">
	<div class="form-group">
	<label>letra:</label>
	<input type="text" name="letracurso"  class="form-control">
	</div>
	<label>periodo:</label>
	<input type="text" name="periodo" class="form-control">
	<label>curso:</label>
	<select name="curso" class="form-control">
		<option value="1">sistemas de informação</option>
		<option value="1">sistemas de informação</option>
		<option value="1">sistemas de informação</option>
		<option value="1">sistemas de informação</option>
	</select>
	<label>ano:</label>
	<input type="text" name="ano" class="form-control">
	<label>semestre:</label>
	<select name="semestre" class="form-control">
		<option value="1">1</option>
		<option value="2">2</option>
	</select></br>
	<input type="submit" name="cadastra" value="cadastrar" class="form-control">
</form>
</div>

<?php
if (isset( $_POST['cadastra']) and !isset( $_GET['editar']) ){
	
	 $letracurso = $_POST['letracurso'];
	 $periodo = $_POST['periodo'];
	 $curso = $_POST['curso'];
	 $ano = $_POST['ano'];
	 $semestre = $_POST['semestre'];
	 

	 $sql = "INSERT INTO `turma` (`cod_turma`, `letra`, `periodo`, `cod_curso`, `ano`, `semestre`) VALUES (null, '$letracurso', '$periodo', '$curso', '$ano', '$semestre')";
	mysqli_query($con,$sql);
	
}


if (isset( $_POST['cadastra']) and isset( $_POST['editar']) ){
	
	 echo $letracurso = $_POST['letracurso'];
	 echo $periodo = $_POST['periodo'];
	 echo $curso = $_POST['curso'];
	 echo $ano = $_POST['ano'];
	 echo $semestre = $_POST['semestre'];

	echo $sql = "UPDATE `curso` SET `letra` ='$letracurso', `periodo` ='$periodo', `cod_curso` ='$curso', `ano` ='$ano', `semestre`='$semestre' WHERE `curso`.`cod_curso` = $id";
	mysqli_query($con,$sql); 
}

?>
