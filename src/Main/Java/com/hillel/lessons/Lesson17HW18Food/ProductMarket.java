package com.hillel.lessons.Lesson17HW18Food;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMarket {

    private List<Products> productList;

    public ProductMarket(List<Products> productList) {
        this.productList = productList;
    }

    public List<String> getName() {
        return productList.stream()
                .map(Products::getName)
                .collect(Collectors.toList());
    }

    public List<String> getAlphabetName() {
        return productList.stream()
                .map(Products::getName)
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Integer> getPrice() {
        return productList.stream()
                .map(Products::getPrice)
                .collect(Collectors.toList());
    }

    public List<Integer> priceMoreThan10() {
        return productList.stream()
                .map(Products::getPrice)
                .filter(price -> price > 10)
                .collect(Collectors.toList());
    }

    public List<Integer> priceLessThan5() {
        return productList.stream()
                .map(Products::getPrice)
                .filter(price -> price < 5)
                .collect(Collectors.toList());
    }

    public List<String> pricesString() {
        return productList.stream()
                .map(pro -> Integer.toString(pro.getPrice()))
                .collect(Collectors.toList());
    }
}
