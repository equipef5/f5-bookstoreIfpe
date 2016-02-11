<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="view/css/buscar.css">
<link href="view/css/bootstrap.min.css" rel="stylesheet" media="screen">
<script src="view/js/jquery-latest.js"></script>
<script src="view/js/bootstrap.min.js"></script>
<script src="view/js/jquery.min.js"></script>
<script src="view/js/table.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- Title -->
	<nav class="navbar navbar-default"> <br />
	<div class="container-fluid">
		<div class="navbar-header">
			<img class="img-responsive " align="left"
				src="view/imagens/IFPE_imagem.png" style="width: 380; height: 105px;">
			<h3 align="right"
				style="font-family: arial black; font-size: x-larger;">BOOKSTORE

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

				<li class="active"><a href="#"><span
						class="glyphicon glyphicon-chevron-right"></span>Biblioteca</a></li>

				<li><a href="exibirCadastrarLivro"><span
						class="glyphicon glyphicon-chevron-right"></span>Cadastrar livro</a></li>

				<li><a href="exibirCadastrarAluno" class="active2"><span
						class="glyphicon glyphicon-chevron-right"></span>Cadastrar aluno</a></li>

				<li><a href="#"><span
						class="glyphicon glyphicon-chevron-right"></span> Gerenciar livro</a></li>

				<li><a href="exibirGerenciarAluno"><span
						class="glyphicon glyphicon-chevron-right"></span>Gerenciar aluno</a></li>

			</ul>
		</div>
	</div>
	<!-- end -->

	<!-- Imput Search -->
	<form action='pesquisarAluno'>
		Cpf: <input type="text" name="cpf" /> 
		<input type="submit" value="pesquisar" />
	</form>
	<!-- end -->
	
	<!-- table List -->
<div class="container">
	<div class="row">
        <div class="col-md-3">
          <div align="right">  <form action="#" method="get">
                <div class="input-group">
                    <input class="form-control" id="system-search" name="q" placeholder="Search for" required>
                    <span class="input-group-btn">
                        <button type="submit" class="btn btn-default"><i class="glyphicon glyphicon-search"></i></button>
                    </span>
                </div>
            </form></div>
        </div>
		<div class="col-md-9">
    	 <table class="table table-list-search">
            <thead>
             <tr>
                   <th>Codigo</th>
                   <th>Nome</th>
                   <th>Cpf</th>
                   <th>Telefone</th>
         
                   <th>E-mail</th>
                   <th>Matricula</th>
                      
                   <th>Editar</th>
                   <th>Deletar</th>

                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="aluno" items="${listarAlunos}">
    <tr>
    
    <td>${aluno.id}</td>
    <td>${aluno.nome}</td>
    <td>${aluno.cpf}</td>
    <td>${aluno.telefone}</td>
    <td>${aluno.email}</td>
    <td>${aluno.matricula}</td>
    <td><p data-placement="top" data-toggle="tooltip" title="Edit"><button class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" ><span class="glyphicon glyphicon-pencil"></span></button></p></td>
    <td><p data-placement="top" data-toggle="tooltip" title="Delete"><button class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" ><span class="glyphicon glyphicon-trash"></span></button></p></td>
    </tr>
    </c:forEach>
                    </tbody>
                </table>   
		</div>
	</div>
</div>
	<!-- end -->
</body>
</html>