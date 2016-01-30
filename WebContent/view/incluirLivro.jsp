<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <div style= "background-color:#D3D3D3"> <img src="WebContent/view/imagens/log_IFPE.PNG"> </div>
    
<form action="incluirLivro" method="post" enctype="multipart/form-data">

  <div align = "center">

   <h1> <b> <i> Cadastro de Livro </i></b>  </h1>
   
   <br> <br>


	  <b> Título: </b> <br>
	  <input type = "text" name = "titulo" size="50"> <br> <br>
	  
	  <b> Autor: </b> <br>
	  <input type = "text" name = "autor" size="50"> <br> <br>
	  
	  <b> Editora: </b> <br>
	  <input type = "text" name = "editora" size="50"> <br> <br>
	  
	  <b> Ano de Lançamento:</b> <br>
	  <input type = "text" name = "ano" size="50"> <br> <br>
	  
	  <b> Quantidade de Livros: </b> <br>
	  <input type = "text" name = "imagem" size="50"> <br> <br>
	  
	  <b> Imagem: </b> <br>
	  <input type = "file" name = "file" size="50"> <br> <br>
	  
	 
	  <p>
	    <input type="submit" onclick="alert('Livro Cadastrado!')" value="Confirmar"> &nbsp; &nbsp; <input type = "submit" value= "Sair">
	 </p>
	
 </div>	 
 </form>
 
 <br> <br> <br> <br> <br> <br> <br> <br> <br> <br>

 <div align = "center" >
    BookstoreIfpe por EquipeF5
 </div>

</body>
</html>