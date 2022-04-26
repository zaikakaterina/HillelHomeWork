package app;

import java.util.List;

public class ProductMarket extends Product{

    List<Product> products;

    public ProductMarket(String name, float price, List<Product> products) {
        super(name, price);
        this.products = products;
    }
}
