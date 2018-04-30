package com.ele.me.web;
 
//
//import org.apache.catalina.filters.CorsFilter;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ImportResource;
import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;;
 
 
//@SpringBootApplication
//@ImportResource(locations={"classpath:pylon.xml"})
//@EnableAutoConfiguration(exclude = RedisAutoConfiguration.class)
public class Application {

    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        return corsConfiguration;
    }

//    /**
//     * 跨域过滤器
//     * @return
//     */
//    @Bean
//    public CorsFilter corsFilter() {
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", buildConfig()); // 4
//        return new CorsFilter();
//    }
//
//    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
//    }
}