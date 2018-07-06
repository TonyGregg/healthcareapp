package com.genil.healthapp.config;

import com.genil.healthapp.custom.CustomServlet;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.Registration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by genil on 7/3/18 at 14 13
 **/
public class MyServletInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();

        Registration.Dynamic myServlet = servletContext.addServlet("myservlet",CustomServlet.class);
        ((ServletRegistration.Dynamic) myServlet).addMapping("/custom/**");

    }
}
