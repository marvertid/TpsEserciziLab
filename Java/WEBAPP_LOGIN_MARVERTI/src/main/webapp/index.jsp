<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head><title>JSP - LOGIN PAGE</title>
    <style>
        div {
            margin: 0 auto;
            width: 13rem;
        }
        input {
            margin: 0.5rem;
            display: block;
        }
    </style>
</head>
<body>
<div>
   <h1>Login Page</h1>
    <form action="admin.jsp" method="post">
        <input type="text" placeholder="Username.. " name="username" required/>
        <input type="password" placeholder="Password.. " name="password" required/>
        <input type="submit" value="Submit"/>
    </form>
</div>
<%
    int n = 0;
    session.setAttribute("counter", n);
%>
</body>
</html>