package com.bean.life;

import org.springframework.context.ApplicationContext;

public class MainClassForBeanLife {
    public static void main(String[] args){
        ApplicationContext context = new org.springframework.context.support.ClassPathXmlApplicationContext("emp1.xml");
        Emp1 emp1 = context.getBean("emp1", Emp1.class);
            System.out.println("Employee Name: " + emp1.getName());

    }
}
