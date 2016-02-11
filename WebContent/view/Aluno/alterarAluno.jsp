<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alterar Dados do Aluno</title>
</head>
<body>

	<hr>
	<h3>Alterar Dados do Aluno</h3>
	<hr>
	
	<form action="alterarAluno" method="post" >
		
		<input type="hidden" name="id" value="${aluno.id}">
		
		<p>
			Nome: <br />
			<input type="text" name="nome" value="${aluno.nome}" style="width: 100px;" maxlength="5" />
		</p>
		
		<p>
			Cpf: <br />
			<input type="text" name="cpf" value="${aluno.cpf}" style="width: 100px;" />
		</p>
		
		<p>
			Telefone: <br />
			<input type="text" name="telefone" value="${aluno.telefone}" style="width: 100px;" />
		</p>
		
		<p>
			E-mail: <br />
			<input type="text" name="email" value="${aluno.email}" style="width: 100px;" />
		</p>
		
		<p>
			Matricula: <br />
			<input type="text" name="matricula" value="${aluno.matricula}" style="width: 100px;"  />
		</p>
		
		
		
		<br />
		
		<p>
			<input type="reset" value="Limpar"> &nbsp; &nbsp;
			<input type="submit" value="Alterar">
		</p>
		
	</form>

</body>
</html>