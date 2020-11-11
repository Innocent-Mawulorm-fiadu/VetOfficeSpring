package com.mallon;

public class Cat implements Pet {

    private String name = "";
    private int age;

    public Cat (String name){
        this.name= name;
    }

    public String speak(){
        return "meow meow";
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

}
