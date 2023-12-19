package com.spring.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FileDataBaseApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(FileDataBaseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application is running");
    }
}