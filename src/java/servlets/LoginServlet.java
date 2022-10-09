/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.*;
import service.*;

/**
 *
 * @author Eric
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/Login"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession s = request.getSession();
        if (request.getParameter("logout") != null) {
            s.invalidate();
            request.setAttribute("message", "Logout Successful!");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        } else {
            if (s.getAttribute("username") == null) {
                getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            } else {
                response.sendRedirect("home");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession s = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User u = AccountService.login(username, password);

        if (u == null) {
            request.setAttribute("message", "Invalid credentials, try again.");
            u = new User(username, password);
            request.setAttribute("user", u);
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        } else {
            s.setAttribute("username", username);
            response.sendRedirect("home");
        }
    }
}
