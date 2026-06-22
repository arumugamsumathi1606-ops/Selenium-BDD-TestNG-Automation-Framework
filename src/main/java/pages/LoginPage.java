package pages;
import org.openqa.selenium.By;

import utils.DriverFactory;

public class LoginPage
{
    By username = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.id("login-button");

   public void login(String user, String pass) {

    System.out.println("Entering username");
    DriverFactory.getDriver().findElement(username).sendKeys(user);

    System.out.println("Entering password");
    DriverFactory.getDriver().findElement(password).sendKeys(pass);

    System.out.println("Clicking login");
    DriverFactory.getDriver().findElement(loginButton).click();
}
//     LoginPage loginPage = new LoginPage();
// loginPage.login("standard_user", "secret_sauce")

}
