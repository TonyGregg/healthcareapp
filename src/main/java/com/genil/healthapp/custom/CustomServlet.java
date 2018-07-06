package com.genil.healthapp.custom;

import org.springframework.boot.autoconfigure.web.ServerProperties;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by genil on 7/3/18 at 14 12
 **/
public class CustomServlet implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
