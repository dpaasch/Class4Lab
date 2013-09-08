<%-- 
    Document   : index
    Created on : Sep 6, 2013, 6:24:31 PM
    Author     : Dawn Bykowski
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link REL="StyleSheet" TYPE="text/css" 
              HREF="css/geometricCalculatorStyles.css">
        <title>Geometric Calculator Home</title>
    </head>
    <body style="background-image: url('images/geometry.png')">
        <h1>Please select a Geometric calculation option</h1>
            <center>
            <button onclick="location.href='rectangleAreaForm.html';" 
                name="rectangle" id="rectangle"/>
                <img src="images/rectangle_black.png"/>&nbsp;&nbsp;
                    <p>Area of a rectangle</p>
                    <br/>
            </button>
            <button onclick="location.href='circleAreaForm.html';"
                    name="circle" id="circle"/>
                <img src="images/circle_black.png">&nbsp;&nbsp;
                    <p>Area of a circle</p>
                    <br/>
            </button>  
            <button onclick="location.href='triangleAreaForm.html';"
                    name="triangle" id="triangle"/>
                <img src="images/triangle_black.png">&nbsp;&nbsp;
                    <p>Hypotenuse of a triangle</p>
                    <br/>
            </button>      
        </center>
    </body>
</html>
