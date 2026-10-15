package com.example.SpringBootFirstProject.Controller;

import com.example.SpringBootFirstProject.Service.StudentService;
import com.example.SpringBootFirstProject.entity.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class studentContoller {


//    @PostMapping
//    public String newStudentCreated(@RequestBody Student s){
//        System.out.println(s.getAge());
//        System.out.println(s.getEmail());
//        System.out.println(s.getId());
//        return "Raj";
//    }


    private StudentService studentService;

    public studentContoller(StudentService studentService) {
        this.studentService = studentService;
    }


    @PostMapping("/create")
    public Student newStudentCreated(@RequestBody Student s) {
        System.out.println("Before service call");
     Student s1=studentService.servicefunctioncall(s);
        System.out.println("Returning response to postman");

     return s1;
    }

}
