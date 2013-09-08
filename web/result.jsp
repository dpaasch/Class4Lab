<%-- 
    Document   : result
    Created on : Sep 6, 2013, 8:54:48 PM
    Author     : Dawn Bykowski
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link REL="StyleSheet" TYPE="text/css" 
              HREF="css/geometricCalculatorStyles.css">
        <title>Geometric Calculator Results</title>
    </head>
    <body style="background-image: url('images/geometry.png')">
        <h1>Your Geometric Calculation result:</h1>
        <h3>
            <%
                Object rectangleObj = request.getAttribute("area");
                out.print("The area of the rectangle is: " + rectangleObj);
                
                Object circleObj = request.getAttribute("cArea");
                out.print("The area of the circle is: " + circleObj);
            %>
        </h3>
    </body>
</html>