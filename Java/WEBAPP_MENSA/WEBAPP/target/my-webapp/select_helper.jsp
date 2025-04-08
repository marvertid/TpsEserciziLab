<%@ page import="it.vinci.db.DbService" %>
<%@ page import="java.awt.*" %>
<%@ page import="it.vinci.db.data.Mensa" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: diego
  Date: 4/8/25
  Time: 5:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dati Prenotazione</title>
    <meta name="author" content="MARVERT DIEGO 5AI" />
    <style>
        table {
            border-collapse: collapse;
        }
        th, td {
            border: 1px black solid;
            padding: 0.5rem;
        }
    </style>
</head>
<body>
    <%
        List<Mensa> prenotazioni = DbService.selectPrenotazioni(request.getParameter("data"));
    %>

    <h1>Tabella Prenotazioni: </h1>
    <table>
        <tr>
            <th>Codice Fiscale</th>
            <th>Data Prenotazione</th>
            <th>Ordinazione</th>
        </tr>
        <% for (Mensa prenotazione : prenotazioni) { %>
        <tr>
            <td><%=prenotazione.getCF()%></td>
            <td><%=prenotazione.getData_pasto()%></td>
            <td><%=prenotazione.getOrdinazione()%></td>
        </tr>
        <% } %>
    </table>
    <br />
    <a href="index.jsp">Home</a>
</body>
</html>
