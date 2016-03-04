<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link rel="stylesheet" type="text/css" href="view/css/buscar.css">
	<link href="view/css/footer.css" rel="stylesheet" media="screen">
	<link href="view/css/bootstrap.min.css" rel="stylesheet" media="screen">
	<script src="view/js/jquery-latest.js"></script>
	<script src="view/js/bootstrap.min.js"></script>
	<script src="view/js/jquery.min.js"></script>
	<script src="view/js/table.js"></script>
	<script src="view/js/funcoes.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gerenciar Aluno</title>
</head>
<body>
	<!-- Title -->
	<nav class="navbar navbar-default"> <br />
	<div class="container-fluid">
	<div class="navbar-header">
	   <img class="img-responsive " align="left" src="view/imagens/IFPE_imagem.png" style="width: 380; height: 105px;">
		<h3 align="right" style="font-family: arial black; font-size: x-larger;"> BOOKSTORE </h3> <br />
   
     <div style="background-image: right; margin-right: 20px;">
			
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
    </div>
	</nav>
	<!-- end  -->

	<!-- menu  -->
	
    <div class="col-sm-3 sidenav">
     <ul class="nav nav-pills nav-stacked">

		<li class="active"> <a href="exibirBiblioteca"> <span class="glyphicon glyphicon-chevron-right"> </span> Biblioteca </a> </li>

		<li> <a href="exibirCadastrarLivro"> <span class="glyphicon glyphicon-chevron-right"> </span> Cadastrar livro </a> </li>

		<li> <a href="exibirCadastrarAluno" class="active2"><span class="glyphicon glyphicon-chevron-right"> </span>Cadastrar aluno </a></li>

		<li> <a href="exibirGerenciarLivro"><span class="glyphicon glyphicon-chevron-right"></span>Gerenciar livro</a></li>

		<li><a href="exibirGerenciarAluno"><span class="glyphicon glyphicon-chevron-right"></span>Gerenciar aluno</a></li>

	</ul>
	</div>
			
<!-- end -->
	
	<!-- table List -->
  
   <div class="container">
	<div class="row">
    <div class="col-md-3">
    <div style="margin-left: 490px">  <form action="pesquisarAluno" method="post">
    <div class="input-group">
       
        <input  id="system-search" name="q" placeholder="Search for" required><span class="input-group-btn"><button type="submit" class="btn btn-default"><i class="glyphicon glyphicon-search"></i></button></span>
   
    </div>
                <br> <br>
    </form>
    </div>
    </div>
       
    <div class="col-sm-9">
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
    
	    <td><a href="dadosA?id=${aluno.idAluno}&titulo=${titulo}">${aluno.idAluno}</a></td>
	    <td>${aluno.nome}</td>
	    <td>${aluno.cpf}</td>
	    <td>${aluno.telefone}</td>
	    <td>${aluno.email}</td>
	    <td>${aluno.matricula}</td>
	    <td> <a href="exibirAlterarAluno?cpf=${aluno.cpf}"> <p data-placement="top" data-toggle="tooltip" title="Edit">
    		<button class="btn btn-primary btn-xs" data-title="Edit"> <span class="glyphicon glyphicon-pencil"></span> </button>
    	</p>
    	
     </td>
    
       <td> <a href="removerAluno?id=${aluno.idAluno}"><p data-placement="top" data-toggle="tooltip" title="Delete"><button class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" ><span class="glyphicon glyphicon-trash"></span></button></p> </a> </td>
     </tr>
    </c:forEach>
    </tbody>
    </table>   
	</div>
	</div>
	</div>

<!-- end -->

<!-- edit  -->
    <div class="modal fade" id="edit" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
    <div class="modal-dialog">
    <div class="modal-content">
    <div class="modal-header">
       
      <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
      <h4 class="modal-title custom_align" id="Heading">Alterar Dados do Aluno</h4>
    
    </div>
    <div class="modal-body">
    <div class="form-group">
    <div align="center"> 
    
    <form action="alterarAluno" method="post" >
      
      <input type="hidden" name="id" size="50px" value="${alunoA.id}">
		
	<p>
	 Nome: <br />
	   <input type="text" name="nome" size="50" value="${alunoA.nome}"  maxlength="5" />
	</p>
		
	<p>
	  Cpf: <br />
		<input type="text" name="cpf" value="${alunoA.cpf}" size="50"  />
	</p>
		
	<p>
	 Telefone: <br />
		<input type="text" name="telefone" size="50" value="${alunoA.telefone}"  />
	</p>
		
	<p>
	  E-mail: <br />
		<input type="text" name="email" size="50" value="${alunoA.email}"  />
	</p>
		
	<p>
	 Matricula: <br />
		<input type="text" name="matricula" size="50" value="${alunoA.matricula} "   />
	</p>
		
	<br />
		
    <p> <br />&nbsp; &nbsp; &nbsp;&nbsp;
	  <button type="submit" class="btn btn-primary button2" onclick="alert('Alterado com sucesso!')">
		<span class="glyphicon glyphicon-ok-sign"></span> Alterar </button> &nbsp; &nbsp;&nbsp;
						
	  <button type="reset" class="btn btn-primary">
	     <span class="glyphicon glyphicon-arrow-right"></span> Limpar </button>
	</p>
		
     </form>
     </div>
     </div>
     </div>
     </div>
     </div>
      </div>
	<!-- end -->
	 <br> <br> <br> <br> <br> <br> <br> <br> <br> <br>

 <!-- rodapé -->
    <footer id="footer" >
        <p align="center"> BookstoreIfpe por EquipeF5 </p>
    </footer>
 <!-- end -->
</body>
</html>