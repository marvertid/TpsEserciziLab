<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String username = request.getParameter("username");
    String pwd = request.getParameter("password");
    int n = (int) session.getAttribute("counter");

    session.setAttribute("counter", n+1);
    session.setAttribute("username", username);
    session.setAttribute("password", pwd);
%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - ADMIN PAGE</title>
</head>
<body>
   <h1>Admin Page</h1>
   <% if (session.getAttribute("password") != null && session.getAttribute("password").equals("admin")) { %>

   <input style="float: right" type="button" value="Log Out" onclick="window.location.href='logout.jsp';">

   <p><b>Username</b>: <%= session.getAttribute("username") %> </p>

   <a href="manager.jsp">Manager page</a>
   <a href="index.jsp">LogIn</a>

   <% } else { %>
       <p>Accesso negato.</p>
   <% } %>

</body>
</html>
