package com.hillel.lessons.Lesson14ExoticFruitShop.Enums;

public enum FruitColor {

    RED("Red"),
    YELLOW("Yellow"),
    WHITE("White");

    private String colorName;
    FruitColor(String colorName) {
        this.colorName = colorName;
    }

}