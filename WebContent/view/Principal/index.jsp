<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="view/css/login.css">
<link rel="stylesheet" type="text/css" href="view/css/buscar.css">
	<link rel="stylesheet" type="text/css" href="view/css/menu.css">
	<link rel="stylesheet" type="text/css" href="view/css/footer.css">
	<link href="view/css/bootstrap.min.css" rel="stylesheet" media="screen">
	<script src="view/js/jquery-latest.js"></script>
	<script src="view/js/bootstrap.min.js"></script>
	<script src="view/js/jquery.min.js"></script>
	<script src="view/js/login.js"></script>
    

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body style="background-image:view/v.jpg">
                                    
		

<!-- Form Login -->

<div class="row">
  <div class="col-sm-6 col-md-4 col-sm-offset-3 col-md-offset-4">
    <div class="panel panel-default">
    
      <div class="panel-body">
        <form role="form" action="#" method="POST">
          <fieldset>
            <div class="row">
            <div class="center-block"> <div id="login-access" class="tab-pane fade active in">  <h2  style="color:#00FA9A" ><i class="glyphicon glyphicon-log-in"></i> Accesso</h2></div> </div>
              <hr>
            </div>
            <div class="row">
              <div class="col-sm-12 col-md-10  col-md-offset-1 ">
                <div class="form-group">
                <label>Username:</label>
                  <div class="input-group"> <span class="input-group-addon"> <i class="glyphicon glyphicon-user"></i> </span>
                    <input class="form-control" placeholder="Username" name="loginname" type="text" autofocus>
                  </div>
                </div>
                <div class="form-group">
                 <label>Password:</label>
                  <div class="input-group"> <span class="input-group-addon"> <i class="glyphicon glyphicon-lock"></i> </span>
                    <input class="form-control" placeholder="Password" name="password" type="password" value="">
                  </div>
                </div>
               <div class="form-group">
                 <label>
                </label> <input type="submit" class="btn btn-success" value="Login">
                </div>
            
               
              </div>
            </div>
           
          </fieldset>
        </form>
    
      </div>
    </div>
  </div>
</div>
</div>
</div>
</body>
</html>