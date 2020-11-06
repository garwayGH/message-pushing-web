package com.viatom.messagepushingweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * SpringMVC配置类
 * @author qiujiawei
 * @date 2020/01/17
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * 注册编码转换器Bean
     * @return StringHttpMessageConverter
     */
    @Bean
    public HttpMessageConverter<String> responseBodyConverter() {
        return new StringHttpMessageConverter(StandardCharsets.UTF_8);
    }


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //配置访问映射
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/","classpath:/public/","classpath:/resources/","classpath:/");
        registry.addResourceHandler("/swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
    }

    /**
     * 添加转换器
     * @param converters
     */
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(responseBodyConverter());
    }

    

}
