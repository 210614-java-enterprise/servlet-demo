package dev.rehm.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HealthCheckServlet extends HttpServlet {

    public HealthCheckServlet(){};

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try(PrintWriter pw = resp.getWriter()){
            pw.write("{ \"status\" : \"UP\" }");
        }
    }
}
