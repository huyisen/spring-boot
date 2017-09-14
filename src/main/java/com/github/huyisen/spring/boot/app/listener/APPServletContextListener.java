package com.github.huyisen.spring.boot.app.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class APPServletContextListener implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        servletContextEvent.getServletContext().setAttribute("some","something");



        System.out.println("contextInitialized ----------------->");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

        String some = (String) servletContextEvent.getServletContext().getAttribute("some");
        System.out.println("contextDestroyed ----------------->");
        System.out.println(some);

    }

}
