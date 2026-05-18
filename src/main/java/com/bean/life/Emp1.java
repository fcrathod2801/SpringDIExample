package com.bean.life;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Emp1 implements InitializingBean , DisposableBean{

    private String name;

    public Emp1() {
        System.out.println("1. Bean Created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void afterPropertiesSet()  {
        System.out.println("InitializingBean method called for Emp1");
    }

    @Override
    public void destroy()  {
        System.out.println("DisposableBean method called for Emp1");
    }



    public void work() {
        System.out.println("4. Bean Ready");
    }




}
