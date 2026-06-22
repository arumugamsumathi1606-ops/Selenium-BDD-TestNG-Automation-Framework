//----Page elements and page actions---
//---Test C=Scenarios + Validations---
package tests;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.ConfigReader;
import utils.DriverFactory;

public class LoginTest extends BaseTest {
   // @Test
    // public void openSauceLabs()
    // {
    //     System.out.println("Test Case : Open Sauce Labs");
    //    // DriverFactory.initDriver();
    //     DriverFactory.getDriver().get("https://www.saucedemo.com/");
    //     System.out.println("Title : " + DriverFactory.getDriver().getTitle());
    // }
@Test
public void loginTest()
{
    LoginPage loginPage = new LoginPage();

    loginPage.login(
        ConfigReader.get("username"),
        ConfigReader.get("password")
    );
    System.out.println(
    DriverFactory.getDriver().getCurrentUrl()
);
}
}