package com.wangxu.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

/**
 * @author 19377
 */
@SpringBootApplication
public class ActiveMqApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActiveMqApplication.class, args);
    }
}
