package pages;

import org.openqa.selenium.By;

import utils.DriverFactory;

public class ProductPage {

    By backpack = By.id("add-to-cart-sauce-labs-backpack");
    By bikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    By cartIcon = By.className("shopping_cart_link");

    public void addBackpack() {
        DriverFactory.getDriver().findElement(backpack).click();
    }

    public void addBikeLight() {
        DriverFactory.getDriver().findElement(bikeLight).click();
    }

    public void openCart() {
        DriverFactory.getDriver().findElement(cartIcon).click();
    }
}