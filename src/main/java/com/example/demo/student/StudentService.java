package com.example.demo.student;

import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Component
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Test",
                        "test@gmail.com",
                        LocalDate.of(1980, Month.JANUARY, 10),
                        21
                )
        );
    }
}
