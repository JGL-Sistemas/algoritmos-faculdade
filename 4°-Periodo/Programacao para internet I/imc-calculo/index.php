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
		Idade: <input type="text" name="idade"><br>
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
	$altura = $_POST["idade"];
	//pega retorno da função e atribui para a variavel 
	$resultado = calcula_imc($peso, $altura); 
	//imprime valor atribuido a variavel
	echo $resultado;
}

//final do php 
?>
</body>
</html>