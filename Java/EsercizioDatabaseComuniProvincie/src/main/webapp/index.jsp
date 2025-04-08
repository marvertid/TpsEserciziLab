<%@ page import="it.vinci.db.DbService" %>
<%@ page import="it.vinci.db.data.SampleProvincia" %>
<%@ page import="java.util.List" %>
<%@ page import="it.vinci.db.data.SampleComune" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP - Hello World</title>
        <script>
            const selectElement = document.querySelector("#provincia-select");
            const result = document.querySelector("#provincie");

            selectElement.addEventListener("change", (event) => {
               document.getElementById("provincia-select").submit();
            });

        </script>
    </head>
    <body>
        <h1>Esercezio Provincia Comune</h1>
        <form action="index.jsp">
            <label for="provincia-select">Seleziona una provincia:</label>
            <select name="provincie" id="provincia-select">
                <% for (SampleProvincia provincia : DbService.getProvince()) { %>
                    <option value="<%=provincia.getId()%>"><%=provincia.getId()%></option>
                <%}%>
            </select>
        </form>
        <label for="comune-select">Seleziona un comune:</label>
            <select name="comuni" id="comune-select">
                <% for (SampleComune comune : DbService.getComuni(request.getParameter("provincie"))) { %>
                    <option value="<%=comune.getName()%>"><%=comune.getName()%></option>
                <%}%>
            </select>


    </body>
</html>
