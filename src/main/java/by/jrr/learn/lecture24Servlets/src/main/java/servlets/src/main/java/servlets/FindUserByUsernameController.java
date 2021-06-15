package servlets;

import entity.service.UserServiceImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/find-user/*")
public class FindUserByUsernameController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var pathInfo = req.getPathInfo().split("/");
        if (pathInfo.length == 2) {
            var userService = new UserServiceImpl();
            var user = userService.findByUserName(pathInfo[1]).toString();
            var writer = resp.getWriter();
            writer.write(user);
        }

    }
}
