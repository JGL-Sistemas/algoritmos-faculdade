<?php 
session_start();

//$servername = "localhost";
//$username 	= "root";
//$password 	= "";
//
//$conn = mysqli_connect($servername, $username, $password);
//$select = mysqli_select_db("sistema") or die("Sem acesso ao DB, Entre em contato com o Administrador, gilson_sales@bytecode.com.br");

//if (!$conn){
//    die("Falha na conexão: " . mysqli_connect_error());
//}


$login = $_POST['login'];
$senha = $_POST['senha'];
$l = 'dieisson';
$s = '1234';
echo "Conectado";
 
//$result = mysqli_query("SELECT * FROM `USUARIO` WHERE `NOME` = '$login' AND `SENHA`= '$senha'");

if(/*mysqli_num_rows ($result) > 0 */ $login == $l and $senha == $s ){
	$_SESSION['login'] = $login;
	$_SESSION['senha'] = $senha;
	header('location:site.php');
}
else{
	unset ($_SESSION['login']);
	unset ($_SESSION['senha']);
	header('location:index.php');  
}

?>