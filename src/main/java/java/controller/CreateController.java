package java.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;


import entity.Employee;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class CreateController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/create.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fullname = req.getParameter("fullname");
        String dob = req.getParameter("dob");
        String address = req.getParameter("address");
        String position = req.getParameter("position");
        String depar = req.getParameter("depar");

//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(Date.from(dob));


        entity.Employee employee = new Employee();
        employee.setFullname(fullname);
        employee.setDob(dob);
        employee.setAddress(address);
        employee.setPosition(position);
        employee.setDepartment(depar);
        ofy().save().entity(employee).now();
        resp.sendRedirect("/");
    }
}
