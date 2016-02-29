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
	<nav class="navbar navbar-default"> <br />
	<div class="container-fluid">
		<div class="navbar-header">
			<img class="img-responsive " align="left" src="view/imagens/IFPE_imagem.png" style="width: 380; height: 105px;">
			<h3 align="right" style="font-family: arial black; font-size: x-larger;">BOOKSTORE</h3>
			
			<br />
		
		</div>

	</div>
	</nav>
<!-- end  -->	
   <div align="center">
	
	<h3>Alterar Dados do Livro</h3>
	
  <form action="alterarLivro" method="post" enctype="multipart/form-data">
	
	  <div class="form-group col-lg-12">
	     <input type="hidden" name="id" size="50px" value="${LivroE.id}">
	  <label>Título:</label>
	     <input type="hidden" name="id" size="50px" value="${Livro.id}">
		 <input type="text" name="titulo" class="form-control" value="${Livro.titulo}" placeholder="Título do Livro">
	</div>
				
	<div class="form-group col-lg-12">
		<label>Autor:</label>
			<input type="text" name="autor" class="form-control"  value="${Livro.autor}" placeholder="Autor">
	</div>
				
				
    <div class="form-group col-lg-12">
		<label>Editora:</label>
			<input type="text" name="editora" class="form-control"   value="${Livro.editora}" placeholder="Editora">
	</div>
				
	<div class="form-group col-lg-12">
	   <label >Ano de Lançamento:</label>
		  <input type="text" name="ano" class="form-control" value="${Livro.ano}" placeholder="Ano de Lançamento" >
	</div>
				
	 <div class="form-group col-lg-12">
		<label >Quantidade de Livro: </label>
			<input type="number" name="quantidade" class="form-control" value="${Livro.quantidade} " placeholder="Quantidade de Livro"  >
	</div>
	
	 <div class="form-group col-lg-12">
		<label >Imagem: </label>
		  <input type="file" name="file" class="form-control"  value="${Livro.imagem} " >
	</div>
				
	 <div class="form-group col-lg-12">
	 <div align="center" >
		 <button class="btn btn-success "type="submit" onclick="alert('Alterado com Sucesso!!')"> <i class="glyphicon glyphicon-ok"></i> Alterar </button> &nbsp;&nbsp;
		 
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