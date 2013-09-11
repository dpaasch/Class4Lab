<%-- 
    Document   : rectangleAreaForm - Challenge #2
    Created on : Sep 8, 2013, 4:54:38 PM
    Author     : Dawn Bykowski
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Rectangle Area Form (JSP)</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link REL="StyleSheet" TYPE="text/css" 
              HREF="css/geometricCalculatorStyles.css">
        <script src="js/geometricCalculatorValidation.js"></script>
    </head>
    <body style="background-image: url('images/geometry.png')">
        <h1>Calculate the area of a Rectangle</h1>
        <form name="rectangleArea" id="rectangleArea" 
              action="GeometricCalculatorController_c2" method="POST" 
              onsubmit="return(validateRectangle());">
            <!-- Get the Length and set the name=length for retrieval by the servlet -->
            <p>Enter the Length of the rectangle: 
                <input type="text" name="length" id="length"/>
            </p>
            <br/>
            <!-- Get the Width and set the name=width for retrieval by the servlet -->
            <p>Enter the Width of the rectangle: 
                <input type="text" name="width" id="width"/>
            </p>
            <br/>
            <center>
                <input style="text-align: center" type="submit" 
                       name="rectangleSubmit" id="rectangleSubmit" 
                       value="Calculate Rectangle Area"/>
            </center>
        </form>
        <br/>
        <h3>
        <%
            if (request.getAttribute("area") != null) {
                String result = request.getAttribute("area").toString();
                out.print("The area of the rectangle is: " + result);
            }
        %>
        </h3>
        <br/>
        <br/>
        <a href="index.jsp">Geometric Calculator Home</a>
    </body>
</html>
