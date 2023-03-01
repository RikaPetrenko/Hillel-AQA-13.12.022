package com.hillel.lessons.Lesson15HW17Food;

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
        productMarket.getAlphabetName();
        productMarket.getPrice();
        productMarket.pricesString();
        productMarket.priceMoreThan10();
        productMarket.priceLessThan5();

//        Alt version:
//        ArrayList<Products> productsList = new ArrayList<Products>();
//        Products Product1 = new Products("Apple", 1);
//        Products Product2 = new Products("Banana", 3);
//        Products Product3 = new Products("Orange", 5);
//        Products Product4 = new Products("Expensive Apple", 10);
//        Products Product5 = new Products("ExpensiveBanana", 13);
//        Products Product6 = new Products("ExpensiveOrange", 15);
//        ProductMarket productMarket = new ProductMarket(productsList);
//
//        ArrayList<Products> products = new ArrayList<>();
//        products.add(Product1);
//        products.add(Product2);
//        products.add(Product3);
//        products.add(Product4);
//        products.add(Product5);
//        products.add(Product6);






        }

    }






