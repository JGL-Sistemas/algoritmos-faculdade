<?php

function numerosOrdinais($valor){

	$ordinais = array(
		'1' 	=> 'primeiro',
		'2' 	=> 'segundo',
		'3' 	=> 'terceiro',
		'4' 	=> 'quarto',
		'5' 	=> 'quinto',
		'6' 	=> 'sexto',
		'7' 	=> 'sétimo',
		'8' 	=> 'oitavo',
		'9' 	=> 'nono',
		'10'	=> 'décimo',
		'20'	=> 'vigésimo',
		'30'	=> 'trigésimo',
		'40'	=> 'quadragésimo',
		'50'	=> 'quinquagésimo',
		'60'	=> 'sexagésimo',
		'70'	=> 'septuagésimo',
		'80'	=> 'octogésimo',
		'90'	=> 'nonagésimo',
		'100'	=> 'centésimo',
		'200'	=> 'ducentésimo',
		'300'	=> 'trecentésimo',
		'400'	=> 'quadrigentésimo',
		'500'	=> 'quingentésimo',
		'600'	=> 'sexcentésimo',
		'700'	=> 'septigentésimo',
		'800'	=> 'octigentésimo',
		'900'	=> 'nongentésimo',
		'1000'	=> 'milésimo',
		'2000'	=> 'Dois',
		'3000'	=> 'Três',
		'4000'	=> 'Quadro',
		'5000'	=> 'Cinco',
		'6000'	=> 'Seis'
	);

	$unidade 	= substr($valor, 3, 1) * 1;  
	$dezena  	= substr($valor, 2, 1) * 10;
	$centena 	= substr($valor, 1, 1) * 100; 
	$milhar		= substr($valor, 0, 1) * 1000;

/*
echo "</br>".$unidade ;  
echo "</br>".$dezena  ;  
echo "</br>".$centena ;  
echo "</br>".$milhar  ; 
*/

foreach ($ordinais as $numerico => $ordinal) {
	 ($centena == $numerico ) ? $centena = $ordinal :'';
	 ($dezena  == $numerico ) ? $dezena  = $ordinal :'';
	 ($unidade == $numerico ) ? $unidade = $ordinal :'';
	 ($milhar  == $numerico ) ? $milhar  = $ordinal :'';

	echo "{$milhar} {$centena} {$dezena} {$unidade} </br>";
}

}


numerosOrdinais(1243);


 ?>