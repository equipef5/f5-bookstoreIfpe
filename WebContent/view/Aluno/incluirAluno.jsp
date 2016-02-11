<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="view/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="view/css/buscar.css" rel="stylesheet" media="screen">
<script src="view/js/jquery-latest.js"></script>
<script src="view/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Aluno</title>
</head>
<body>

	<!-- Title -->
	<nav class="navbar navbar-default"> </br>
	<div class="container-fluid">
		<div class="navbar-header">
			<img class="img-responsive " align="left"
				src="view/imagens/IFPE_imagem.png"
				style="width: 380; height: 105px;">
			<h3 align="right"
				style="font-family: arial black; font-size: x-larger;">BOOKSTORE
			</h3>
			<br />
		</div>

	</div>
	</nav>
	<!-- end  -->
	<!-- menu  -->
	<div align="left">
		<div class="col-md-3 column margintop20">
			<ul class="nav nav-pills nav-stacked">

				<li class="active"><a href="#"><span
						class="glyphicon glyphicon-chevron-right"></span>Biblioteca</a></li>

				<li><a href="exibirCadastrarLivro"><span
						class="glyphicon glyphicon-chevron-right"></span>Cadastrar livro</a></li>

				<li><a href="exibirCadastrarAluno" class="active2"><span
						class="glyphicon glyphicon-chevron-right"></span>Cadastrar aluno</a></li>

				<li><a href="exibirGerenciarLivro"><span
						class="glyphicon glyphicon-chevron-right"></span>Gerenciar livro</a></li>

				<li><a href="exibirGerenciarAluno"><span
						class="glyphicon glyphicon-chevron-right"></span>Gerenciar aluno</a></li>

			</ul>
		</div>
	</div>
	<!-- end  -->

	<!--Form -->

	<div align="center" style="margin-left: 20px">
		<div class="container">
			<div class="form-group">
				<h2>Cadastro de aluno</h2>
				<form action="incluirAluno" method="post">


				<b> Nome Completo: </b> <br> <input type="text" name="nome" size="50px" placeholder="Nome Completo"> <br> <br> <b>
				    Cpf: </b> <br> <input type="text" name="cpf" size="50" placeholder="Cpf"> <br> <br> <b> &nbsp; &nbsp;
                    Telefone: </b> <br> <input type="text" name="telefone" size="50" class="input2"  placeholder="Telefone" style="margin-left:20% "> <br><br> <b> &nbsp; &nbsp;
                  <font> E-mail:</font></b> <br> <input type="text" name="email" size="50"  class="input2 " placeholder="E-mail" style="margin-left:20% "><br> <br> <b>
	             <font > Matrícula:</font></b> <br> <input type="text" name="matricula" size="50" class="input2" style="" placeholder="Matrícula" style="margin-left:20%" > <br> <br>


					<p>
						<br />&nbsp; &nbsp; &nbsp;&nbsp;
						<button type="submit" class="btn btn-primary button2"
							onclick="alert('Aluno Cadastrado!')">
							<span class="glyphicon glyphicon-user"></span> Cadastrar
						</button>
						&nbsp; &nbsp;&nbsp;
						<button type="submit" class="btn btn-primary">
							<span class="glyphicon glyphicon-arrow-right"></span> Sair
						</button>
				</form>

			</div>
		</div>
	</div>
	<!-- end  -->
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>


	<div align="center">BookstoreIfpe por EquipeF5</div>
</body>
</html>