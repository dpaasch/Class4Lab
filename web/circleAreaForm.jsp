<%-- 
    Document   : circleAreaForm
    Created on : Sep 8, 2013, 5:10:49 PM
    Author     : Dawn Bykowski
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
<title>Circle Area Form (JSP)</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link REL="StyleSheet" TYPE="text/css" 
              HREF="css/geometricCalculatorStyles.css">
        <script src="js/geometricCalculatorValidation.js"></script>
    </head>
    <body style="background-image: url('images/geometry.png')">
        <h1>Calculate the area of a Circle</h1>
        <form name="circleArea" id="circleArea" 
              action="CirleCalculatorController" method="POST" 
              onsubmit="return(validateCircle());">
            <!-- Get the Radius and set the name=radius for retrieval by the servlet -->
            <p>Enter the Radius of the circle: 
                <input type="text" name="radius" id="radius"/>
            </p>
            <br/>
            <center>
                <input style="text-align: center" type="submit" 
                       name="circleSubmit" id="circleSubmit" 
                       value="Calculate Circle Area"/>
            </center>
        </form>
        <br/>
        <p>
        <%
            if (request.getAttribute("cArea") != null) {
                String result = request.getAttribute("cArea").toString();
                out.print("The area of the circle is: " + result);
            }
        %>
        </p>
        <br/>
        <br/>
        <a href="index.jsp">Back</a>
    </body>
</html>
