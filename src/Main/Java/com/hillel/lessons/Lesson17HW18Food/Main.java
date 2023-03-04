package com.hillel.lessons.Lesson17HW18Food;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Products> productsList = new ArrayList<Products>();
        productsList.add(new Products("Apple", 1));
        productsList.add(new Products("Banana", 3));
        productsList.add(new Products("Orange", 5));
        productsList.add(new Products("Expensive Apple", 10));
        productsList.add(new Products("ExpensiveBanana", 13));
        productsList.add(new Products("ExpensiveOrange", 15));
        ProductMarket productMarket = new ProductMarket(productsList);

        productMarket.getName();
        System.out.println(productMarket.getName());
        productMarket.getAlphabetName();
        System.out.println(productMarket.getAlphabetName());
        productMarket.getPrice();
        System.out.println(productMarket.getPrice());
        productMarket.pricesString();
        System.out.println(productMarket.pricesString());
        productMarket.priceMoreThan10();
        System.out.println(productMarket.priceMoreThan10());
        productMarket.priceLessThan5();
        System.out.println(productMarket.priceLessThan5());
    }

}

