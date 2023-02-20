package com.hillel.lessons.Lesson14ExoticFruitShop.Items;

import com.hillel.lessons.Lesson14ExoticFruitShop.Abstraction.FruitItem;

public class DragonFruit extends FruitItem {


    public DragonFruit(String name, double weight, double size, String color, String country, int quantity, String FruitColor) {
        super(name, weight, size, color, country, quantity);
        this.FruitColor = FruitColor;
    }

    private String FruitColor;


    public String getFruitColor() {
        return FruitColor;
    }



    public void setFruitColor(String dragonFruitColor) {
        this.FruitColor = getFruitColor();
    }

    public String getDescription() {
        return "DragonFruit: " + getColor() + getCountry() + getQuantity();
    }

    @Override
    public String toString() {
        return "Dragon Fruit" + " " + FruitColor + getCountry() + " " + getQuantity();
    }



}
