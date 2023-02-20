package com.hillel.lessons.Lesson14ExoticFruitShop.Abstraction;

public abstract class FruitItem {

    private String name;
    private double weight;
    private double size;
    private String color;
    private String country;
    private int quantity;

    public FruitItem(String name, double weight, double size, String color, String country, int quantity) {
        this.name = name;
        this.weight = weight;
        this.size = size;
        this.color = color;
        this.country = country;
        this.quantity = quantity;
    }

    public String getName() {

        return name;
    }

    public double getWeight() {

        return weight;
    }

    public double getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getCountry() {
        return country;
    }

    public int getQuantity() {
        return quantity;
    }



    public void setCountry(String country) {
        this.country = country;
    }



    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    public void setWeight(int weight) {
        this.weight = weight;
    }



    public void setColor(String color) {
        this.color = color;
    }



    public abstract String getDescription();


}
