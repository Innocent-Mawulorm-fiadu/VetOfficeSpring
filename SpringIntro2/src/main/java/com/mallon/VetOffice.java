package com.mallon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VetOffice {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        Cat pet = (Cat) ctx.getBean("catBean");

        System.out.println(pet.speak());

        Owner owner1 = new Owner();
        owner1.setPet(pet);
        System.out.println(owner1.makeCatSpeak());

        pet.setName("Mouse");
        System.out.println(owner1.makeCatSpeak());

        pet = (Cat) ctx.getBean("catBean");
        Owner owner2 = new Owner();
        owner2.setPet(pet);
        System.out.println(owner2.makeCatSpeak());

    }
}
