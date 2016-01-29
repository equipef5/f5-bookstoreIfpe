<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Aluno</title>
</head>
<body>
    
    <div style= "background-color:#D3D3D3">  <img src="WebContent/view/imagens/log_IFPE.PNG"  > </div>
    
<form action="incluirAluno" method="post">

  <div align = "center">

   <h1> <b> <i> Cadastro de Aluno </i></b>  </h1>
   
   <br> <br>


	  <b> Nome completo: </b> <br>
	  <input type = "text" name = "nome" size="50"> <br> <br>
	  
	  <b> CPF: </b> <br>
	  <input type = "text" name = "cpf" size="50"> <br> <br>
	  
	  <b> Telefone: </b> <br>
	  <input type = "text" name = "telefone" size="50"> <br> <br>
	  
	  <b> E-mail:</b> <br>
	  <input type = "text" name = "email" size="50"> <br> <br>
	  
	  <b> Matrícula: </b> <br>
	  <input type = "text" name = "matricula" size="50"> <br> <br>
	  
	 
	  <p>
	    <input type="submit" onclick="alert('Aluno Cadastrado!')" value="Confirmar"> &nbsp; &nbsp; <input type = "submit" value= "Sair">
	 </p>
	
 </div>	 
 </form>
 
 <br> <br> <br> <br> <br> <br> <br> <br> <br> <br>

 <div align = "center" >
    BookstoreIfpe por EquipeF5
 </div>
</body>
</html>