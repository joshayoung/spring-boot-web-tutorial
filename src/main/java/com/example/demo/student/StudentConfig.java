package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student joe = new Student(
                    "Joe",
                    "joe@example.com",
                    LocalDate.of(1980, Month.JANUARY , 10),
                    21
            );
            Student sally = new Student(
                    "Sally",
                    "sally@gmail.com",
                    LocalDate.of(1990, Month.MARCH , 4),
                    21
            );

            repository.saveAll(
                    List.of(joe, sally)
            );
        };
    }
}
