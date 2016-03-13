<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
<title>Cadastro de Livro</title>
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
      <!-- Form -->
      
	<div style="margin-left: 40%">
	<div class="container-page">				
	<div class="col-md-9 ">
	
	  <h2 class="dark-grey" align="center"> <b><i> Cadastro de Livro </i></b></h2>  <br> <br>
				  
    <form role="form" action="incluirLivro" method="post" enctype="multipart/form-data">
    
	<div class="form-group col-lg-12">
	     
	  <label>Título:</label>
		 <input type="text" name="titulo" class="form-control"  placeholder="Título do Livro" required="required">
	</div>
				
	<div class="form-group col-lg-12">
		<label>Autor:</label>
			<input type="text" name="autor" class="form-control" placeholder="Autor" required="required">
	</div>
				
				
    <div class="form-group col-lg-12">
		<label>Editora:</label>
			<input type="text" name="editora" class="form-control"  placeholder="Editora" required="required">
	</div>
				
	<div class="form-group col-lg-12">
	   <label >Ano de Lançamento:</label>
		  <input type="text" name="ano" class="form-control"  placeholder="Ano de Lançamento" required="required" >
	</div>
				
	 <div class="form-group col-lg-12">
		<label >Quantidade de Livro: </label>
			<input type="text" name="quantidade" class="form-control" placeholder="Quantidade de Livro"  required="required" >
	</div>
	
	 <div class="form-group col-lg-12">
	   <b> Imagem: </b> <br>
	      <input type="file" name="file" size="50" placeholder="Imagem" > <br> <br>
	       <form:errors path="aluno.file" cssStyle="color:red" /> <br />
	 </div>
				
	 <div class="form-group col-lg-12">
	 <div align="center" >
		 <button class="btn btn-success "type="submit" "> <i class="glyphicon glyphicon-ok"></i> Salvar </button> &nbsp;&nbsp;
		 
		 <button type="reset" class="btn btn-success "> <i class="glyphicon glyphicon-erase"></i>Limpar</button>
	</div>
	</div>	
	</form>
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