<?php

//servidor do banco de dados
$servidor = 'localhost';

//usuario do banco de dados 
$usuario  = 'root';

//senha do banco de dados 
$senha	  = '';

//nome do banco de dados 
$banco	  = 'escola';

//porta de entrada
$porta = '3366';

//hierarquia
	//servidor
		//usuario
			//senha
				//banco 
					//porta de entrada

//variavel recebe conexão do banco de dados 
$conexao = mysqli_connect($servidor, $usuario, $senha, $banco);


?>