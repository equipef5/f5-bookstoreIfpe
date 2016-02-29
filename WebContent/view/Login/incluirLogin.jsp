<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
 
   <form role="form" action="incluirLogin" method="post">
		   
				<b> Login: </b> <br> 
				<input type="text" name="login" size="50px" placeholder="login"> <br> <br> 
				
				 <b> Senha: </b> <br> 
				 <input type="password" name="senha" size="50" placeholder="senha"> <br> <br> 
				    
                   
						  <br />&nbsp; &nbsp; &nbsp;&nbsp;
			<button type="submit" class="btn btn-primary button2" onclick="alert('Usuario Cadastrado!')">
			<span class="glyphicon glyphicon-user"></span> Cadastrar </button>  
	</form>  
</body>
</html>