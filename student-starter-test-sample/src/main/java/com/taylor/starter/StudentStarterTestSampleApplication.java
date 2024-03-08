package com.taylor.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.taylor.starter.models.Student;

@SpringBootApplication
public class StudentStarterTestSampleApplication implements CommandLineRunner {

    @Autowired
    private Student student;

    public static void main(String[] args) {
        SpringApplication.run(StudentStarterTestSampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(student.toString());
    }
}
