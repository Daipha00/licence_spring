package com.example.my_licence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@RestController
public class MyLicenceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyLicenceApplication.class, args);
    }
        @RequestMapping("/")
        public String hello () {
            return "hello world";
        }
//        @Override
//        @Configuration
//        public class CorsConfig implements WebMvcConfigurer {
//        public void addCorsMappings(CorsRegistry registry) {
//            registry.addMapping("/api/v1/customer/all") // Adjust the mapping pattern according to your API endpoints
//                    .allowedOrigins("http://localhost:4200") // Adjust the allowed origin to match your Angular application's URL
//                    .allowedMethods("GET", "POST", "PUT", "DELETE") // Adjust the allowed HTTP methods as needed
//                    .allowedHeaders("Authorization","Content-Type","Access-Control-Allow-Origin"); // Adjust the allowed headers as needed
//        }
//    }
    }
