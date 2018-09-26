
<?php require_once'header.php'; ?>
<?php require_once'config/functions.php'; ?>
<?php require_once'config/conection.php';?>

	<?php 
	if(isset( $_POST['nome'] )){
		$nome       = $_POST['nome'];
		$cpf 		= $_POST['cpf'];
		$ci 		= $_POST['ci'];
	
	//getPessoa($nome, $cpf, $ci, $conexao);
	}
	?>

<div class="container-grande">
		<h2>Matriculados</h2>
		<p>Todos os alunos matriculados</p>
		<table>
		  <tr>
		    <th>Nome</th>
		    <th>Matricula</th>
		    <th>Identidade</th>
		    <th>Nacimento</th>
		    <th>Editar</th>
		    <th>Excluir</th>
		  </tr>
		  <?php
		  $sql = "SELECT * FROM pessoa";
		  $resultado = mysqli_query($conexao, $sql);

		  	if (mysqli_num_rows($resultado) > 0) {
		    	while($row = mysqli_fetch_assoc($resultado)) { ?>
		  			<tr>
		  			  <td><?php echo $row["nome"] ?></td>
		  			  <td><?php echo $row["cpf"] ?></td>
		  			  <td><?php echo $row["ci"] ?></td>
		  			  <td ><?php echo $row["nascimento"] ?></td>
		  			  <td><a href="#"><i class="fa fa-pencil" aria-hidden="true"></i></a></td>
		  			  <td><a href="#"><i class="fa fa-times" aria-hidden="true"></i></a></td>
		  			</tr>
				<?php }
			} ?>
				<tr>
					<form method="POST">
		  		  		<td><input type="text" name="nome" placeholder="Digite nome"></td>
		  		  		<td><input type="text" name="cpf" placeholder="Digite cpf"><br/></td>
		  		  		<td><input type="text" name="ci" placeholder="Digite identidade"><br/></td>
		  		  		<td><input type="text" name="nacimento" placeholder="Digite nacimento"><br/></td>
		  		  		<td><input type="submit" value="Adicionar Novo"></td>

					</form>
		  		</tr>
		</table>		
	</div>

</body>
</html>