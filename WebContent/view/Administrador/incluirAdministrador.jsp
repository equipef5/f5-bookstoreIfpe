<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<link href="view/css/bootstrap.min.css" rel="stylesheet" media="screen">
	<link href="view/css/buscar.css" rel="stylesheet" media="screen">
	<link href="view/css/footer.css" rel="stylesheet" media="screen">
	<script src="view/js/jquery-latest.js"></script>
	<script src="view/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar Administrador</title>
</head>
<body>

	<!-- Title -->
	<nav class="navbar navbar-default"> </br>
	 <div class="container-fluid">
	 <div class="navbar-header">
	 
		<img class="img-responsive " align="left" src="view/imagens/IFPE_imagem.png" style="width: 380; height: 105px;">
		 <h3 style="font-family: arial black; font-size: x-larger;"> BOOKSTORE </h3> <br />
		 
	 </div>
     </div>  
   </nav>
	<!-- end  -->	
     <br> <br> <br>
    <!-- form -->
    
     <div class="container">
     <div class="row">
	 <div class="col-md-4 col-md-offset-4">
     <div class="panel panel-default">
	 <div class="panel-heading">
			    	
		<h3 class="panel-title">Cadastrar Administrador</h3>
	 
	 </div>
  
	 <div class="panel-body">
			    	
		<form accept-charset="UTF-8" role="form" action="incluirAdministrador" method="post">
	       <fieldset>
	       
			<div class="form-group">
		         <input class="form-control" placeholder="Nome" name="nome" type="text">
		         <form:errors path="adm.nome" cssStyle="color:red" /> <br />
		    </div>
			    		
	        <div class="form-group">
			     <input class="form-control" placeholder="Login" name="login" type="text">
			     <form:errors path="adm.login" cssStyle="color:red" /> <br />
			</div>
			    		
            <div class="form-group">
			     <input class="form-control" placeholder="Senha" name="senha" type="password" value="">
			     <form:errors path="adm.senha" cssStyle="color:red" /> <br />
	        </div>
			    		
	          <input class="btn btn-lg btn-success btn-block" type="submit" value="Confirmar">
	
	     </fieldset>
		 </form>
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
	
	
</body>
</html>