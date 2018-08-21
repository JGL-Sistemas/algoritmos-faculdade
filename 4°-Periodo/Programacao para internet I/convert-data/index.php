<!DOCTYPE html>
<html>
<head>
	<title>Coversor de data</title>
</head>
<body>

	<?php
		function dataExibir($data){
			$dia = substr($data, 8, 2);
			$mes = substr($data, 5, 2);
			$ano = substr($data, 0, 4);


			return $dia.'/'.$mes.'/'.$ano;
		}

		echo dataExibir("2018/08/21");



	?>



</body>
</html>