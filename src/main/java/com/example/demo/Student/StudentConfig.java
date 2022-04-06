package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student jimi = new Student(
                    1L,
                    "Jimsdasdi",
                    "jimissasdhukurow@gmail.com",
                    LocalDate.of(1990, APRIL, 11)
            );
            Student bashgaJimi = new Student(
                    2L,
                    "JimiBeti",
                    "Testemailler@gmail.com",
                    LocalDate.of(1995, APRIL, 11)
            );


            studentRepository.saveAll(List.of(jimi, bashgaJimi));
        };
    }
}
