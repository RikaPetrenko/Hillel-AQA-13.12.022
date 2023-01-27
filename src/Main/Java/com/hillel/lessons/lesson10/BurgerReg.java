package com.hillel.lessons.lesson10;

public class BurgerReg extends Burger {
    public BurgerReg(String bun, String meat, String cheese, String veggies, String mayoneese) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.veggies = veggies;
        this.mayoneese = mayoneese;

        System.out.println(this);
    }


//    @Override
    public String toString() {
        return "Regular burger: " +
                "\nBun: " + bun  +
                "\nMeat: " + meat +
                "\nCheese: " + cheese +
                "\nVeggies: " + veggies +
                "\nMayoneese: " + mayoneese;
    }

}