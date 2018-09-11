<!DOCTYPE html>
<html>
<head>
	<title> Nome atividade </title>
	<meta charset="utf-8">

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

	<!-- interação -->
	<script type="text/javascript">
		
	</script>

</head>

<!-- 
descrição da atividade
-->

<!-- linguadem de programação PHP -->
<?php

?>

<!-- corpo da pagina -->
<body>

	<div class="container-medio caixa">
		<ul>
			<li>Autor: Dieisson Martins</li>
			<li>Turma: Sistemas 4°-Periodo</li>
			<li>Data: 11/09/2018</li>
			<li>Diciplina: Programação para Web I</li>
		</ul>
	</div>
	
	<div class="container-largo caixa">
		<p>fineza deixar mensagem no portal que a reunião da Câmara Municipal será excepcionalmente realizada nesta quinta -feira com a seguinte pauta:</p>
	</div>
 
	<div class="container-pequeno">
		<form method="POST">
			
			<span class="descricao-input">texto</span><br>
			<input type="text" name="texto" placeholder="digite texto"><hr>

			<span class="descricao-input">texto</span><br>
			<input type="text" name="texto" placeholder="digite texto"><hr>

			<input type="submit" value="Enviar">
		</form>
	</div>

</body>
</html>