package by.itacademy.java.dserbunou.classroom.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.itacademy.java.dserbunou.home.practice7.datalayer.IBrandDao;
import by.itacademy.java.dserbunou.home.practice7.datalayer.db.BrandDBDaoImpl;
import by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Brand;

public class BrandServlet extends HttpServlet {
    IBrandDao dao = BrandDBDaoImpl.getInstance();

    private void redirectToList(HttpServletResponse resp) throws IOException {
        resp.sendRedirect("/brands.jsp");
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        String action = req.getParameter("action");
        if ("delete".equals(action)) {
            dao.delete(id);
            redirectToList(resp);
        } else {
            throw new RuntimeException("unsupported operation");
        }

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String brandName = req.getParameter("name");
        Integer id = null;
        try {
            id = Integer.valueOf(req.getParameter("id"));
        } catch (NumberFormatException e) {
        }
        if (id == null) {
            Brand brand = new Brand();
            brand.setName(brandName);
            dao.insert(brand);
        } else {
            Brand brand = new Brand();
            brand.setName(brandName);
            brand.setId(id);
            dao.update(brand);

        }
        redirectToList(resp);

    }
}