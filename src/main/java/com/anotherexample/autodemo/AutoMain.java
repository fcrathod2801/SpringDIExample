package com.anotherexample.autodemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoMain {
    public static void main(String [] args){

        ApplicationContext context=new ClassPathXmlApplicationContext("emp1.xml");
        Address address=new Address();
        Student student=context.getBean("std",Student.class);
        student.display("Akshay");


    }
}
