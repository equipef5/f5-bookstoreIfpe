<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet" type="text/css" href="view/css/buscar.css">
<link rel="stylesheet" type="text/css" href="view/css/menu.css">
<link rel="stylesheet" type="text/css" href="view/css/tableList.css">
<link href="view/css/bootstrap.min.css" rel="stylesheet" media="screen">
<script src="view/js/jquery-latest.js"></script>
<script src="view/js/bootstrap.min.js"></script>
<script src="view/js/jquery.min.js"></script>
<script src="view/js/table.js"></script>
<script src="view/js/funcoes.js"></script>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Empréstimo</title>
</head>
<body>
	<link rel="stylesheet" type="text/css" href="view/css/buscar.css">
	<link rel="stylesheet" type="text/css" href="view/css/menu.css">
	<link rel="stylesheet" type="text/css" href="view/css/footer.css">
	<link href="view/css/bootstrap.min.css" rel="stylesheet" media="screen">
	<script src="view/js/jquery-latest.js"></script>
	<script src="view/js/bootstrap.min.js"></script>
	<script src="view/js/jquery.min.js"></script>
	<script src="view/js/table.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gerenciar Livros</title>
</head>
<body>

<!-- Title -->
	<nav class="navbar navbar-default">
	<div style="float: right"> </br> </br>
    </div>
    
    <div class="container-fluid"> </br>
	<div class="navbar-header">
			
	  <img align="left" src="view/imagens/IFPE_imagem.png" style="width: 380; height: 105px;">
	    <h3 align="right" style="font-family: arial black; font-size: x-larger"> Library </h3>
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
					class="glyphicon glyphicon-chevron-right "></span>Gerenciar Empréstimos</a></li>
					

		</ul>
	</div>
	
	<!-- end -->

 <h2 class="dark-grey" align="center"> <b><i> Lista de Empréstimo </i></b></h2>  <br> <br> <br>
	<!-- table List -->

	<div class="col-sm-9">
		<table class="table table-bordered">
			<thead>
				<tr>

					<th>Código</th>
					<th>Data de Emprestimo</th>
					<th>Data de Devolução</th>
					<th>Aluno</th>
					<th>Livro</th>
					<th>Status De Emprestimo</th>
					<th>Devolução</th>
					

				</tr>
			</thead>

			<tbody>

				<c:forEach var="emprestimo" items="${listarEmprestimo}">
					<tr>


						<td>${emprestimo.id}</td>
						<td>${emprestimo.dataEmprestimo}</td>
						<td>${emprestimo.dataDevolucao}</td>
						<td>${emprestimo.aluno.nome}</td>
						<td>${emprestimo.livro.titulo}</td>
						<td>${emprestimo.status}</td>
						<td><a href="alterarStatusEmprestimo?STATUS=${emprestimo.status}&id=${emprestimo.id}">
								<p data-placement="top" data-toggle="tooltip" title="Edit">
									<button class="btn btn-primary btn-xs" data-title="Edit">
										<span class="glyphicon glyphicon-ok-sign"></span>
									</button>
								</p></a></td>

						
				</c:forEach>
			</tbody>
		</table>
	</div>
	




	<!-- end -->



	<!-- end -->
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


	<!-- rodapé -->
	<br>
	<br>
	<br>
	<br>
	<br>
	<div class="col-sm-12">

		<h5 align="center">BookstoreIfpe por EquipeF5</h5>

	</div>
	<!-- end -->
</body>
</html>