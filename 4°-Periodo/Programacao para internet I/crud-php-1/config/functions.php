<?php

function getPessoa($nome, $cpf, $ci, $conexao){
	mysqli_query($conexao, "INSERT INTO pessoa(nome, cpf,ci,nascimento)
					  		VALUES ('$nome','$cpf','$ci','2018-05-01')");
}?>
