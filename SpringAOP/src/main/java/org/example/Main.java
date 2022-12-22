package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        org.example.aspects.ApplicationContext.authenticatedUser("root","1234",new String[]{"ADMIN"});
        //Les packages scannées
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        org.example.metier.IMetier metier=context.getBean(org.example.metier.IMetier.class);
        metier.process();
        System.out.println(metier.compute());
        System.out.println("--------------------------");
    }
}
