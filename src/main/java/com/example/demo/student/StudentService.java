package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//@Component
@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Quoc",
                        "quocdbph17660@fpt.edu.vn",
                        LocalDate.of(2002, Month.APRIL, 7),
                        21
                )
        );
    }
}
