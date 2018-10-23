<!DOCTYPE html>
<html>
<head>
	<title>Sistema</title>
	<meta charset="utf-8">
	<style type="text/css">
		hr{
			border: none;
    		height: 0.7px;
    		background: #d6d6d680;
		}
		span{
			color: #fff;
		}	
		body{
			padding: 8% 0 0;
		}
		.container-form-login{
			width: 361px;
    		padding: 30px 18px 17px 18px;
    		height: auto;
    		margin: 0 auto;
    		background: #009688;
    		border-radius: 3px;
    		box-shadow: 0 1px 3px rgba(0, 0, 0, 0.61);
		}
		.form-login  input[type="submit"]{
			background: #fff;
    		padding: 7px;
    		border: none;
    		margin-top: 10px;
    		border-radius: 3px;
		}
		.form-login div input[type="text"],.form-login div input[type="password"]{
			border: none;
    		padding: 6px 0px 6px 7px;
    		border-radius: 3px;
    		font-size: 16px;
    		width: 100%;
		}
		.logo-login{
			text-align: center;
		}
		.logo-login figure img{
			width: 57px;
    		height: auto;
		}
	</style>
</head>
	<body>
		<div class="container-form-login">
			<div class="logo-login">
				<figure>
					<img src="https://about.canva.com/pt_br/wp-content/uploads/sites/3/2016/08/logos-1.png">
				</figure>
			</div><hr>
			<form method="post" action="ope.php" id="formlogin" name="formlogin" class="form-login" >
				<div>
					<span>Nome de usuário:</span></br>
					<input type="text" name="login" id="login"/>
				</div>
				<div>
					<span>Senha:</span></br>
					<input type="password" name="senha" id="senha">
				</div>
				<input type="submit" value="Login">
			</form>
		</div>
	</body>
</html>
