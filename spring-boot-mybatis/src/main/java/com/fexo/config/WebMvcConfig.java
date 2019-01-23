package com.fexo.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import java.util.List;

/**
 * @author
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
        FastJsonHttpMessageConverter jsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        com.alibaba.fastjson.support.config.FastJsonConfig jsonConfig = new com.alibaba.fastjson.support.config.FastJsonConfig();
        jsonConfig.setSerializerFeatures(SerializerFeature.WriteNullListAsEmpty,
                SerializerFeature.DisableCircularReferenceDetect);
        jsonHttpMessageConverter.setFastJsonConfig(jsonConfig);
        converters.add(jsonHttpMessageConverter);
    }

    @Override
   public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/druid/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}
