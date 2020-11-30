package com.kishore.kamal.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationIntializerSpringControlled extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class[] classArr = {ApplicationContextConfig.class};
        return classArr;
    }

    @Override
    protected String[] getServletMappings() {
        String[] arr = {"/calculator/*"};
        return arr;
    }
}
