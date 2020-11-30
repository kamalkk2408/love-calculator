//package com.kishore.kamal.config;
//
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.context.support.XmlWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//
//import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration;
//
//public class ApplicationInitializer implements WebApplicationInitializer {
//    @Override
//    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
//        System.out.println("Executing::com.kishore.kamal.config.config.ApplicationInitializer.onStartup");
//
//        //Application context
////        XmlWebApplicationContext applicationContext = new XmlWebApplicationContext();
////        applicationContext.setConfigLocation("classpath:applicationContext.xml");
//
//        //Annotaion Application context
//        AnnotationConfigWebApplicationContext annotationApplicationContext = new AnnotationConfigWebApplicationContext();
//        annotationApplicationContext.register(ApplicationContextConfig.class);
//
//        //Dispatcher Servlet
//        DispatcherServlet dispatcherServlet = new DispatcherServlet(annotationApplicationContext);
//        ServletRegistration.Dynamic servletRegistration =  servletContext.addServlet("dispatcherServlet", dispatcherServlet);
//        servletRegistration.setLoadOnStartup(1);
//        servletRegistration.addMapping("/calculator/*");
//
//    }
//
//}
