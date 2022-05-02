package app;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor

public class ProductMarket {

    private List<Product> products;

    public List<String> getProductNames() {
        return products.stream()
                .map(Product::getName)
                .sorted()
                .collect(Collectors.toList());
    }

    public List<String> getSortedProducts() {
        return products.stream()
                .map(Product::getName)
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Integer> getProductsOverTen() {
        return products.stream()
                .map(Product::getPrice)
                .filter(price -> price > 10)
                .collect(Collectors.toList());
    }

    public List<Integer> getProductsBelowZero() {
        return products.stream()
                .map(Product::getPrice)
                .filter(price -> price < 0)
                .collect(Collectors.toList());
    }

    public List<String> getPriceToString() {
        return products.stream()
                .map(product -> Integer.toString(product.getPrice()))
                .collect(Collectors.toList());
    }

    public List<Integer> getSpecialPrice() {
        return products.stream()
                .map(Product::getPrice)
                .filter(price -> price > 55)
                .collect(Collectors.toList());
    }
}
