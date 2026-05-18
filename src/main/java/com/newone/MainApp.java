package com.newone;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        // Start Container
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Get Bean
        Employee employee = context.getBean(Employee.class);

        employee.display();

        // Close Container
        context.close();
    }
}