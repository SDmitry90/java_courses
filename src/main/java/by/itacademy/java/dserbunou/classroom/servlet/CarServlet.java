package by.itacademy.java.dserbunou.classroom.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.itacademy.java.dserbunou.home.practice7.datalayer.ICarDao;
import by.itacademy.java.dserbunou.home.practice7.datalayer.db.CarDBDaoImpl;
import by.itacademy.java.dserbunou.home.practice7.datalayer.entity.Car;

public class CarServlet extends HttpServlet {
    ICarDao dao = CarDBDaoImpl.getInstance();

    private void redirectToList(HttpServletResponse resp) throws IOException {
        resp.sendRedirect("/cars.jsp");
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

        String carName = req.getParameter("name");
        Integer id = null;
        try {
            id = Integer.valueOf(req.getParameter("id"));
        } catch (NumberFormatException e) {
        }
        if (id == null) {
            Car car = new Car();
            car.setName(carName);
            dao.insert(car);
        } else {
            Car car = new Car();
            car.setName(carName);
            car.setId(id);
            dao.update(car);

        }
        redirectToList(resp);

    }
}
