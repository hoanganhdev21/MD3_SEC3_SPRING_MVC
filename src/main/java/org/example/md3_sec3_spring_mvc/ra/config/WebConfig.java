package org.example.md3_sec3_spring_mvc.ra.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * The WebConfig class is a Java class that extends
 * AbstractAnnotationConfigDispatcherServletInitializer and provides configuration for the web
 * application.
 */
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    // The `getRootConfigClasses()` method is used to specify the configuration classes for the root
    // application context. In this case, it returns an empty array `new Class[0]`, indicating that
    // there are no specific configuration classes for the root application context.
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    // The `getServletConfigClasses()` method is used to specify the configuration classes for the
    // servlet application context. In this case, it returns an array containing the `AppConfig` class,
    // indicating that the `AppConfig` class provides the configuration for the servlet application
    // context.
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    // The `getServletMappings()` method is used to specify the URL patterns that the DispatcherServlet
    // should be mapped to. In this case, it returns an array containing the string `"/"`, indicating
    // that the DispatcherServlet should handle all requests for the root URL ("/").
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
