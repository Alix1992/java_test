package com.southwind.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringboottestApplication {

    public static void main(String[] args) {
        System.out.println("111");
        SpringApplication.run(SpringboottestApplication.class, args);
        System.out.println("222");
    }

}
