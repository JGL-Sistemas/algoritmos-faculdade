<?php  session_start(); 
include ("conecta.php");	
$log =$_POST['loqin'];
$sen = shal($_POST['senha']);
$sql = "select cod_admin,nome from  administrar
where  login = '$log' 
and senha = '$sen'
and  status  =  '1' ";
$exe = mysqli_query($sql);
if($linha = mysql_fetch_array($exe)){
$_SESSION['usu_nome'] = $linha ['nome'];
$_SESSIOM['usu_cod']  =  $linha['cod_admin'];
echo  "<meta content='O;url=principal.php ' http-equiv='refresh'  />";
exit;
}
else{
session_destroy();
echo  "<hl> Loqin  ou  senha  não  confere !</hl>";
echo  "<meta content= '4;url=login.php' http-equiv= 'refresh'  />";
exit;
}
?>
