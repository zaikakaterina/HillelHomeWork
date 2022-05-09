package app.market;

import app.Product;
import app.ProductMarket;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static app.market.DataProductMarket.*;

public class TestProductMarket {

    private static ProductMarket productMarket;
    private static String price;

    @BeforeTest(alwaysRun = true)
    public void setUp() {

        Product products1 = new Product("Shoes", 55);
        Product products2 = new Product("Boots", 100);
        Product products3 = new Product("Slippers", 8);

        List<Product> productsAll = List.of(products1, products2, products3);

        productMarket = new ProductMarket(productsAll);

        List<Integer> getPrices = Arrays.asList(products1.getPrice(), products2.getPrice(), products3.getPrice());

        price = String.valueOf(getPrices);
    }

    @Test(groups = {"first three tests"})
    public void testGetProductNames() {
        Assert.assertEquals(PRODUCT_NAMES_EXPECTED, productMarket.getProductNames(), "Fail: Expected Name is not equal to Actual Name");
    }

    @Test(groups = {"first three tests"})
    public void testGetSortedProducts() {
        Assert.assertTrue(PRODUCT_NAMES_SORTED_EXPECTED.equals(productMarket.getSortedProducts()));
    }

    @Test(groups = {"first three tests"})
    public void testGetProductsOverTen() {
        Assert.assertEquals(PRODUCT_PRICES_OVER_TEN, productMarket.getProductsOverTen(), "Fail: Expected prices are not over ten");
    }

    @Test(groups = {"two tests following first three"})
    public void testGetProductsBelowZero() {
        Assert.assertEquals(PRODUCT_PRICES_UNDER_ZERO, productMarket.getProductsBelowZero(), "Fail: There are prices under zero");
    }

    @Test(groups = {"two tests following first three"})
    public void testGetPriceToString() {
        Assert.assertEquals(STRING_PRICES, productMarket.getPriceToString(), "Fail: Prices are not string");
    }

    @Test(groups = {"last test"})
    public void testGetSpecialPrice() {
        Assert.assertEquals(PRODUCT_SPECIAL_PRICES, productMarket.getSpecialPrice(), "Fail: Special prices should be over 55");
    }
}