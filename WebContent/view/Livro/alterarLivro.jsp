<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="view/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="view/css/buscar.css" rel="stylesheet" media="screen">
<script src="view/js/jquery-latest.js"></script>
<script src="view/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alterar Dados do Livro</title>
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
	       <a href="exibirHome"> <button type="button" id="botao2" class="btn btn-default btn-round"> <b> voltar </b> </button> </a>
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
	
   <div align="center">
	
	<h3>Alterar Dados do Livro</h3>
	
  <form action="alterarLivro" method="post" enctype="multipart/form-data">
	
	  <div class="form-group col-lg-12">
	     <input type="hidden" name="id" size="50px" value="${LivroL.idLivro}">
	     
	  <label>Título:</label>
		 <input type="text" name="titulo" class="form-control" value="${LivroL.titulo}" placeholder="Título do Livro">
	</div>
				
	<div class="form-group col-lg-12">
		<label>Autor:</label>
			<input type="text" name="autor" class="form-control"  value="${LivroL.autor}" placeholder="Autor">
	</div>
				
				
    <div class="form-group col-lg-12">
		<label>Editora:</label>
			<input type="text" name="editora" class="form-control"   value="${LivroL.editora}" placeholder="Editora">
	</div>
				
	<div class="form-group col-lg-12">
	   <label >Ano de Lançamento:</label>
		  <input type="text" name="ano" class="form-control" value="${LivroL.ano}" placeholder="Ano de Lançamento" >
	</div>
				
	 <div class="form-group col-lg-12">
		<label >Quantidade de Livro: </label>
			<input type="number" name="quantidade" class="form-control" value="${LivroL.quantidade} " placeholder="Quantidade de Livro"  >
	</div>
	
	 <div class="form-group col-lg-12">
		<label >Imagem: </label>
		  <input type="file" name="file" class="form-control"  value="${LivroL.imagem} " >
	</div>
				
	 <div class="form-group col-lg-12">
	 <div align="center" >
		 <button class="btn btn-success "type="submit"> <i class="glyphicon glyphicon-ok"></i> Alterar </button> &nbsp;&nbsp;
		 
		 <button type="reset" class="btn btn-success "> <i class="glyphicon glyphicon-erase"></i>Limpar</button>
	</div>
	</div>	
	</form>
	</div>
		
<!-- rodapé -->
     <footer id="footer" >
        <p align="center"> BookstoreIfpe por EquipeF5 </p>
     </footer>
<!-- end -->
</body>
</html>