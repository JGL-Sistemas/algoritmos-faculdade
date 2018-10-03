
<?php require_once'header.php'; ?>
<?php require_once'config/functions.php'; ?>
<?php require_once'config/conection.php';?>

	<?php 
	if(isset( $_POST['nome']) and isset( $_POST['salvar']) ){
		$nome       = $_POST['nome'];
		$cpf 		= $_POST['cpf'];
		$ci 		= $_POST['ci'];
		$nacimento 	= $_POST['nacimento'];
	getPessoa($nome, $cpf, $ci,$nacimento, $conexao);
	}

	if(isset( $_POST['nome']) and isset( $_POST['editar']) ){
		$id 		= $_GET['id'];
		$nome       = $_POST['nome'];
		$cpf 		= $_POST['cpf'];
		$ci 		= $_POST['ci'];
		$nascimento 	= $_POST['nacimento'];
	PessoaEditar($id, $nome, $cpf,  $conexao, $ci, $nascimento);
	}

	if(isset( $_GET['id']) and $_GET['acao'] =='excluir'){
		$id = $_GET['id'];
	PessoaExcluir($id,$conexao);
	}

	else if(isset( $_GET['id'])){
		$id       = $_GET['id'];
		$nome       = $_GET['nome'];
		$cpf        = $_GET['cpf'];
		$ci         = $_GET['ci'];
		$nascimento = $_GET['nascimento'];		
	}
	?>



<div class="container-grande">
		<h2>Matriculados</h2>
		<p>Todos os alunos matriculados</p>
		<table>
		  <tr>
		    <th>Nome</th>
		    <th>CPF</th>
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

		  			  <td><a href="index.php?id=<?php echo $row['id_pessoa'] ?>&nome=<?php echo $row['nome'] ?>&cpf=<?php echo $row['cpf'] ?>&ci=<?php echo $row['ci'] ?>&nascimento=<?php echo $row['nascimento'] ?>&acao=editar"><i class="fa fa-pencil" aria-hidden="true"></i></a></td>

		  			  <td><a href="index.php?id=<?php echo $row['id_pessoa'] ?>&acao=excluir"><i class="fa fa-times" aria-hidden="true"></i></a></td>
		  			</tr>
				<?php }
			} ?>
				<tr>
					<form method="POST">
		  		  		<td><input type="text" name="nome" placeholder="Digite nome" value="<?php echo (isset($nome)) ? $nome : '';?>"></td>
		  		  		<td><input type="number" name="cpf" placeholder="999999999" value="<?php echo (isset($cpf)) ? $cpf : '';?>"><br/></td>
		  		  		<td><input type="text" name="ci" placeholder="Digite identidade" value="<?php echo (isset($ci)) ? $ci : '';?>"><br/></td>
		  		  		<td><input type="date" name="nacimento" placeholder="99-99-9999" value="<?php echo (isset($nascimento)) ? $nascimento : '';?>"><br/></td>

		  		  		<?php echo $acaoo = (isset( $_GET['id'])) ? '<td><input type="submit" value="Salvar Edição" name="editar"></td>' : '<td><input type="submit" value="Adicionar Novo" name="salvar" ></td>'; ?>
		  		  		
					</form>
		  		</tr>
		</table>		
	</div>

</body>

