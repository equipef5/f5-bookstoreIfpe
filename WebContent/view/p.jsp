<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
<script src="js/jquery-latest.js"></script>
<script src="js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background: ">

	<nav class="navbar navbar-default">
	<div style="float: right">
		</br> </br>

	</div>

	<div class="container-fluid">
		</br>
		<div class="navbar-header">
			<img align="left" src="imagens/IFPE_imagem.png"
				style="width: 380; height: 105px;">
			<h3 align="right"
				style="font-family: arial black; font-size: x-larger">BOOKSTORE
			</h3>
		</div>
	</div>
	</nav>
	<!-- painel -->

	<div class="col-md-3">
		<ul class="nav nav-pills nav-stacked">
			<li style="background-color: #65B332"><span class="glyphicon-chevron-right "></span><a href="p.jsp">Biblioteca</a></li>
			<li id="a"><a href="#">Menu 1</a></li>
			<li><a href="#">Menu 2</a></li>
			<li><a href="#">Menu 3</a></li>
		</ul>
	</div>
	<div class="col-md-9 ">
		<div class="panel-heading" align="justify">
				
			</div>
			<div align="center" style="color: green" >
			<form class="navbar-form" role="search">
        <div class="input-group">
            <input type="text" class="form-control" placeholder="Pesquisar livro" name="q">
            <div class="input-group-btn">
                <button  class="btn btn-success" type="submit"><i class="glyphicon glyphicon-search"></i></button>
            </div>
        </div>
        </form>
			<b style="font-family: verdana">EMPRÉSTIMO</b>
				<div align="justify" style="margin-left: 30%;margin-top: 1%">
				
				</br>

					<b> Título: </b> <br> <input type="text" name="titulo"
						size="50"> <br> <b> Autor: </b> <br> <input
						type="text" name="autor" size="50"> <br> <b> </b><br/><div align="justify">
						<a href="#"><h5 style="color: #008B8B">BUSCAR DADOS DE ALUNO</h5></a>
						</div>
					<br> <b> Nome:</b> <br> <input type="text"
						name="ano" size="50"> <br> <b> Matricula
						 </b> <br> <input type="text" name="imagem" size="50"> 
					 </br>
					 <b> E-mail:</b> <br> <input type="text"
						name="ano" size="50">
						</br>
					 </br>
					
						<input class="btn btn-success" type="submit" onclick="alert('Ok!')"
							value="OK"> &nbsp; &nbsp; <input class="btn btn-success" type="submit"
							value="cancelar">
					</p>

				</div>
				</form>


			</div>
		</div>







</body>
</html>