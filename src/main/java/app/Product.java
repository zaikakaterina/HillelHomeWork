package app;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Product implements Comparable<Product> {
    @Getter
    private String name;

    @Getter
    private int price;

    @Override
    public int compareTo(Product o) {
        return 0;
    }
}
