<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>order</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="resource\bootstrap.min.css">
<script src="resource\jquery.min.js"></script>	
<script src="resource\bootstrap.min.js"></script>
<script src="resource\angular.min.js"></script>

    </head>
    <body>
        <div class="jumbotron">
  <div class="container text-center">
     
    <h1><img src="resource/S1.jpg" width="200" height="200" align="middle"/>BK LAPTOP</h1>
    <p>Shopping for real life</p>
  </div>
</div>
    <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Logo</a>
    </div>
   <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
          <li class="active"><a href="index" class="btn btn-default"><span class="glyphicon glyphicon-home"></span><font color="red" >Home</font></a></li>
          <li><a href="products" class="btn btn-default"><font color="red" >Products</font></a></li>
          <li><a href="aboutus" class="btn btn-default"><span class="glyphicon glyphicon-info-sign"></span><font color="red" > About us</font></a></li>
          <li><a href="login" class="btn btn-default"> <span class="glyphicon glyphicon-log-in"></span><font color="red" >Login</font></a></li>
          <li><a href="registration" class="btn btn-default"><span class="glyphicon glyphicon-registration-mark"></span><font color="red" >Registration</font></a></li>
          <li><a href="contactus" class="btn btn-default"><span class="glyphicon glyphicon-contactus-mark"></span><font color="red" >contactus</font></a></li>
      </ul>
      
    </div>
  </div>
</nav>
        <div class="container">
            
  <h2>Enter your Details:</h2>
  
  <form:form method="POST" class="form-horizontal">
  <div class="form-group">
    <label class="control-label col-sm-2" for="email">Name:</label>
    <div class="col-sm-10">
      <form:input  path="name" type="text" class="form-control" id="name" placeholder="Enter name"/>
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="email">Email:</label>
    <div class="col-sm-10">
      <form:input path="email" type="email" class="form-control" id="email" placeholder="Enter email"/>
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="pwd">Password:</label>
    <div class="col-sm-10"> 
      <form:input type="password" path="pwd"   class="form-control" id="pwd" placeholder="Enter password"/>
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="pwd">Confirm password:</label>
    <div class="col-sm-10"> 
      <form:input path="cnfpwd"   type=password" class="form-control" id="cnfpwd" placeholder="Enter Confirm password"/>
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="pwd">Address</label>
    <div class="col-sm-10"> 
      <form:input  path="address" type="address" class="form-control" id="address" placeholder="address"/>
    </div>
    </div>
    <div class="form-group">
    <label class="control-label col-sm-2" for="pwd">Mobile number</label>
    <div class="col-sm-10"> 
      <form:input path="phone_no" type="mobile number" class="form-control" id="phone_no" placeholder="mobile number"/>
    </div>
    </div>
  
  <div class="form-group"> 
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">Submit</button>
    </div>
  </div>
</form:form>
 
 
  
</div>

</body>
</html>

  
    </div>
        </div>
    </body>
</html>