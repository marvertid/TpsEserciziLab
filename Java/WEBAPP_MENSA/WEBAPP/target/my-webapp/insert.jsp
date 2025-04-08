<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Inserimento dati</title>
    <meta name="author" content="MARVERTI DIEGO 5AI" />
</head>
<body>
    <h1>Inserimento: </h1>
    <form action="insert_helper.jsp" method="post">
        <fieldset>
            <legend>Inserimento dati prenotazione</legend>
            <p>
                <label for="cf">Codice fiscale: </label>
                <input type="text" name="cf" placeholder="AAAAAA00A00A000A" id="cf" />
            </p>
            <p>
                <label for="ordinazione">Ordinazione: </label>
                <input type="text" name="ordinazione" placeholder="Pasta al ragù" id="ordinazione"/>
            </p>
        </fieldset>
        <input type="submit" />
        <input type="reset" />
    </form>
    <br />
    <a href="index.jsp">Home</a>
</body>
</html>
