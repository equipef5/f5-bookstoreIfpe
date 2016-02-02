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
	<nav class="navbar navbar-default"> <br />
	<div class="container-fluid">
		<div class="navbar-header">
			<img class="img-responsive " align="left" src="imagens/IFPE_imagem.png" style="width: 380; height: 105px;">
			<h3 align="right" style="font-family: arial black; font-size: x-larger;">BOOKSTORE
			
			</h3>
			
			<br />
		
		</div>

	</div>
	</nav>
<!-- end  -->
	
	<!-- Menu -->
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
<!-- end -->
      <!-- Form -->
 <div align="center">
	<div class="container">
	<h2>Cadastro de Livro</h2>
	<form role="form" action="incluirAluno" method="post">
			<div class="form-group">

	  <b> Título: </b> <br>
	  <input type = "text" name = "titulo" size="50" placeholder="Título"> <br> <br>
	  
	  <b> Autor: </b> <br>
	  <input type = "text" name = "autor" size="50" placeholder="Autor"> <br> <br>
	  
	  <b> Editora: </b> <br>
	  <input type = "text" name = "editora" size="50" placeholder="Editora"> <br> <br>
	  
	  <b> Ano de Lançamento:</b> <br>
	  <input type = "text" name = "ano" size="50" placeholder="Ano de Lançamento"> <br> <br>
	  
	  <b> Quantidade de Livros: </b> <br>
	  <input type = "text" name = "imagem" size="50" placeholder="Quantidade"> <br> <br>
	  
	  <b> Imagem: </b> <br>
	  <input type = "file" name = "file" size="50" placeholder="Imagem"> <br> <br>
	  
	 
	 <p>
				 <a href="#" onclick="alert('Livro Cadastrado!')"  class="btn btn-primary btn-default"><span class="glyphicon glyphicon-book"></span> Cadastrar</a>
    
				 
						 &nbsp; &nbsp; <a href="menu.jsp"   class="btn btn-primary btn-default"><span class="glyphicon glyphicon-arrow-right"></span> Sair</a>				</p>

			</div>
		</form>
	</div>
	</div>
 
  <!-- end -->
 <br> <br> <br> <br> <br> <br> <br> <br> <br> <br>

 <div align = "center" >
    BookstoreIfpe por EquipeF5
 </div>

</body>
</html>