package com.anotherexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("emp.xml");
        Employee employee= context.getBean("emp", Employee.class);
        employee.display();



    }
}
