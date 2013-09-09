<%-- 
    Document   : triangleAreaForm
    Created on : Sep 8, 2013, 5:14:20 PM
    Author     : Dawn Bykowski
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Triangle Area Form (JSP)</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link REL="StyleSheet" TYPE="text/css" 
              HREF="css/geometricCalculatorStyles.css">
        <script src="js/geometricCalculatorValidation.js"></script>
    </head>
    <body style="background-image: url('images/geometry.png')">
        <h1>Calculate the hypotenuse of a Triangle</h1>
        <form name="triangleArea" id="triangleArea" 
              action="GeometricCalculatorController" method="POST" 
              onsubmit="return(validateTriangle());">
            <!-- Get Side A and set the name=sideA for retrieval by the servlet -->
            <p>Enter the Length of Side A: 
                <input type="text" name="sideA" id="sideA"/>
            </p>
            <br/>
            <!-- Get Side B and set the name=sideB for retrieval by the servlet -->
            <p>Enter the Length of Side B: 
                <input type="text" name="sideB" id="sideB"/>
            </p>
            <br/>
            <center>
                <input style="text-align: center" type="submit" 
                       name="triangleSubmit" id="triangleSubmit" 
                       value="Calculate Triangle Area"/>
            </center>
        </form>
        </form>
        <br/>
        <p>
        <%
            if (request.getAttribute("tArea") != null) {
                String result = request.getAttribute("tArea").toString();
                out.print("The hypotenuse of the triangle is: " + result);
            }
        %>
        </p>
        <br/>
        <br/>
        <a href="index.jsp">Back</a>
    </body>
</html>
