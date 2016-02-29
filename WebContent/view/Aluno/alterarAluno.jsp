<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link href="view/css/bootstrap.min.css" rel="stylesheet" media="screen">
	<link href="view/css/buscar.css" rel="stylesheet" media="screen">
	<link href="view/css/footer.css" rel="stylesheet" media="screen">
	<script src="view/js/jquery-latest.js"></script>
	<script src="view/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alterar Dados do Aluno</title>
</head>
<body>

<!-- Title -->
	<nav class="navbar navbar-default"> <br />
	<div class="container-fluid">
	<div class="navbar-header">
	
		<img class="img-responsive " align="left" src="view/imagens/IFPE_imagem.png" style="width: 380; height: 105px;">
		<h3 align="right" style="font-family: arial black; font-size: x-larger;"> BOOKSTORE </h3> 	<br />
		
	</div>
    </div>
	</nav>
<!-- end  -->
	
    <div align="center">
	
	   <h3>Alterar Dados do Aluno</h3>
 
   <form action="alterarAluno" method="post" >
	<div class="form-group col-lg-12">
	     <input type="hidden" name="id" size="50px" value="${Aluno.id}">
	     <input type="hidden" name="id" size="50px" value="${LivroE.id}">
	  <label>Nome Completo:</label>
		 <input type="text" name="nome" class="form-control" value="${Aluno.nome}" placeholder="Nome Completo"">
	</div>
				
	<div class="form-group col-lg-12">
		<label>Cpf:</label>
			<input type="text" name="cpf" class="form-control" value="${Aluno.cpf}" placeholder="Cpf"">
	</div>
				
				
    <div class="form-group col-lg-12">
		<label>Telefone</label>
			<input type="text" name="telefone" class="form-control"  value="${Aluno.telefone}" placeholder="Telefone">
	</div>
				
	<div class="form-group col-lg-12">
	   <label >E-mail:</label>
		  <input type="text" name="email" class="form-control" value="${Aluno.email}" placeholder="E-mail" >
	</div>
				
	 <div class="form-group col-lg-12">
		<label >Matricula: </label>
			<input type="text" name="matricula" class="form-control" value="${Aluno.matricula} " placeholder="Matrícula"  >
	</div>
	 <div class="form-group col-lg-12">
	 <div align="center" >
		 <button class="btn btn-success "type="submit" onclick="alert('Alterado com Sucesso!')"> <i class="glyphicon glyphicon-ok"></i> Alterar </button> &nbsp;&nbsp;
		 
		 <button class="btn btn-success" type="reset"> <i class="glyphicon glyphicon-erase"></i> Limpar </button>
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
 