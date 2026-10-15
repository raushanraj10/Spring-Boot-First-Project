package com.example.SpringBootFirstProject.Service;

import com.example.SpringBootFirstProject.Repository.StudentRepository;
import com.example.SpringBootFirstProject.entity.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student servicefunctioncall(Student s)
    {
        System.out.println("Before repository call");
      Student s1= studentRepository.repositoryfuncallbyserviceclass(s);
        System.out.println("Going back to controller");
      return s1;
    }

}
