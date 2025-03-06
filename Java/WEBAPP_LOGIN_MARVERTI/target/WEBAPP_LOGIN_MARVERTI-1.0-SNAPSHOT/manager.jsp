<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - MANAGER PAGE</title>
</head>
<body>
   <h1>Manager Page</h1>

   <% if (session.getAttribute("password") != null && session.getAttribute("password").equals("admin")) { %>

   <input style="float: right" type="button" value="Log Out" onclick="window.location.href='logout.jsp';">

   <p><b>Username</b>: <%= session.getAttribute("username") %> </p>

   <p><b>Numero Accessi pagina Admin</b>: <%=session.getAttribute("counter")%></p>
   <% } else {
       response.sendRedirect("index.jsp"); // Reindirizza alla pagina di login
     } %>

</body>
</html>
