//package com.example.my_licence.Configuration;
//
//import org.apache.catalina.filters.CorsFilter;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class corsconfig {
////    @Value("${allowed.origin}")
////    private String allowedOrigin;
////    @Bean
////    public WebMvcConfigurer getCorsConfiguration(){
////        return new WebMvcConfigurer(){
////            @Override
////                    public void addCorsMappings(CorsRegistry registry){
////                registry.addMapping("/api/v1/customer/all")
////                        .allowedOrigins("allowedOrigin")
////                        .allowedMethods("GET","POST","PUT","DELETE")
////                        .allowedHeaders("Authorization","Content-Type");
////            }
////        };
////
////    }
//
//
//    @Bean
//    public CorsFilter corsFilter() {
//        UrlBasedCorsConfigurationSource
//                source = new
//                UrlBasedCorsConfigurationSource();
//        CorsConfiguration config = new CorsConfiguration();
//
//        config.addAllowedOrigin("http://localhost:4200");
//        config.addAllowedMethod("*");
//        config.addAllowedHeader("*");
//
//
//        source.registerCorsConfiguration("api/v1/customer/all", config);
//        return new CorsFilter();
//    }
//}
