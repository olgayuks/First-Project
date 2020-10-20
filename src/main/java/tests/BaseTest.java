package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public WebDriver driver;
    public static String PATH_TO_DRIVER ="C:/Program Files/Driver/chromedriver.exe";
    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", PATH_TO_DRIVER);
        driver = new ChromeDriver();

    }
    @AfterClass
    public void afterTClass() {
        driver.quit();}
}
