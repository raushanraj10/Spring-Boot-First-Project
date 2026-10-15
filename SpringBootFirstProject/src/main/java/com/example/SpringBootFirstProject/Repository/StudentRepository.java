package com.example.SpringBootFirstProject.Repository;

import com.example.SpringBootFirstProject.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    public Student repositoryfuncallbyserviceclass(Student s)
    {
        System.out.println("Before save");
        Student s1=s;
        System.out.println("After save back to repository");
        return s1;
    }
}
