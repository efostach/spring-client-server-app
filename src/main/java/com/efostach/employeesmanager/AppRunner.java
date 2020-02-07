package com.efostach.employeesmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class AppRunner {
    @SpringBootApplication
    public static class EmployeesManager {
        public static void main(String[] args) {
            SpringApplication.run(EmployeesManager.class);
        }
    }
}