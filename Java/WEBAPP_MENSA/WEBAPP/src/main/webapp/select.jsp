<%@ page import="it.vinci.db.DbService" %>
<%@ page import="java.util.List" %>
<%@ page import="it.vinci.db.data.Mensa" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Visualizzazione prenotazioni</title>
</head>
<body>
    <h1>Prenotazioni effettuate:</h1>
    <%
        List<String> date = DbService.selectDataPrenotazioni();
    %>
    <form action="select_helper.jsp" method="post">
        <fieldset>
            <legend>Date ordinazioni</legend>
            <p>
                <select name="data">
                <% for (String data : date) {%>
                    <option><%=data%></option>
                <%}%>
                </select>
            </p>
        </fieldset>
        <input type="submit" />
        <input type="reset" />
    </form>
    <br />
    <a href="index.jsp">Home</a>

</body>
</html>
