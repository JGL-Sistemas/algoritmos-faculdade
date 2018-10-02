<?php

function mesnumero($valor){

	$meses = array(
		1  => "Janeiro",
		2  => "Fevereiro",
		3  => "Março",
		4  => "Abril",
		5  => "Maio",
		6  => "Junho",
		7  => "Julho",
		8  => "Agosto",
		9  => "Setembro",
		10 => "Outubro",
		11 => "Novembro",
		12 => "Dezembro"
	);

	//var_dump($meses);

	foreach ($meses as $numero => $mes){
		
		if($valor === $numero) $valor = $mes;
		else if($valor === $mes) $valor = $numero;
	}

	return $valor;
}

echo mesnumero(10);



?>