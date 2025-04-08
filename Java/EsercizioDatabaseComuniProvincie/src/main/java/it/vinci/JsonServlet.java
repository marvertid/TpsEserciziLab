package it.vinci;

import com.fasterxml.jackson.databind.ObjectMapper;
import it.vinci.db.data.SampleProvincia;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "jsonServlet", value = "/json-servlet")
public class JsonServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("application/json");
        ObjectMapper json = new ObjectMapper();

        SampleProvincia sampleProvincia = json.readValue(req.getReader(), SampleProvincia.class);

        sampleProvincia.setId(sampleProvincia.getId().toUpperCase());

        resp.getWriter().println(json.writeValueAsString(sampleProvincia));
    }

}