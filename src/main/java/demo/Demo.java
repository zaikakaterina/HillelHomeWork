package demo;

import app.Product;
import app.ProductMarket;

import java.util.List;

public class Demo {
    public static void main(String[] args) {

        Product products1 = new Product("Shoes", 55);
        Product products2 = new Product("Boots", 100);
        Product products3 = new Product("Slippers", 8);

        List<Product> productsAll = List.of(products1,products2,products3);

        ProductMarket productMarket = new ProductMarket(productsAll);

        System.out.println(productMarket.getProductNames());
        System.out.println(productMarket.getSortedProducts());
        System.out.println(productMarket.getProductsOverTen());
        System.out.println(productMarket.getProductsBelowZero());
        System.out.println(productMarket.getPriceToString());
        System.out.println(productMarket.getSpecialPrice());
    }
}
