package dev.rehm.servlets;

import dev.rehm.daos.ActorDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class ActorServlet extends HttpServlet {

    public ActorServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp); this would just return a 405 status code

        // obtain list of actor objects from database or other source

        // convert actor objects to json (Jackson databind)

        // use the printwriter to write json to response body

    }
}
