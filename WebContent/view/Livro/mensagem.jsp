<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    <script src="view/js/jquery-2.1.4.js"></script>
	<script src="view/js/usuario.js"></script>	
	<meta http-equiv="refresh" content=3;url="exibirCadastrarLivro">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro com sucesso!</title>
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
					class="glyphicon glyphicon-chevron-right "></span> Gerenciar Livro</a></li>

			<li class="ativo2"><a href="exibirGerenciarAluno"><span
					class="glyphicon glyphicon-chevron-right "></span>Gerenciar Usuários</a></li>
					
		      <li class="ativo2"><a href="exibirListaEmprestimo"><span
					class="glyphicon glyphicon-chevron-right "></span>Gerenciar Empréstimos</a></li>
					

		</ul>
	</div>
	
	<!-- end -->

  <div align="center">
	<div class="container">
	    <div class="row">
	        <div class="col-sm-6 col-md-6">
	            <div class="alert alert-success">
	                <button type="button" class="close" data-dismiss="alert" aria-hidden="true">
	                    ×</button>
	               <span class="glyphicon glyphicon-ok"></span> <strong> Sucesso! </strong>
	                <hr class="message-inner-separator">
	                <p>
	                    O Livro ${livro.titulo} foi cadastrado com sucesso!  </p>
	            </div>
	        </div>
	    </div>
	</div>
	</div>
<!-- rodapé -->
     <footer id="footer" >
        <p align="center"> BookstoreIfpe por EquipeF5 </p>
     </footer>
<!-- end -->
   
</div>
</body>
</html>