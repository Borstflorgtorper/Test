<%-- 
    Document   : Graph
    Created on : Jan 18, 2015, 4:42:23 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Graph View</h1>
        <%
            String result = request.getParameter("channeldata");
            
            %>
            The result is <%= result %>
    </body>
</html>
