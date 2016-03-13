<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="t1.css">
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
<script src="js/jquery-latest.js"></script>
<script src="js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style=" background:#D4EEC3">
		<nav class="navbar navbar-default"> 
		<div style="float: right;">
			</br> </br>

		</div>
		
		<div class="container-fluid">
			</br>
			<div class="navbar-header">
				<img align="left" src="imagens/IFPE_imagem.png"
					style="width: 380; height: 105px;">
				<h3 align="right"
					style="font-family: arial black; font-size: x-larger">BOOKSTORE
				</h3>
			</div>

		</div>
		</nav>
	</div>
	<div class="container">

		<div id="loginbox"
			class="mainbox col-md-5 col-md-offset-3 col-sm-5 col-sm-offset-3">

			<div class="row"></div>

			<div class="panel panel-default" style="margin-left: 33px">
				<div class="panel-heading">
					<div class="panel-title text-center">
						<p style="font-family: console; size: 14; color: green">LOGIN</p>
					</div>
				</div>

				<div class="panel-body">

					<form name="form" id="form" class="form-horizontal"
						enctype="multipart/form-data" method="POST">

						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-user"></i></span> <input id="user"
								type="text" class="form-control" name="user" value=""
								placeholder="Usuário">
						</div>

						<div class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-lock"></i></span> <input id="password"
								type="password" class="form-control" name="password"
								placeholder="Senha">
						</div>

						<div class="form-group">
							<!-- Button -->
							<div class="col-sm-12 ">

								<button type="submit" href="#"
									class="btn btn-success pull-right">
									<i class="glyphicon glyphicon-ok"></i> ok
								
								</button>
								<button  type="reset" 
									class="btn btn-success pull-left">
								
								<i  class="glyphicon  glyphicon-erase  "></i>Apagar
								</button>
								
								<a href="#"></br></br>
									<h4 style="font-family: console; size: 45; color: green">Não é cadastrado?</h4>
								</a>
							</div>
					</form>

				</div>
			</div>
		</div>

	<div align="center"  style="background: f7f7f7">
	
	<footer><p style="color: green"> @bookstore desenvolvido pela equipe f5 <footer>
	</div>
</body>
</html>