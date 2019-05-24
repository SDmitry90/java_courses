package by.itacademy.java.dserbunou.classroom.filters;

import java.io.IOException;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthorisationFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        User basic = new User();
        basic.setPassword("basicpassword");
        basic.getAllowedResourses().add("/r1");

        User admin = new User();
        admin.setPassword("adminpassword");
        List<String> paths = Arrays.asList("/r1", "/r2", "/r3", "/r4");
        admin.getAllowedResourses().addAll(paths);
        USER_DB.put("admin", admin);
        USER_DB.put("basic", basic);
    }

    @Override
    public void destroy() {

    }

    private final Map<String, User> USER_DB = new HashMap<>();

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String authHeader = request.getHeader("Authorization");
        if (authHeader == null) {
            send401(response, "Authorization header is missing");
            return;
        }
        String[] authHeaderValues = authHeader.split(" ");
        if (authHeaderValues == null || authHeaderValues.length != 2) {
            send401(response, "Something wrong with header content");
            return;
        }

        String authScheme = authHeaderValues[0];
        String credString = authHeaderValues[1];
        if (!authScheme.equalsIgnoreCase("Basic")) {
            send401(response, "unsupported authorization scheme");
            return;
        }

        String credentials = new String(Base64.getDecoder().decode(credString), "UTF-8");

        String[] userAndPass = credentials.split(":");
        if ((userAndPass == null) || (userAndPass.length != 2)) {
            send401(response, "something wrong with decoded token");
            return;

        }

        String login = userAndPass[0];
        String password = userAndPass[1];

        User user = USER_DB.get(login);
        if (user == null) {
            send401(response, "unknown username");
            return;
        }
        if (!user.getPassword().equalsIgnoreCase(password)) {
            send401(response, "invalid password");
            return;
        }

        List<String> allowedResources = user.getAllowedResourses();
        String currentPath = request.getRequestURI();
        if (!allowedResources.contains(currentPath)) {
            send403(response);
            return;
        }
        filterChain.doFilter(request, response);
    }

    private void send401(final HttpServletResponse response, final String message) throws IOException {
        response.setHeader("WWW-Authenticate", "Basic realm=test");
        response.sendError(401, message);
    }

    private void send403(final HttpServletResponse response) throws IOException {
        response.sendError(403);
    }

}
