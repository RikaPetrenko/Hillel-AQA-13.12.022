package com.hillel.lessons.Lesson15HW17Food;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class ProductMarket {

    private List<Products> productList;

    public ProductMarket(List<Products> productList) {
        this.productList = productList;
    }

    public List<String> getName() {
        List<String> names = new ArrayList<>();
        for (Products pro : productList) {
            names.add(pro.getName());
        }
        return names;

    }

    public List<String> getAlphabetName(){
        List<String> getAlphabetName = new ArrayList<>();
        for(Products pro : productList){
            getAlphabetName.add(pro.getName());
        }
        Collections.sort(getAlphabetName);
        return getAlphabetName;
    }

    public List<Integer> getPrice() {
        List<Integer> prices = new ArrayList<>();
        for (Products pro : productList) {
            prices.add(pro.getPrice());
        }
        return prices;

    }

    public List<Integer> priceMoreThan10(){
        List<Integer> priceMoreThan10 = new ArrayList<>();
        for (Products pro : productList) {
            if (pro.getPrice() > 10) {
                priceMoreThan10.add(pro.getPrice());
            }
        }
        return priceMoreThan10;
    }
    public List<Integer> priceLessThan5(){
        List<Integer> priceLessThan5 = new ArrayList<>();
        for (Products pro : productList) {
            if (pro.getPrice() < 5) {
                priceLessThan5.add(pro.getPrice());
            }
        }
        return priceLessThan5;
    }
    public List<String> pricesString() {
        List<String> pricesString = new ArrayList<>();
        for (Products pro : productList) {
            pricesString.add(Integer.toString(pro.getPrice()));
        }
        return pricesString;
    }



//    public ProductMarket(List<Products> productList) {
//        this.productList = productList;
//        System.out.println(getNamesAndPrices());
//    }

//    public List<String> getNamesAndPrices() {
//        ArrayList<String> namesAndPrices = new ArrayList<>();
//        for (Products products : productList) {
//            namesAndPrices.add(products.getNamesAndPrices());
//        }
//        return namesAndPrices;
//    }



}
