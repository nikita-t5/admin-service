package ru.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdminServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(AdminServiceApp.class, args);
        System.out.println("hi");
    }
}
