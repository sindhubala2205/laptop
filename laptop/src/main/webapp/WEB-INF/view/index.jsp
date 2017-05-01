

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>BK LAPTOP</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="resource\bootstrap.min.css">
  <script src="resource\jquery.min.js"></script>
  <script src="resource\bootstrap.min.js"></script>
  <script src="resource\angular.min.js"></script>
  <style>
    /* Remove the navbar's default rounded borders and increase the bottom margin */
    .navbar {
      margin-bottom: 50px;
      border-radius: 0;
    }
    
    /* Remove the jumbotron's default bottom margin */
     .jumbotron {
      margin-bottom: 0;
    }
   
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
  </style>
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
      
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
          <li class="active"><a href="index" class="btn btn-default"><span class="glyphicon glyphicon-home"></span><font color="red" >Home</font></a></li>
          <li><a href="product" class="btn btn-default"><font color="red" >Products</font></a></li>
          <li><a href="aboutus" class="btn btn-default"><span class="glyphicon glyphicon-info-sign"></span><font color="red" > About us</font></a></li>
          <li><a href="login" class="btn btn-default"><span class="glyphicon glyphicon-log-in"></span><font color="red" >Login</font></a></li>
          <li><a href="registration" class="btn btn-default"><span class="glyphicon glyphicon-registration-mark"></span><font color="red" >Registration</font></a></li>
          <li><a href="order" class="btn btn-default"><span class="glyphicon glyphicon-order"></span><font color="red" >Order</font></a></li>
          <li><a href="contactus" class="btn btn-default"><span class="glyphicon glyphicon-contactus-mark"></span><font color="red" >contactus</font></a></li>
          <li><a href="list" class="btn btn-default"><span class="glyphicon glyphicon-contactus-mark"></span><font color="red" >list</font></a></li>
      </ul>
      
    </div>
  </div>
</nav>
<div class="container">
  
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">

    ///  <div class="item active">
       <center> <img src="resource/s5.jpg" alt="Chania" width="400" height="300"></center>
        <div class="carousel-caption">
          <h3>LENOVO</h3>
          
        </div>
      </div>

      <div class="item">
       <center> <img src="resource/s2.jpg" alt="Chania" width="400" height="300"></center>
        <div class="carousel-caption">
          <h3>Samsung</h3>
         
        </div>
      </div>
    
      <div class="item">
       <center> <img src="resource/s3.jpg" alt="Flower" width="400" height="300"></center>
        <div class="carousel-caption">
          <h3>I-PHONE</h3>
          
        </div>
      </div>

      <div class="item">
        <center><img src="resource/s4.jpg" alt="Flower" width="400" height="300"></center>
        <div class="carousel-caption">
          <h3>HP</h3>
         
        </div>
        </div>

      <div class="item">
     <center>   <img src="resource/s8.jpg" alt="Flower" width="400" height="300"></center>
        <div class="carousel-caption">
          <h3>NOKIA</h3>
         
        </div>
      </div>
    
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div><br><br>

<footer class="container-fluid text-center">
    <div class="container">
     <p>Envelope icon: <span class="glyphicon glyphicon-envelope"></span></p>
     <p><span class="glyphicon glyphicon-earphone"></span></p>
    </div>
</footer>

</body>
</html>

