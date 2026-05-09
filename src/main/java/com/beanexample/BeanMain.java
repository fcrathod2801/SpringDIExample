package com.beanexample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanMain {

    public static void main(String[] args) {

        // Load XML Configuration File
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        // Get Bean from Container
        MessageService service =
                context.getBean("messageService", MessageService.class);

        // Call Method
        service.sendMessage();

    }
}