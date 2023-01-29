package com.hillel.lessons.lesson12.Homework;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Lisa",2,4);
        cat.setAge(1);



        System.out.println("Age " + cat.getAge());
        cat.setWeight(10);



        System.out.println("Weight " + cat.getWeight());
        cat.setName("Lisa");



        System.out.println("Name: " + cat.getName());
    }
}