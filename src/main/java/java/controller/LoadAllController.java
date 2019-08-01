package java.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class LoadAllController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<entity.Employee> list = ofy().load().type(entity.Employee.class).list();
        req.setAttribute("list-emm",list);
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }
}
