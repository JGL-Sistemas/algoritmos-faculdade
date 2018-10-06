<?php

function numerosOrdinais($valor){
	
	$unidades = array(
		'0' 	=> '',
		'1' 	=> 'primeiro',
		'2' 	=> 'segundo',
		'3' 	=> 'terceiro',
		'4' 	=> 'quarto',
		'5' 	=> 'quinto',
		'6' 	=> 'sexto',
		'7' 	=> 'sétimo',
		'8' 	=> 'oitavo',
		'9' 	=> 'nono'
	);
	$dezenas = array(
		'0' 	=> '',
		'10'	=> 'décimo',
		'20'	=> 'vigésimo',
		'30'	=> 'trigésimo',
		'40'	=> 'quadragésimo',
		'50'	=> 'quinquagésimo',
		'60'	=> 'sexagésimo',
		'70'	=> 'septuagésimo',
		'80'	=> 'octogésimo',
		'90'	=> 'nonagésimo'
	);
	$centenas = array(
		'0' 	=> '',
		'100'	=> 'centésimo',
		'200'	=> 'ducentésimo',
		'300'	=> 'trecentésimo',
		'400'	=> 'quadrigentésimo',
		'500'	=> 'quingentésimo',
		'600'	=> 'sexcentésimo',
		'700'	=> 'septigentésimo',
		'800'	=> 'octigentésimo',
		'900'	=> 'nongentésimo'
	);
	$milhares = array(
		'0' 	=> '',
		'1000'	=> 'milésimo',
	);

	if($valor <= 9){
		$unidadeValor = substr($valor, 0, 1) * 1;
		foreach($unidades as $numericoUnidade => $unidade) {
			$numericoUnidade." ".$unidade."<br>";
			 ($unidadeValor == $numericoUnidade) ? $unidadeValor = $unidade :'';
		}		
		echo "{$unidadeValor}";
		return;

	}else if($valor <= 99){
		
		echo "</br>".$unidadeValor = substr($valor, 1, 1) * 1;    
		echo "</br>".$dezenaValor  = substr($valor, 0, 1) * 10;

		foreach($unidades as $numericoUnidade => $unidade) {
			 ($unidadeValor == $numericoUnidade) ? $unidadeValor = $unidade :'';
		}
		foreach($dezenas as $numericoDezena => $dezena) {
			 ($dezenaValor == $numericoDezena) ? $dezenaValor = $dezena :'';
		}
		echo "{$dezenaValor} {$unidadeValor}";
		return;
	
	}else if($valor <= 999){
		
		echo $unidadeValor = substr($valor, 2, 1) * 1;    
		echo "</br>".$dezenaValor  = substr($valor, 1, 1) * 10;
		echo "</br>".$centenaValor = substr($valor, 0, 1) * 100; 

		foreach($unidades as $numericoUnidade => $unidade) {
			echo "<br>".$numericoUnidade." ".$unidade."<br>";
			 ($unidadeValor == $numericoUnidade) ? $unidadeValor = $unidade :'';
		}
		foreach($dezenas as $numericoDezena => $dezena) {
			echo $numericoDezena." ".$dezena."<br>";
			 ($dezenaValor == $numericoDezena) ? $dezenaValor = $dezena :'';
		}
		foreach($centenas as $numericoCentena => $centena) {
			echo $numericoCentena." ".$centena."<br>";
			 ($centenaValor == $numericoCentena) ? $centenaValor = $centena :'';
		}
		echo "{$centenaValor} {$dezenaValor} {$unidadeValor}";
		return;

	}else if($valor == 1000){

		$unidadeValor = substr($valor, 3, 1) * 1;    
		$dezenaValor  = substr($valor, 2, 1) * 10;
		$centenaValor = substr($valor, 1, 1) * 100; 
		$milharValor =  substr($valor, 0, 1) * 1000;

		foreach($unidades as $numericoUnidade => $unidade) {
			echo "<br>".$numericoUnidade." ".$unidade."<br>";
			 ($unidadeValor == $numericoUnidade) ? $unidadeValor = $unidade :'';
		}
		foreach($dezenas as $numericoDezena => $dezena) {
			echo $numericoDezena." ".$dezena."<br>";
			 ($dezenaValor == $numericoDezena) ? $dezenaValor = $dezena :'';
		}
		foreach($centenas as $numericoCentena => $centena) {
			echo $numericoCentena." ".$centena."<br>";
			 ($centenaValor == $numericoCentena) ? $centenaValor = $centena :'';
		}
		foreach($milhares as $numericoMilhar => $milhar) {
			echo $numericoMilhar." ".$milhar."<br>";
			 ($milharValor == $numericoMilhar) ? $milharValor = $milhar :'';
		}

		echo $milharValor." ".$centenaValor." ".$dezenaValor." ".$unidadeValor;
		return;
	
	}else if($valor > 1000){
	 	echo "valor tem que ser menor que 1000";
	 	return;
	 }


}

numerosOrdinais(1000);
//numerosOrdinais(80);


 ?>