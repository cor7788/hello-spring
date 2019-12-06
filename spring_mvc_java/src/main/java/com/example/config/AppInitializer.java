package com.example.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    /*@Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter("UTF-8");
        return new Filter[]{characterEncodingFilter};
    }*/

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        // 配置 DispatcherServlet
        // registration.setLoadOnStartup(1);
        // 配置 Servlet 3.0 对 Multipart 的支持
        long maxFileSize = 2 * 1024 * 1024;
        long maxRequestSize = 4 * 1024 * 1024;
        int threshold = 0;
        registration.setMultipartConfig(
                new MultipartConfigElement("/my_app/uploads", maxFileSize, maxRequestSize, threshold));
    }


}
