package com.hillel.lessons.Lesson14ExoticFruitShop.Items;

import com.hillel.lessons.Lesson14ExoticFruitShop.Abstraction.FruitItem;

public class Banana extends FruitItem {


    public Banana(String name, double weight, double size, String color, String country, int quantity) {
        super(name, weight, size, color, country, quantity);
    }




    public String getDescription() {
        return "Banana: " + getColor() + getCountry() + getQuantity();

    }








}
