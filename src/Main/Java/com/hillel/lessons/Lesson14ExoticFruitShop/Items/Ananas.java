package com.hillel.lessons.Lesson14ExoticFruitShop.Items;

import com.hillel.lessons.Lesson14ExoticFruitShop.Abstraction.FruitItem;

public class Ananas extends FruitItem {

    public Ananas(String name, double weight, double size, String color, String country, int quantity) {
        super(name, weight, size, color, country, quantity);
    }

    @Override
    public String getDescription() {
        return "Ananas: " + getColor() + getCountry() + getQuantity();


    }


}
