<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<link rel="stylesheet" type="text/css" href="view/css/buscar.css">
	<link rel="stylesheet" type="text/css" href="view/css/menu.css">
	<link rel="stylesheet" type="text/css" href="view/css/footer.css">
	<link href="view/css/bootstrap.min.css" rel="stylesheet" media="screen">
	<script src="view/js/jquery-latest.js"></script>
	<script src="view/js/bootstrap.min.js"></script>
	<script src="view/js/jquery.min.js"></script>
	<script src="view/js/table.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Empréstimo</title>
</head>
<body>


	<nav class="navbar navbar-default">
	<div style="float: right"> </br> </br>
    </div>
    
    <div class="container-fluid"> </br>
	<div class="navbar-header">
			
	  <img align="left" src="view/imagens/IFPE_imagem.png" style="width: 380; height: 105px;">
	    <h3 align="right" style="font-family: arial black; font-size: x-larger">BOOKSTORE </h3>
	</div>

    <div style="float: right; margin-right: 20px;">
	  <button type="button" class="btn dropdown-toggle" data-toggle="dropdown" style="background-color: #51c951; color: white">
		<span class="glyphicon glyphicon-user"></span>Administrador <span class="caret"></span>
	  </button>

		<ul class="menudesce" role="menu">
			<li><a href="exibirIncluirAdministrador">Cadastrar Novo</a></li>
			<li><a href="exibirAlterarSenha">Trocar Senha</a></li>
			<li class="divider"></li>
			<li><a href="logout">Logout</a></li>
		</ul>

	</div>
	</div>
	</nav>
		<!-- end  -->
	<!-- Menu -->

	<div class="col-md-3 sidenav ">
	  <ul class="nav navbar nav-stacked">

		<li class="ativo"><a href="exibirBiblioteca"><span class="glyphicon glyphicon-chevron-right "></span>Biblioteca</a></li>

		<li class="ativo2"><a href="exibirCadastrarLivro"><span class="glyphicon glyphicon-chevron-right "></span>Cadastrar livro</a></li>

	    <li class="ativo2"><a href="exibirCadastrarAluno" class="active2"><span class="glyphicon glyphicon-chevron-right "></span>Cadastrar aluno</a></li>

		<li class="ativo2"><a href="exibirGerenciarLivro"><span class="glyphicon glyphicon-chevron-right "></span> Gerenciar livro</a></li>

		<li class="ativo2"><a href="exibirGerenciarAluno"><span class="glyphicon glyphicon-chevron-right "></span>Gerenciar aluno</a></li>

		</ul>
	</div>
	
	<!-- end -->

<!-- form -->
		
			
<div style="margin-left: 40%">

		<div class="container-page">				
			<div class="col-md-9 ">
				<h3 class="dark-grey" align="center">Empréstimo</h3>
				  <br> <br> <br>
				<form action="">
				<div class="form-group col-lg-12">
				
				<input type="hidden" name="id" size="50px" value="${LivroE.id}">
				
					<label>Título do Livro:</label>
					
					<input type="text" name="titulo" class="form-control" value="${LivroE.titulo}">
				</div>
				
								<div class="form-group col-lg-12">
					<label>Autor:</label>
					<input type="text" name="autor" class="form-control"  value="${LivroE.autor}">
				</div>
				
				<div align="center">
						<a href="exibirGerenciarAlunoE?titulo=${LivroE.titulo}"><h5 style="color: #008B8B">BUSCAR DADOS DO ALUNO</h5></a>
					</div>
				
								<div class="form-group col-lg-12">
					<label>Nome do Aluno</label>
					<input type="text" name="nome" class="form-control"  value="${dadosA.nome}">
				</div>
				
								<div class="form-group col-lg-12">
					<label >E-mail:</label>
					<input type="text" name="email" class="form-control" value="${dadosA.email}">
				</div>
				<div class="form-group col-lg-12">
					<label >Data de Empréstimo</label>
					<input type="text" name="dataEmprestimo" class="form-control" value="<fmt:formatDate value="${dataEmprestimo}" pattern="dd/MM/yyyy" />" >
				</div>
				<div class="form-group col-lg-12">
					<label >Data de Devolução:</label>
					<input type="text" name="dataDevolucao" class="form-control"  value="<fmt:formatDate value="${dataDevolucao}" pattern="dd/MM/yyyy" />">
				</div>
				
				 <div class="form-group col-lg-12">
			<div align="center" >
		   
				<button class="btn btn-success "type="submit">
						<i class="glyphicon glyphicon-ok"></i> Realizar Empréstimo
					</button>
					<button class="btn btn-success ">
						<i class="glyphicon glyphicon-erase"></i>Cancelar
					</button>
				</div>
				</div>	
					</form>
					
				</div>
				
				
			</div>
		
</div>
<!-- rodapé -->
     <footer id="footer" >
        <p align="center"> BookstoreIfpe por EquipeF5 </p>
     </footer>
<!-- end -->
</body>
</html>