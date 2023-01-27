package com.hillel.lessons.lesson10;

public class BurgerMain {
    public static void main(String[] args) {
        BurgerReg burger1 = new BurgerReg("Bun", "Meat", "Mozarella", "Veggies", "Mayoneese");

        BurgerDiet burger2 = new BurgerDiet("Bub", "Meat", "Mozarella", "Veggies");

        BurgerVeggies burger3 = new BurgerVeggies("Bun", "Mozarella", "Veggies", "Mayoneese");
    }

}