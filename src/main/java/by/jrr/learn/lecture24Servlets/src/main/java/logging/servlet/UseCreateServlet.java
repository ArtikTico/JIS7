package logging.servlet;

import logging.model.User;
import logging.service.UserService;
import logging.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/users")
public class UseCreateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String contextPath = req.getContextPath();
        UserService userService = new UserServiceImpl();
        User user = userService.createUser(contextPath, contextPath);
        resp.setStatus(200);
        PrintWriter writer = resp.getWriter();
        writer.write(user.toString());
    }
}
