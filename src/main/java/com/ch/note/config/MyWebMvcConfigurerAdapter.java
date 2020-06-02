package com.ch.note.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * <p>
 *
 * </p>
 *
 * @author ddyang
 * @date 2020/06/02
 */

@Configuration
public class MyWebMvcConfigurerAdapter implements WebMvcConfigurer {
    @Value("${file.path}")
    private String filePath;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //指向外部目录
        registry.addResourceHandler("/img/**").addResourceLocations("file:" + filePath);
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }
}
