package app.market;

import app.Product;
import app.ProductMarket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static app.market.DataProductMarket.*;

public class TestProductMarket {

    private static ProductMarket productMarket;
    private static String price;

    @BeforeAll
    public static void setUp() {

        Product products1 = new Product("Shoes", 55);
        Product products2 = new Product("Boots", 100);
        Product products3 = new Product("Slippers", 8);

        List<Product> productsAll = List.of(products1, products2, products3);

        productMarket = new ProductMarket(productsAll);

        List<Integer> getPrices = Arrays.asList(products1.getPrice(), products2.getPrice(), products3.getPrice());

        price = String.valueOf(getPrices);

    }

    @Test
    public void testGetProductNames() {

        Assertions.assertEquals(PRODUCT_NAMES_EXPECTED, productMarket.getProductNames(), "Fail: Expected Name is not equal to Actual Name");
    }

    @Test
    public void testGetSortedProducts() {

        Assertions.assertTrue(PRODUCT_NAMES_SORTED_EXPECTED.equals(productMarket.getSortedProducts()));
    }

    @Test
    public void testGetProductsOverTen() {

        Assertions.assertEquals(PRODUCT_PRICES_OVER_TEN, productMarket.getProductsOverTen(), "Fail: Expected prices are not over ten");

    }

    @Test
    public void testGetProductsBelowZero() {

        Assertions.assertEquals(PRODUCT_PRICES_UNDER_ZERO, productMarket.getProductsBelowZero(), "Fail: There are prices under zero");

    }

    @Test
    public void testGetPriceToString() {

        Assertions.assertEquals(price, productMarket.getPriceToString().toString());
    }

    @Test
    public void testGetSpecialPrice() {

        Assertions.assertEquals(PRODUCT_SPECIAL_PRICES, productMarket.getSpecialPrice(), "Fail: Special prices should be over 55");
    }
}