<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form action="alterarLivro" method="post" >
		
		<input type="hidden" name="id" size="50px" value="${LivroE.id}">
		
		<p>
			Titulo: <br />
			<input type="text" name="titulo" size="50" value="${LivroE.titulo}" />
		</p>
		
		<p>
			Autor: <br />
			<input type="text" name="autor" value="${LivroE.autor}" size="50"  />
		</p>
		   Nome do Aluno:
		  <input type="text" name="nome" value="${dadosA.nome}" size="50"  />
		  
		E-mail do Aluno:
		 <input type="text" name="cpf" value="${dadosA.email}" size="50"  />
		
	<a href="exibirGerenciarAluno?titulo=${LivroE.titulo}"> Preencher Dados do Aluno </a>
		 
		
		
		
		<br />
		
		 <p>
						<br />&nbsp; &nbsp; &nbsp;&nbsp;
						<button type="submit" class="btn btn-primary button2"
							onclick="alert('Alterado com sucesso!')">
							<span class="glyphicon glyphicon-ok-sign"></span> Alterar
						</button>
						&nbsp; &nbsp;&nbsp;
						<button type="reset" class="btn btn-primary">
							<span class="glyphicon glyphicon-erase"></span> Limpar
						</button>
		</p>
		
	</form>

</body>
</html>