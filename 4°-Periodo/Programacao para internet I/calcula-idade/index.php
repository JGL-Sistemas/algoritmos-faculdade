<!DOCTYPE html>
<html>
<head>
	<title>Caucula a sua idade</title>
</head>
<body>

	<form method="POST"> 
		<input type="text" name="nacimento">
		<input type="submit" value="Calcular idade">
	</form>

	<?php

		function calculaIdade($anonacimento){
			$idade = date('Y') - $anonacimento;

			return $idade;
		}

		if (isset( $_POST["nacimento"] )){
			$anonacimento = $_POST["nacimento"];
			echo "Voce tem ".calculaIdade($anonacimento)." anos de idade";
		}


	?>

</body>
</html>