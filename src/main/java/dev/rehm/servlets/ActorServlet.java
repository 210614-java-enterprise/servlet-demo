package dev.rehm.servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.rehm.daos.ActorDaoImpl;
import dev.rehm.models.Actor;
import dev.rehm.services.ActorService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


public class ActorServlet extends HttpServlet {

    private ActorService actorService = new ActorService(new ActorDaoImpl());

    public ActorServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp); this would just return a 405 status code

        // obtain list of actor objects from database or other source
        List<Actor> actors = actorService.getAll();

        // convert actor objects to json (Jackson databind)
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(actors);

        // use the printwriter to write json to response body
        try(PrintWriter pw = resp.getWriter()){
            pw.write(json);
        }

    }
}
