package com.hillel.lessons.lesson10;

public class BurgerDiet extends Burger {
    public BurgerDiet(String bun, String meat, String cheese, String veggies) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.veggies = veggies;

        System.out.println();
        System.out.println("Diet burger");
        System.out.println("Bun: " + bun);
        System.out.println("Meat: " + meat);
        System.out.println("Cheese: " + cheese);
        System.out.println("Veggies: " + veggies);
    }
}