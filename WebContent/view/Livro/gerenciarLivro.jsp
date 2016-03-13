<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
		
	<div style= "margin-left: 95%" >
	     <p>
	       <a href="exibirHome"> <button type="button"  class="btn btn-default btn-round"> <b> voltar </b> </button> </a>
		</p>	
	</div>
	
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

   <div class="container">
   <div class="row">
   <div class="col-md-3">
   <div style="margin-left: 490px">  <form action="pesquisarLivro" method="post">
   <div class="input-group">
     
      <input  id="system-search" name="q" placeholder="Search for" required> <span class="input-group-btn">
       <button type="submit" class="btn btn-default"><i class="glyphicon glyphicon-search"></i></button> </span>
    </div>
    <br> <br>
    </form>
    </div>
    </div>
	
	<div class="col-md-9">
    	<table class="table table-list-search">
         <thead>
            <tr>
               <th>Codigo</th>
               <th>Título</th>
               <th>Autor</th>
               <th>Editora</th>
         
                <th>Ano de Lançamento</th>
                <th>Quantidade</th>
                <th>Imagem</th>
                      
                 <th>Editar</th>
                 <th>Deletar</th>

               </tr>
           </thead>
        
        <tbody>
     <c:forEach var="livro" items="${listarLivros}">
     <tr>
    
	    <td>${livro.idLivro}</td>
	    <td>${livro.titulo}</td>
	    <td>${livro.autor}</td>
	    <td>${livro.editora}</td>
	    <td>${livro.ano}</td>
	    <td>${livro.quantidade}</td>
	   <td><img src="view/imagens/${livro.imagem}" width="60px" height="60px"></td>
	    
      <td>
    
    
   <td> <a href="exibirAlterarLivro?titulo=${livro.titulo}"> <p data-placement="top" data-toggle="tooltip" title="Edit">
    		<button class="btn btn-primary btn-xs" data-title="Edit"> <span class="glyphicon glyphicon-pencil"></span> </button>
    	</p>
    	
     </td>
    <td> <a href="removerLivro?idLivro=${livro.idLivro}"><p data-placement="top" data-toggle="tooltip" title="Delete"><button class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" ><span class="glyphicon glyphicon-trash"></span></button></p> </a> </td>
    </tr>
    
    </c:forEach>
    </tbody>
    </table>   
    </div>
	</div>
    </div>
	<!-- end -->
	<!-- edit  -->
	
  
	
	
<!-- rodapé -->
     <footer id="footer" >
        <p align="center"> BookstoreIfpe por EquipeF5 </p>
     </footer>
<!-- end -->
</body>
</html>