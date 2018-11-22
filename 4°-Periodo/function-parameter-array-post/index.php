<!DOCTYPE html>
<html>
<head>
	<title>Parameter method post array</title>
	<meta charset="utf-8">
</head>
<body>

	<div>
		<form method="POST">
			<input type="text" name="valor1"></br>
			<input type="text" name="valor2"></br>
			<input type="text" name="valor3"></br>
			<input type="submit" name="enviar">
		</form>
	</div>
	<?php

	function paramet_array(array $dados){
		echo $dados['valor1'].'</br>';
		echo $dados['valor2'].'</br>';
		echo $dados['valor3'].'</br><hr>';

		var_dump($dados);
	}

	if (isset($_POST['enviar'] )){
		paramet_array($_POST);
	}
	?>

</body>
</html>