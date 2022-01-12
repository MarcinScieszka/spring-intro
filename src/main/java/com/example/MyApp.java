package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);
        MessageService messageService2 = applicationContext.getBean("messageService", MessageService.class);

        System.out.println(messageService.hashCode() + " --- " + messageService2.hashCode());

        System.out.println(messageService.getMessage());

        applicationContext.close();
    }
}
