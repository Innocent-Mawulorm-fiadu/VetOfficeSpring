package com.mallon;

public class Dog implements Pet{
    private String name = "";

    public Dog (String name){
        this.name= name;
    }

    public String speak(){
        return "woof woof";
    }

    public String getName(){
        return name;
    }
}
