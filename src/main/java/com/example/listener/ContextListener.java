package com.example.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.time.LocalDateTime;

public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        LocalDateTime servletTimeInit = LocalDateTime.now();
        context.setAttribute("servletTimeInit" , servletTimeInit);
    }
    //write your code here!
}
