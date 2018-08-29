<!DOCTYPE html>
<!-- 
Desenvolver um programa em PHP que calcule 
o IMC de uma pessoa 
-->

<html>
<head>
	<title>CA-IMC</title>
</head>
<body>
	<!-- Formulario de dados -->
	<form method="POST"> 
		Peso: <input type="text" name="peso"><br>
		altura: <input type="text" name="altura"><br>
		Sexo:
		<select>
			<option>M</option>
			<option>F</option>
		</select><br>
		<input type="submit"  value="enviar">
	</form>
	
	<?php
/*
 Programa em php calcule que calcule o imc de uma pessoa 
*/

//inicio da funcao 
function calcula_imc($peso, $altura){
	//calcura resultado 
	$resultado = $peso / ($altura * $altura);

	//retorna resultado
	return $resultado; 

}

if( isset($_POST["peso"]) ){
//declara variavel com peso e altura 
	$peso 	= $_POST["peso"];
	$altura = $_POST["altura"];
	//pega retorno da função e atribui para a variavel 
	$resultado = calcula_imc($peso, $altura); 
	//imprime valor atribuido a variavel
	echo $resultado.'<br>';

	//resultado final 
	if($resultado < 17){ echo"Muito Abaixo do peso";}
	else if($resultado > 17 and $resultado < 18.50){ echo"Abaixo do peso";}
	else if($resultado > 18.5 and $resultado < 24.99){ echo"Peso normal";}
	else if($resultado > 25 and $resultado < 29.99){ echo"Acima do peso";}
	else if($resultado > 30 and $resultado < 34.99){ echo"Obsidade";}
	else if($resultado > 35 and $resultado < 39.99){ echo"Obsidade II";}
}



//final do php 
?>
</body>
</html>


















