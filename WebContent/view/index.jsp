<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="view/css/login.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
</br></br>
<!-- title -->

<h3 align="center" style="font-family: arial black; font-size: x-larger;">BOOKSTORE IFPE</h3>

<!-- end -->

<!-- Form Login -->
<div class="container">
        <div class="card card-container">
         <img id="profile-img" class="profile-img-card" src="view/imagens/chave-com-cadeado.png" />
            <p id="profile-name" class="profile-name-card"></p>
            
            <form class="form-signin" action="validarLogin">
                <span id="reauth-email" class="reauth-email"></span>
                <input type="text" id="nome" class="form-control" placeholder="Nome" required autofocus>
                <input type="password" id="senha" class="form-control" placeholder="Senha" required>
                <div id="remember" class="checkbox">
                
                    <label>
                        <input type="checkbox" value="remember-me"> Lembre-se de mim
                    </label>
                    
                </div>
                <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Entrar</button>
            </form>
            
            <!-- end -->
            <a href="#" class="forgot-password">
                Esqueceu a senha?
            </a>
        </div><!-- /card-container -->
        
    </div><!-- /container -->
 
</body>
</html>