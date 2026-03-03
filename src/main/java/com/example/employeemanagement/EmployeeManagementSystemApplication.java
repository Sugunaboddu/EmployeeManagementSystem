package com.example.employeemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementSystemApplication {

    public static void main(String[] args) {
        // Ignore incompatible class format errors (needed for JDK 24)
        System.setProperty("spring.classformat.ignore", "true");
        SpringApplication.run(EmployeeManagementSystemApplication.class, args);
    }

}
