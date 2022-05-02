package app.market;

import java.util.Arrays;
import java.util.List;

public interface DataProductMarket {
    public static final List<String> PRODUCT_NAMES_EXPECTED = Arrays.asList("Boots", "Shoes", "Slippers");
    public static final List<String> PRODUCT_NAMES_SORTED_EXPECTED = Arrays.asList("Boots", "Shoes", "Slippers");
    public static final List<Integer> PRODUCT_PRICES_OVER_TEN = Arrays.asList(55, 100);
    public static final List<Integer> PRODUCT_PRICES_UNDER_ZERO = Arrays.asList();
    public static final List<Integer> PRODUCT_SPECIAL_PRICES = Arrays.asList(100);

}
