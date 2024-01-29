package com.di.DependecyInjection;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Student {
    private int id;
    private String stuName;
    private int age;
    private String address;
}
