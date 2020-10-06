package classes;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UserController extends HttpServlet {
    User[] users;
    int count;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user;
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        for (int i = 0; i < count; i++) {
            if (users[i].getUsername().equals(username) && users[i].getPassword().equals(password)) {
                if (users[i].isAdmin()) {
                    user = new User(username, password, users[i].getId(), true);
                } else {
                    user = new User(username, password, users[i].getId(), false);
                }
                req.setAttribute("user", user);
                return;
            }
        }
        resp.sendRedirect("/Web_app_week2_war/servlets.Forward");
    }
}
