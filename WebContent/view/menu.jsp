<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <!-- Title -->
	<nav class="navbar navbar-default">
		<!-- link para o login -->
		<div style="float: right;">
			</br>
			</br>
			</br> <a  style="font-size: 16" href="login.jsp"><h4>Sair</h4></a>
		</div>
		<!-- link para o login -->
		<div class="container-fluid">
			<div class="navbar-header">
				<img align="left" src="imagens/IFPE_imagem.png"
					style="width: 380; height: 105px;">
				<h3 align="right"
					style="font-family: arial black; font-size: x-larger;">BOOKSTORE
				</h3>
			</div>

		</div>
	</nav>
<!-- end -->

	<!-- menu -->



	<div class="col-md-3 column margintop20">
		<ul class="nav nav-pills nav-stacked">
			
			<li class="active"><a href="#"><span class="glyphicon glyphicon-chevron-right"></span>Biblioteca</a></li>
			
			<li><a href="incluirLivro.jsp"><span class="glyphicon glyphicon-chevron-right"></span>Cadastrar livro</a></li>
			
			<li><a href="incluirAluno.jsp" class="active2"><span class="glyphicon glyphicon-chevron-right"></span>Cadastrar aluno</a></li>
			
			<li><a href="#"><span class="glyphicon glyphicon-chevron-right"></span> Buscar livro</a></li>
			
			<li><a href="#"><span class="glyphicon glyphicon-chevron-right"></span>Buscar aluno</a></li>

		</ul>
	</div>
<!-- end -->
	<div class="container " style="height: 940px;width: 130px">
		
					<div class="container">
						<h2>Campus Jaboat�o dos Guararapes</h2>
						<img src="imagens/livros_imagem.jpg" class="img-thumbnail"
							alt="Cinque Terre" width="50%" height="50%">
					</div> 

					</div>
				
</body>
</html>