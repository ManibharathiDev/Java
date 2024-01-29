package com.di.DependecyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private StudentInterface s;
    private College c;


    @Autowired
    public StudentController(@Qualifier("staff") StudentInterface s, College c)
    {
        this.s = s;
        this.c = c;
    }

    @GetMapping("/name")
    public String getName()
    {
        //StudentInterface s = new StudentImpl();
        return s.printMyName();
    }

    @GetMapping("/college")
    public String getCollege(){
        c.setName("IRTT");
        return c.getName();
    }

    @GetMapping("/student")
    public Student getStudent()
    {

        return Student.builder()
                .id(1)
                .age(23)
                .stuName("Manibharathi")
                .address("Nagercoil")
                .build();

//        Student s = new Student();
//        s.setId(2);
//        s.setStuName("Manibharathi");
//        s.setAddress("Raja Street");
//        return s;
    }

}
