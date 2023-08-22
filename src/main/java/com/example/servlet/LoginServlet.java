package com.example.servlet;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
    //write your code here!

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
        HttpSession session = req.getSession(false);
        if(session != null && session.getAttribute("user") != null)
            resp.sendRedirect("login.jsp");
        else
            resp.sendRedirect("/user/hello.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        if(login.length() != 0 && !password.isBlank()){
            session.setAttribute("user" , login);
            resp.sendRedirect("/user/hello.jsp");}
        else
            resp.sendRedirect("/login.jsp");


    }
}
