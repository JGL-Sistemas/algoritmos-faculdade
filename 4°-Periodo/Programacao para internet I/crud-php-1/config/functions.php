<?php

function getPessoa($nome, $cpf, $ci, $conexao){
	mysqli_query($conexao, "INSERT INTO pessoa(nome, cpf,ci,nascimento)
					  		VALUES ('$nome','$cpf','$ci','2018-05-01')");
}?>

<?php
function ImprimiPessoa($conexao){ ?>

	<div class="container-medio">
		<h2>Matriculados</h2>
		<p>Todos os alunos matriculados</p>
		<table>
		  <tr>
		    <th>Nome</th>
		    <th>Matricula</th>
		    <th>Identidade</th>
		    <th>Nacimento</th>
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
		  			  <td><?php echo $row["nascimento"] ?></td>
		  			</tr>
				<?php }
			} ?>
		</table>		
	</div>
<?php
}
?>