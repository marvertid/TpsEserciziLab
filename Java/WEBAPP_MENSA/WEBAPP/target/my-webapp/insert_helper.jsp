<%@ page import="it.vinci.db.data.Mensa" %>
<%@ page import="it.vinci.db.DbService" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert</title>
</head>
<body>
    <%
        Mensa prenotazione = new Mensa(request.getParameter("cf"), request.getParameter("ordinazione"));
        DbService.insertPrenotazione(prenotazione);
    %>

    <p>Inserimento avvenuto con successo!</p>
    <br />
    <a href="index.jsp">Home</a>
</body>
</html>
