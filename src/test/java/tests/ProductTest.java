package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductPage;
import utils.ConfigReader;

public class ProductTest extends BaseTest {

    @Test
    public void addProductsToCart() {

        LoginPage loginPage = new LoginPage();

        loginPage.login(
                ConfigReader.get("username"),
                ConfigReader.get("password"));

        ProductPage productPage = new ProductPage();

        productPage.addBackpack();
        productPage.addBikeLight();

        productPage.openCart();

        CartPage cartPage = new CartPage();

        Assert.assertTrue(
                cartPage.isBackpackDisplayed());

        Assert.assertTrue(
                cartPage.isBikeLightDisplayed());
    }
}