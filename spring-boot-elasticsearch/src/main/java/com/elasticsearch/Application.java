package com.elasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *@author
 */
@SpringBootApplication
@EnableWebMvc
public class Application {
    public static void main(String[] args) {

            SpringApplication.run(Application.class, args);

    }
}
