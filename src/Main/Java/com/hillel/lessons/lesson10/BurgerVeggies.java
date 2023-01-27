package com.hillel.lessons.lesson10;


public class BurgerVeggies extends Burger {
    public BurgerVeggies(String bun, String cheese, String veggies, String mayoneese) {
        this.bun = bun;
        this.cheese = cheese;
        this.veggies = veggies;
        this.mayoneese = mayoneese;
        System.out.println(printBurgerMethod());
    }

    String printBurgerMethod() {
        return "\nVegetarian burger: " + "\nBun: " + bun + "\nCheese: " + cheese + "\nVeggies: " + veggies +
                "\nMayoneese: " + mayoneese;
    }
}