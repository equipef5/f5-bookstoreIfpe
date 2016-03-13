<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="view/css/buscar.css">
<link rel="stylesheet" type="text/css" href="view/css/menu.css">
<link rel="stylesheet" type="text/css" href="view/css/biblioteca.css">
<link rel="stylesheet" type="text/css" href="view/css/footer.css">
<link href="view/css/bootstrap.min.css" rel="stylesheet" media="screen">
<script src="view/js/jquery-latest.js"></script>
<script src="view/js/bootstrap.min.js"></script>
<script src="view/js/jquery.min.js"></script>
<script src="view/js/table.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Biblioteca</title>
</head>
<body>


	<nav class="navbar navbar-default">
	<div style="float: right">
		</br> </br>
	</div>
	<ul class="nav pull-right" style="margin-right: 80px;">
		<li class="dropdown"><a href="#" class="dropdown-toggle"
			data-toggle="dropdown"><span class="glyphicon glyphicon-cog"></span>
				<b class="caret"></b></a>
			<ul class="dropdown-menu">
				<li><a href="exibirIncluirAdministrador"><i class="glyphicon glyphicon-user"></i></a></li>
				<li><a href="exibirAlterarSenha"><i class="glyphicon glyphicon-pencil"></i> </a></li>
				<li class="divider"></li>
				<li><a href="logout"><i class="glyphicon glyphicon-off"></i>
						Logout</a></li>
			</ul></li>
	</ul>

	<div class="container-fluid">
		</br>
		<div class="navbar-header"> <img align="left" src="view/imagens/IFPE_imagem.png" style="width: 380; height: 105px;">
			<h3 align="right" style="font-family: arial black; font-size: x-larger">Library</h3>
		</div>


	</div>

	</nav>
	<!-- end  -->
	<!-- Menu -->

	<div class="col-md-3 sidenav ">
		<ul class="nav navbar nav-stacked">

			<li class="ativo"><a href="exibirBiblioteca"><span
					class="glyphicon glyphicon-chevron-right "></span>Biblioteca</a></li>

			<li class="ativo2"><a href="exibirCadastrarLivro"><span
					class="glyphicon glyphicon-chevron-right "></span>Cadastrar Livro</a></li>

			<li class="ativo2"><a href="exibirCadastrarAluno"
				class="active2"><span class="glyphicon glyphicon-chevron-right "></span>Cadastrar Usuário</a></li>

			<li class="ativo2"><a href="exibirGerenciarLivro"><span
					class="glyphicon glyphicon-chevron-right "></span> Gerenciar Livros</a></li>

			<li class="ativo2"><a href="exibirGerenciarAluno"><span
					class="glyphicon glyphicon-chevron-right "></span>Gerenciar Usuários</a></li>

			<li class="ativo2"><a href="exibirListaEmprestimo"><span
					class="glyphicon glyphicon-chevron-right "></span>Gerenciar Emprétimos</a></li>


		</ul>
	</div>

	<!-- end -->




	<div class="col-md-3">
		<div style="margin-left: 490px">

			<form action="pesquisarLivro" method="post">
				<div class="input-group">
					<input id="system-search" name="q" placeholder="Search for"
						required><span class="input-group-btn"><button
							type="submit" class="btn btn-sucess ">
							<i class="glyphicon glyphicon-search"></i>
						</button> </span>
				</div>
				<br> <br>
			</form>
		</div>
	</div>

		<div class="col-md-9">
	
	<c:forEach var="livro" items="${listarLivrosE}">
	
	
      <div class="col-md-4">  
       <div class="container" id="tourpackages-carousel">
      
      <div class="row">
        
        <div class="col-xs-18 col-sm-6 col-md-3">
          <div class="thumbnail">
            <img src="view/imagens/${livro.imagem}" width="500%"
			  class="img-rounded">
              <div class="caption">
                <h4>${livro.titulo}</h4>
                <p>${livro.autor}</p>
                <p><a href="exibirEmprestimoLivro?titulo=${livro.titulo}"> <button type="submit" class="btn btn-primary"> <span class="icon-pencil"></span> Empréstimo
						</button></p>
            </div>
          </div>
        </div>
       </div>
       </div>
       </div>
       	</c:forEach>
       	</div>

		
	<div class="col-md-12">
		<footer id="footer">
		<p align="center">BookstoreIfpe por EquipeF5</p>
		</footer>
	</div>

</body>
</html>