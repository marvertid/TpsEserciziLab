package it.vinci;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // language=html
        String htmlBody = "<html>" +
                "<body>" +
                "<h1>" +
                message +
                "</h1>" +
                "</body>" +
                "</html>";

        PrintWriter out = response.getWriter();
        out.println(htmlBody);
    }

    public void destroy() {
    }
}