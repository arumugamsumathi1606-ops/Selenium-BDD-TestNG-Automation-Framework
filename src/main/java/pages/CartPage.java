package pages;

import org.openqa.selenium.By;

import utils.DriverFactory;

public class CartPage {

    By backpackInCart =
        By.xpath("//div[text()='Sauce Labs Backpack']");

    By bikeLightInCart =
        By.xpath("//div[text()='Sauce Labs Bike Light']");

    public boolean isBackpackDisplayed() {
        return DriverFactory.getDriver()
                .findElement(backpackInCart)
                .isDisplayed();
    }

    public boolean isBikeLightDisplayed() {
        return DriverFactory.getDriver()
                .findElement(bikeLightInCart)
                .isDisplayed();
    }
}