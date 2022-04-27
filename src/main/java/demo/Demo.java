package demo;

import app.ProductMarket;

import java.util.List;

public class Demo {
    public static void main(String[] args) {

        ProductMarket productMarket = new ProductMarket("Goods", 15, List.of());

        productMarket.allProducts();
        productMarket.sortProducts();
        productMarket.productsOverTen();
        productMarket.productsBelowZero();
        productMarket.priceToString();
    }
}
