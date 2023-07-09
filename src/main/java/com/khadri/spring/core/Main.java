package com.khadri.spring.core;


import com.khadri.spring.core.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Customer customer = context.getBean(Customer.class);
        System.out.println(customer.getEvCarList());
        System.out.println(customer.getFuelCarList());



    }
}