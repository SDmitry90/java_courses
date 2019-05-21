package by.itacademy.java.dserbunou.classroom.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

public class MyServlet extends HttpServlet {

    private String message;

    /*
     * public void init() throws ServletException { message = "Hello World"; }
     */

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");

        // ServletContext servletCont = getServletContext();
        // out.println(servletCont.getInitParameter("databaseUrl"));

        Cookie myCookie = new Cookie("testCookie1", "cookieValue1");
        myCookie.setMaxAge(24 * 60 * 60);
        response.addCookie(myCookie);

        Cookie myCookie1 = new Cookie("testCookie2", "cookieValue2");
        myCookie1.setComment("Hello");
        response.addCookie(myCookie1);

        Cookie[] myCookie2 = request.getCookies();
        String cokieName = "testCookie";
        String cookieValue = "";
        for (int i = 0; i < myCookie2.length; i++) {
            Cookie cookie = myCookie2[i];
            if (cokieName.equals(cookie.getName())) {
                cookieValue = cookie.getValue();
                break;
            }

        }

    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        // message = "Hello World";
        // ServletConfig conf = getServletConfig();
        // System.out.println(conf.getInitParameter("initParam"));
    }

    public void destroy() {
        // do nothing.
    }

}
