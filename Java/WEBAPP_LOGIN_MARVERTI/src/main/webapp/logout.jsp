<%
    session.invalidate(); // Distrugge la sessione
    response.sendRedirect("index.jsp"); // Reindirizza alla pagina di login
%>
