package com.anotherexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("emp.xml");
        Employee employee1= context.getBean("emp", Employee.class);

        employee1.display();
        employee1.setDepartment("HR");
        employee1.setEmail("asd@gmail.com");
        Employee employee2= context.getBean("emp", Employee.class);
        employee2.display();


    }
}
