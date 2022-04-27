package app;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMarket extends Product{

    List<Product> products;

    public ProductMarket(String name, int price, List<Product> products) {
        super(name, price);
        this.products = products;
    }

    Product products1 = new Product("Shoes", 55);
    Product products2 = new Product("Boots", 100);
    Product products3 = new Product("Slippers", 8);

    List<Product> productsAll = List.of(products1,products2,products3);

    public void allProducts(){
        productsAll.forEach(System.out::println);
    }

    public void sortProducts(){
        List.of(products1.getName(),products2.getName(),products3.getName()).stream()
                .sorted()
                .forEach(System.out::println);
    }

    public void productsOverTen(){
        productsAll.stream()
                .filter(allProduct -> allProduct.getPrice() > 10)
                .forEach(System.out::println);
    }

    public void productsBelowZero(){
        productsAll.stream()
                .filter(allProduct -> allProduct.getPrice() < 0)
                .forEach(System.out::println);
    }

    public void priceToString(){
        List<Integer> priceString = productsAll.stream()
                .map(Product::getPrice)
                .collect(Collectors.toList());
        priceString.forEach(System.out::println);
    }
}
