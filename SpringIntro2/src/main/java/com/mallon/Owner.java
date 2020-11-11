package com.mallon;

public class Owner {

    Pet pet;

    //constructor injection
    public Owner(){

    }

    //setter injection
    public void setPet(Pet pet){
         this.pet = pet;
    }

    public String makeCatSpeak(){
        return "My name is " + pet.getName();
    }
}
