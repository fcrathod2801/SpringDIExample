package com.anotherexample.autowired;

import com.anotherexample.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredMain {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("emp1.xml");
        Car car= context.getBean("car", Car.class);
        
        car.setEngine(context.getBean("engine", Engine.class));

    }
}
