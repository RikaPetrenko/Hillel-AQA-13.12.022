package com.hillel.lessons.lesson12.Homework;

public class Cat {

    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty() || !name.matches("^[a-zA-Z]+$") || name.length() > 35) {
            System.out.println("Whoops, that doesn't work, please, try better next time!");
        } else {
            this.name = name;
            System.out.println("Whoah! Looks perfect. The new name is: " + name);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1 || age > 25) {
            System.out.println("Whoops, that doesn't work, please, try better next time!");
        } else {
            this.age = age;
            System.out.println("Whoah! Looks perfect. The age is set to: " + age);
        }
    }

    public int getWeight () {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight < 1 || weight > 22) {
            System.out.println("Your kitty seems to be out of range a bit. May be try again?");
        } else {
            this.weight = weight;
            System.out.println("Whoah! Looks perfect. The weight is set to: " + weight);
        }
    }



}
