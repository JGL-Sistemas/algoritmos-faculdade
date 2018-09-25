
<?php require_once'header.php'; ?>
<?php require_once'config/functions.php'; ?>
<?php require_once'config/conection.php';?>

	<?php 
	if(isset( $_POST['nome'] )){
		$nome       = $_POST['nome'];
		$cpf 		= $_POST['cpf'];
		$ci 		= $_POST['ci'];
	
	getPessoa($nome, $cpf, $ci, $conexao);
	}
	?>

	<div class="container-pequeno">
		<form method="POST">
			<span>Nome:</span>
			<input type="text" name="nome" placeholder="digite nome"><br/>

			<span>Cpf:</span>
			<input type="text" name="cpf" placeholder="digite cpf"><br/>

			<span>Identidade:</span>
			<input type="text" name="ci" placeholder="digite identidade"><br/>

			<!--<span>Nascimento:</span>
			<input type="date" name="nascimento"><br/>-->

			<input type="submit" value="Enviar">
		</form>
	</div>

<?php ImprimiPessoa($conexao);?>

</body>
</html>