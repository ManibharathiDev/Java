package com.di.DependecyInjection;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class StaffImpl implements StudentInterface{

    public StaffImpl()
    {
        System.out.println(getClass().getName()+" Loaded");
    }

    @Override
    public String printMyName() {
        return "SenthilKumar";
    }
}
