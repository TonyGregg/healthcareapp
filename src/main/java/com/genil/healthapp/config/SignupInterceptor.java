package com.genil.healthapp.config;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by genil on 6/16/18 at 12 31
 *
 *
 *  extend HandleInterceptorAdaptor class
 *  and ovrride
 * @preHandle for pre handling requests prior to controller.
 *
 * @postHandle after processed by the controller
 * @afterCompletion after view rendered to view
 *
 * It has to be done for only a certain path.
 * so implement  WebMvcConfigurer in a class
 * and call it as @Configuration
 *
 **/
public class SignupInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String emailAddress = request.getParameter("emailAddress");
        String password = request.getParameter("password");
        if(StringUtils.isEmpty(emailAddress) || StringUtils.containsWhitespace(emailAddress) ||
                StringUtils.isEmpty(password) ||
                StringUtils.containsWhitespace(password)) {
            throw new Exception("Invalid email address or password. Please try again.");
        }
        return true;
    }
}
