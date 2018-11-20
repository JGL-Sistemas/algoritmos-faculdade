<?php

require 'PHPMailer/PHPMailerAutoload.php';

$Mailer = new PHPMailer();

//Define que será usado SMTP
$Mailer->IsSMTP();

//Enviar e-mail em HTML
$Mailer->isHTML(true);

//Aceitar carasteres especiais
$Mailer->Charset = 'UTF-8';

//Configurações
$Mailer->SMTPAuth = true;
$Mailer->SMTPSecure = 'ssl';

//nome do servidor
$Mailer->Host = $_POST['servidor-origem'];

//Porta de saida de e-mail 
$Mailer->Port = 465;

//Dados do e-mail de saida - autenticação
$Mailer->Username = $_POST['email-origem'];
$Mailer->Password = $_POST['senha-origem'];

//E-mail remetente (deve ser o mesmo de quem fez a autenticação)
$Mailer->From = $_POST['email-origem'];

//Nome do Remetente
$Mailer->FromName = $_POST['pessoa-destino'];

//Assunto da mensagem
$Mailer->Subject = $_POST['titulo-destino'];

//Corpo da Mensagem
$Mailer->Body = $_POST['conteudo-destino'];

//Corpo da mensagem em texto
$Mailer->AltBody = $_POST['conteudo-corpo-destino'];

//Destinatario 
$Mailer->AddAddress($_POST['email-destino']);

if($Mailer->Send()){
	echo "E-mail enviado com sucesso";
}else{
	echo "Erro no envio do e-mail: " . $Mailer->ErrorInfo;
}
	
?>



