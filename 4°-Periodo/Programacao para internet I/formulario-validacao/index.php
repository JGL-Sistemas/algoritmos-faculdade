
<!DOCTYPE HTML>  
<html>
  <head>
    <title>Validação de Formulario</title>
    <meta charset="utf-8"> 
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
  </head>
<body>  

<?php
$name = $email = $gender = $comment = $website = "";

if ($_SERVER["REQUEST_METHOD"] == "POST") {
  $name    = valida_input($_POST["name"]);
  $email   = valida_input($_POST["email"]);
  $website = valida_input($_POST["website"]);
  $comment = valida_input($_POST["comment"]);
  $gender  = valida_input($_POST["gender"]);
}

function valida_input($data) {
  $data = trim($data);
  $data = stripslashes($data);
  $data = htmlspecialchars($data);
  return $data;
}
?>
<div class="container">
  <h3>Modelo validação em PHP</h3><hr>
  <form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
    <div class="form-group">
        <label for="name">Nome: </label>
        <input type="text" name="name" class="form-control" id="name">
    </div>
    <div class="form-group">
        <label for="email">E-mail: </label>
        <input type="text" name="email" class="form-control" id="email">
    </div>
    <div class="form-group">
        <label for="website">Website: </label>
        <input type="text" name="website" class="form-control" id="website">
    </div>
    <div class="form-group">
        <label for="website">Comentário: </label>
        <textarea name="comment" rows="5" cols="40" class="form-control"></textarea>
    </div>  
    <div class="form-group"> 
        <label>Sexo: </label>
        <input type="radio" name="gender" value="female">Feminino
        <input type="radio" name="gender" value="male">Masculino
    </div>
    <button type="submit" name="submit" class="btn btn-default">Enviar</button>
  </form>
</div>

<div class="container">
  <h3>Comprovante</h3>
  <table class="table table-bordered">
    <thead>
      <tr>
        <th>Nome</th>
        <th>Email</th>
        <th>Website</th>
        <th>Comentario</th>
        <th>Sexo</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td><?php echo $name; ?></td>
        <td><?php echo $email; ?></td>
        <td><?php echo $website; ?></td>
        <td><?php echo $comment; ?></td>
        <td><?php echo $gender; ?></td>
      </tr>
    </tbody>
  </table>
</div>

</body>
</html>