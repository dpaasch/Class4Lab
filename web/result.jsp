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
            <center>
                <p>You calculated the Area of a rectangle</p><br/>
                <img src="images/rectangle.png"/>
            </center>
            <%
                Object obj = "";
                obj = request.getAttribute("area");
                if (obj == null) {
                    // do nothing, assume that another calculation was performed
                } else {
                    out.print("The area of the rectangle is: " + obj);
                }
            %>
            <center>
                <p>You calculated the Area of a circle</p><br/>
                <img src="images/circle.png"/>
            </center>
            <%
                Object circleObj = "";
                circleObj = request.getAttribute("cArea");
                if (circleObj == null) {
                    // do nothing, assume that another calculation was performed                   
                } else {
                    out.print("The area of the circle is: " + circleObj);
                }
            %>
            <center>
                <p>You calculated the Hypotenuse of a triangle</p><br/>
                <img src="images/triangle.png"/>
            </center>
            <%
                Object triangleObj = "";
                triangleObj = request.getAttribute("tArea");
                if (triangleObj == null) {
                    // do nothing, assume that another calculation was performed                   
                } else {
                    out.print("The hypotenuse of the triangle is: " + triangleObj);
                }
            %>
        </h3>
        <br>
        <a href="index.jsp">Geometric Calculator Home</a>
    </body>
</html>
