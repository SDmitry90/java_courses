package by.itacademy.java.dserbunou.classroom.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogOutServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(true);
        String userId = ((String) session.getAttribute("userId"));
        // response.getWriter().println("Hello: " + userId == null ? "unknown user" :
        // userId);

        String unknowUser = userId == null ? "unknow user" : userId;
        out.println("Hello:" + unknowUser);
    }

}
