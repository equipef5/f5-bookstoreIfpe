<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h3>Alterar Senha</h3>
	
	
	<form action="alterarSenha" method="post"   >
		
		<input type="hidden" name="nome" size="50px" value="${Adm.nome}">
		<br> 
		
		<input type="hidden" name="login" size="50px" value="${Adm.login}">
		
		
		<p>
			Digite sua nova senha: <br />
			<input type="password" name="senha" value="${Adm.senha}" size="8"  />
		</p>
		
		<br />&nbsp; &nbsp; &nbsp;&nbsp;
		 <button type="submit" class="btn btn-primary button2" onclick="alert('Senha alterada com sucesso!')">
		 <span class="glyphicon glyphicon-user"></span> Alterar </button> &nbsp; &nbsp;&nbsp;
		 
		 <button type="reset" class="btn btn-primary">
		  <span class="glyphicon glyphicon-arrow-right"></span> Limpar </button>
		</p>
		
	</form>

</body>
</html>