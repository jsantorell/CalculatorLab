<%-- 
    Document   : index
    Created on : Aug 29, 2017, 8:55:09 PM
    Author     : jerem
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9" lang=""> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js" lang=""> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
       

        <link rel="stylesheet" href="css/bootstrap.min.css">
  
        <link rel="stylesheet" href="css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="css/main.css">
       

        <script src="js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
         <link rel="stylesheet" href="css/stylings.css">
  
        <title>Shapes Calculator</title>
    </head>
    <body>
     
        

   
<div class="container">
    <div id="errors">${errors}</div>
       <ul class="nav nav-tabs" id="navTabs">
            <li><a href="index.jsp">Home</a></li>
            <li><a href="lab1.jsp">Lab 1</a></li>
            <li><a href="lab2.jsp">Lab 2</a></li>
            <li class="active"><a href="lab3.jsp">Lab 3</a></li>
        </ul>
    <div id="theContainer">
    <!--Rectangle Calculator-->
    <h3>Calculate the Area of a Rectangle</h3>
    
    <br /><br />
  <form method="POST" id="recCalc" action="CalcController?shape=RectangleSamePage">
                <div class="form-group row">
                    <label for="len" class="col-sm-2 col-form-label">Length</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="len" placeholder="Length" name="length">
                    </div>
                </div>
                <div class="form-group row">
                    <label for="len" class="col-sm-2 col-form-label">Width</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="wid" placeholder="Width" name="width">
                    </div>
                </div>


                <div class="form-group row">
                    <div class="offset-sm-2 col-sm-10">
                        <button type="submit" class="btn btn-primary">Calculate</button>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="len" class="col-sm-2 col-form-label">Area</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="wid" value="${area}" disabled>
                    </div>
                </div>

            </form>
    <h3>Calculate the Area of a Circle</h3>   

                    <br /><br />
                      <form method="POST" id="circleCalc" action="CalcController?shape=CircleSamePage">
                <div class="form-group row">
                    <label for="dia" class="col-sm-2 col-form-label">Diameter</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="dia" placeholder="Diameter" name="diameter">
                    </div>
                </div>

                <div class="form-group row">
                    <div class="offset-sm-2 col-sm-10">
                        <button type="submit" class="btn btn-primary">Calculate</button>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="len" class="col-sm-2 col-form-label">Area</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="wid" value="${areaC}" disabled>
                    </div>
                </div>

            </form>
        <h3>Calculate the Area of a Rectangle</h3>
    
    <br /><br />
  <form method="POST" id="TrigCalc" action="CalcController?shape=TriangleSamePage">
                <div class="form-group row col-sm-4">
                    <label for="len" class="col-sm-2 col-form-label">Leg A</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="len"  value="${legA}"  placeholder="Leg A" name="leg1">
                    </div>
                </div>
                <div class="form-group row col-sm-4">
                    <label for="len" class="col-sm-2 col-form-label">Leg B</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="wid"  value="${legB}"  placeholder="Leg B" name="leg2">
                    </div>
                </div>


                
                <div class="form-group row col-sm-4">
                    <label for="len" class="col-sm-2 col-form-label">Leg C</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="wid" value="${legC}"  name="leg3" placeholder="Leg C" >
                    </div>
                </div>
                    <div class="form-group row">
                    <div class="offset-sm-2 col-sm-10">
                        <button type="submit" class="btn btn-primary">Calculate</button>
                    </div>
                </div>

            </form>
    
    </div>
    
</div>
    </body>
</html>
