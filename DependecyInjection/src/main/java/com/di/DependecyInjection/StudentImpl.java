package com.di.DependecyInjection;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class StudentImpl implements StudentInterface{

    StudentImpl()
    {
        System.out.println("Lazy Initialization");
    }

    @Override
    public String printMyName() {
        return "Manibharathi";
    }
}
