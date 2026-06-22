package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// --- Create a Browser ---

public class DriverFactory {
    public static WebDriver driver;
    public static void initDriver()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ConfigReader.get("url"));
}
    
    public static WebDriver getDriver()
    {
        return driver;
    }
        public static void quitDriver()
        {
            if (driver != null)
            {
                driver.quit();
               // driver = null;
            }
        }
       
    
}
