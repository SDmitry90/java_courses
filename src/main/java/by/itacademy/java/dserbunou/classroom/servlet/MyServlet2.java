package by.itacademy.java.dserbunou.classroom.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet2 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println("Hello from Servlet 2 GET" + request.getParameter("fio"));
    }

    /*
     * public void doPost(HttpServletRequest request, HttpServletResponse response)
     * throws ServletException, IOException {
     * response.getWriter().println("Hello from Servlet 2 POST");
     * response.setContentType("text/html"); }
     */

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fio = req.getParameter("fio");
        resp.setContentType("text/xml");
        resp.getWriter().println("<test>Hello from Servlet 1 Post " + fio + "</test>");
    }

}
