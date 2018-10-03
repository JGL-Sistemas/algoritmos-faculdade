
<?php

function getPessoa($nome, $cpf, $ci,$nacimento, $conexao){
	mysqli_query($conexao, "INSERT INTO pessoa(nome, cpf,ci,nascimento)
					  		VALUES ('$nome','$cpf','$ci','$nacimento')");

?>
<script type="text/javascript">
	location.replace("index.php");
</script>
<?php

}

function PessoaExcluir($id, $conexao){
	mysqli_query($conexao, "DELETE FROM `pessoa` WHERE `pessoa`.`id_pessoa` = '$id' ");

?>
<script type="text/javascript">
	location.replace("index.php");
</script>
<?php
	echo "Excluidor";
}

function PessoaEditar($id, $nome, $cpf,  $conexao, $ci, $nascimento){
	mysqli_query($conexao, "UPDATE `pessoa` SET `nome` = '$nome',`cpf` = '$cpf',`ci` = '$ci',`nascimento` = '$nascimento' WHERE `pessoa`.`id_pessoa` = '$id' ");

?>
<script type="text/javascript">
	location.replace("index.php");
</script>
<?php
}


?>

