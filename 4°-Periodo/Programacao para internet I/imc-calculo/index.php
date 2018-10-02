<!DOCTYPE html>
<!-- 
Desenvolver um programa em PHP que calcule 
o IMC de uma pessoa 
-->

<html>
<head>
	<title>CA-IMC</title>
	<!-- estilo-->
	<style type="text/css">
		.container-pequeno {
    		margin: 0 auto;
   		 	width: 400px;
   		 }
   		 .container-medio {
    		margin: 0 auto;
   		 	width: 600px;
   		 }
   		 .container-largo {
    		margin: 0 auto;
   		 	width: 800px;
   		 }
   		 .caixa{
   		 	padding: 1%;
    		border: 1px #e2e2e2 solid;
    		background: #eaeaea;
    		color: #6d6262;
    		margin-top:1%;	
   		 }
   		 .descricao-input{
   		 	color: #6d6262;
   			margin-left: 5px;
    		margin-top: 14px;
    		font-size: 25px;
   		 }
   		form{
   			width: 100%;
   		}
   		input{
   			padding: 3%;
    		width: 100%;
    		border: none;
    		margin: 1%;
    		background: #f3f3f3;
    		border-radius: 1%;
   		}
   		input[type="submit"]{
   			background: #ff8282;
    		color: #fff;
    		font-weight: bold;
    		width: 105.8%;
   		}
   		input[type="submit"]:hover{
   			background: #e88f8f;
   		}
   		hr{
   			margin-left: 4PX;
    		width: 105.4%;
    		height: 1px;
    		background: #d0d0d0;
    		border: none;
   		}
   		ul{
   		list-style-type: none;
   		}
	</style>
</head>
<body>

	<!-- Formulario de dados -->
	<div class="container-pequeno">
		<form method="POST"> 
			Peso: <input type="text" name="peso"><br>
			altura: <input type="text" name="altura"><br>
			Sexo:
			M<input type="checkbox" name="sexo" value="m">
			F<input type="checkbox" name="sexo" value="f">
			<input type="submit"  value="enviar">
		</form>
	</div>
	
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

function imc_masculino($resultado){
	//resultado final 
	if($resultado < 17){ echo"Muito Abaixo do peso";}
	else if($resultado > 17 and $resultado < 18.50){ echo"Abaixo do peso";}
	else if($resultado > 18.5 and $resultado < 24.99){ echo"Peso normal";}
	else if($resultado > 25 and $resultado < 29.99){ echo"Acima do peso";}
	else if($resultado > 30 and $resultado < 34.99){ echo"Obsidade";}
	else if($resultado > 35 and $resultado < 39.99){ echo"Obsidade II";}
}

function imc_feminino($resultado){
	//resultado final 
	if($resultado < 17){ echo"Muito Abaixo do peso";}
	else if($resultado > 17 and $resultado < 18.50){ echo"Abaixo do peso";}
	else if($resultado > 18.5 and $resultado < 24.99){ echo"Peso normal";}
	else if($resultado > 25 and $resultado < 29.99){ echo"Acima do peso";}
	else if($resultado > 30 and $resultado < 34.99){ echo"Obsidade";}
	else if($resultado > 35 and $resultado < 39.99){ echo"Obsidade II";}	
}

if( isset($_POST["peso"]) ){
//declara variavel com peso e altura 
	$peso 	= $_POST["peso"];
	$altura = $_POST["altura"];
	$sexo   = $_POST["sexo"];

	echo $sexo;
	//pega retorno da função e atribui para a variavel 
	$resultado = calcula_imc($peso, $altura); 
	//imprime valor atribuido a variavel
	echo $resultado.'<br>';

	//caso sexo seja m axecuta case se nao defalt
	switch ($sexo){
		//maculino
		case 1:
			imc_masculino($resultado);
		break;
		//feminino
		default:
			imc_feminino($resultado);
		break;
	}
}
//final do php 
?>
</body>
</html>


















