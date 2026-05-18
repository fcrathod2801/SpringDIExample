package com.newone;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Employee implements InitializingBean, DisposableBean {

    // 1. Constructor
    public Employee() {
        System.out.println("1. Constructor Called");
    }

    // 2. Dependency Injection
    private String name;

    public void setName(String name) {
        this.name = name;
        System.out.println("2. Setter Injection Called");
    }

    // 3. PostConstruct
    @PostConstruct
    public void initMethod() {
        System.out.println("3. @PostConstruct Called");
    }

    // 4. InitializingBean
    @Override
    public void afterPropertiesSet()  {
        System.out.println("4. afterPropertiesSet() Called");
    }

    // Business Method
    public void display() {
        System.out.println("5. Bean Ready To Use");
    }

    // 5. PreDestroy
    @PreDestroy
    public void preDestroyMethod() {
        System.out.println("6. @PreDestroy Called");
    }

    // 6. DisposableBean
    @Override
    public void destroy() {
        System.out.println("7. destroy() Called");
    }
}