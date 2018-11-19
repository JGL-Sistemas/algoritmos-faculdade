<!DOCTYPE html>
<html>
<head>
	<title>Trabalho de Redes</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		</br>
  		<h2>SMTP demonstração</h2>
		<p>O SMTP é usado quando o e-mail é enviado de um cliente de e-mail, como o Outlook, ThunderBird ou Mail, para um servidor de e-mail ou quando o e-mail é enviado de um servidor de e-mail para outro. POP3 significa Post Office Protocol.</p><hr>
  <form action="enviar_email.php">
    <div class="form-group">
      <label for="email">Email de Origem:</label>
      <input type="email" class="form-control" name="email-origem" value="origem@dieissonmartins.com.br">
    </div>
    <div class="form-group">
      <label for="pwd">Senha do Email de Origem:</label>
      <input type="password" class="form-control" name="senha-origem" value="origem">
    </div><hr>
    <div class="form-group">
      <label for="email">Email de Destino:</label>
      <input type="email" class="form-control" name="email-destino" value="destino@dieissonmartins.com.br">
    </div><hr>
    <div class="form-group">
      <label for="nome">Nome Pessoa Destino:</label>
      <input type="text" class="form-control" name="pessoa-destino" value="Dieisson Martins">
    </div><hr>
    <div class="form-group">
      <label for="titulo">Titulo do Email de Destino:</label>
      <input type="text" class="form-control" name="titulo-destino" value="E-mail Enviado com Protocolo SMTP">
    </div><hr>
    <div class="form-group">
      <label for="conteudo">Conteúdo do Email de Destino:</label>
      <textarea  class="form-control" name="conteudo-destino">conteudo
      </textarea>
    </div><hr>
    <div class="form-group">
      <label for="conteudo">Corpo do Email de Destino:</label>
      <textarea  class="form-control" name="conteudo-corpo-destino">conteudo corpo
      </textarea>
    </div><hr>
    <div class="form-group">
      <label for="host">Servidor:</label>
      <input type="text" class="form-control" name="servidor-origem" value="br818.hostgator.com.br">
    </div><hr>
    <div class="form-group">
      <label for="porta">Porta:</label>
      <input type="text" class="form-control" name="email-destino" value="465">
    </div><hr>

    <button type="submit" class="btn btn-default">Enviar via SMTP</button></br></br></br>
  </form>
</div>

</body>
</html>