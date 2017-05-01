package com.zzh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zzh on 2017/4/30.
 */
@RestController
public class StudentController {

    @Autowired
    StudentRepository repository;

    @GetMapping("/getstudents")
    public List<Student> getStudents() {
        return repository.findAll();
    }

    @PostMapping("/addstudent")
    public Student addStudent(@RequestParam("name") String name) {
        Student student1 = new Student();
        student1.setName(name);
        return repository.save(student1);
    }
}
