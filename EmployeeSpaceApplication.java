package com.employeespace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class EmployeeSpaceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeSpaceApplication.class, args);
    }
}