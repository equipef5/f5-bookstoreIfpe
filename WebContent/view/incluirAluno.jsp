<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Aluno</title>
</head>
<body>

	<!-- Title -->
	<nav class="navbar navbar-default"> </br>
	<div class="container-fluid">
		<div class="navbar-header">
			<img class="img-responsive " align="left"
				src="imagens/IFPE_imagem.png" style="width: 380; height: 105px;">
			<h3 align="right"
				style="font-family: arial black; font-size: x-larger;">BOOKSTORE
			</h3>
			</br>
		</div>

	</div>
	</nav>
<!-- end  -->
        <!-- menu  -->
	<div align="left">
	<div class="col-md-3 column margintop20">
		<ul class="nav nav-pills nav-stacked">
			
			<li class="active"><a href="#"><span class="glyphicon glyphicon-chevron-right"></span>Biblioteca</a></li>
			
			<li><a href="incluirLivro.jsp"><span class="glyphicon glyphicon-chevron-right"></span>Cadastrar livro</a></li>
			
			<li><a href="incluirAluno.jsp" class="active2"><span class="glyphicon glyphicon-chevron-right"></span>Cadastrar aluno</a></li>
			
			<li><a href="#"><span class="glyphicon glyphicon-chevron-right"></span> Buscar livro</a></li>
			
			<li><a href="#"><span class="glyphicon glyphicon-chevron-right"></span>Buscar aluno</a></li>

		</ul>
	</div>
	</div>
<!-- end  -->

	<!--Form -->
	
	<div align="center">
	<div class="container">
		<h2>Cadastro de aluno</h2>
		<form role="form" action="incluirAluno" method="post">
			<div class="form-group">

            <b> Nome completo: </b> <br> <input type="text" name="nome"size="50px" placeholder="Nome"> <br> <br> <b>
			    CPF: </b> <br> <input type="text" name="cpf" size="50"   placeholder="Cpf"> <br> <br> <b>
 &nbsp; &nbsp; Telefone: </b> <br> <input type="text" name="telefone" size="50" placeholder="Telefone"> <br> <br> <b> 
				E-mail:</b> <br> <input type="text" name="email" size="50"placeholder="E-mail"> <br> <br> <b>
				Matrícula: </b> <br> <input type="text" name="matricula" size="50"placeholder="Matrícula">
				<br> <br>


				<p>
				 <a href="#" onclick="alert('Aluno Cadastrado!')"  class="btn btn-primary btn-default"><span class="glyphicon glyphicon-user"></span> Cadastrar</a>
    
				 
						 &nbsp; &nbsp; <a href="menu.jsp"   class="btn btn-primary btn-default"><span class="glyphicon glyphicon-arrow-right"></span> Sair</a>				</p>

			</div>
		</form>
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
	<br>
	<br>
	<br>

	<div align="center">BookstoreIfpe por EquipeF5</div>
</body>
</html>