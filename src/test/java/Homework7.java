import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Homework7 {
    private static final String URL = "https://dev.by/";
    private ChromeDriver driver;
    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:/program Files/Driver/chromedriver.exe");
    }
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void xPathSelectorTest (){
        driver.get(URL);

        By classLocator = By.xpath("//*[@class='subscription-popup__title']");
        By textLocator = By.xpath("//div[text()='Cyberpunk 2077 выйдет в намеченный срок']");
        By containsLocator = By.xpath("//div[contains(text(),'Белорусы')]");
        By startsWithLocator = By.xpath("//*[starts-with(text(),'Nvidia')]");
        By attributeNameLocator = By.xpath("//a[@href='/news/aktsii-epam-podorozhali#comments']");

        By ancestorNameLocator = By.xpath("//a[@href='https://companies.dev.by']/ancestor::div");
        By ancestorOrSelfLocator = By.xpath("//*[@class='subscription-popup__info']/ancestor-or-self::div");

        By selfLocator = By.xpath("//a[@class='primenews-feed__stretched-link']/self::a");
        By childLocator = By.xpath("//*[@class='primenews-feed__item']/child::div");
        By childrenLocator = By.xpath("//*[@class='primenews-feed__item']/child::*");
        By parentLocator = By.xpath("//*[@href='https://events.dev.by']/parent::div");

        By descendantLocator = By.xpath("//*[@class='card__info']/descendant::span");
        By descendantOrSelfLocator = By.xpath("//*[@class='card__body']/descendant-or-self::div");

        By followingLocator = By.xpath("//*[@class='primenews-feed__item']/following::span");
        By followingSiblingLocator = By.xpath("//*[@href='https://dev.by/blogs']/following-sibling::a");


        By precedingLocator = By.xpath("//*[@class='navbar__nav-item']/preceding::a");
        By precedingSiblingLocator = By.xpath("//div[@class='card__text']/preceding-sibling::div");




        driver.findElement(classLocator);
        driver.findElement(textLocator);
        driver.findElement(containsLocator);
        driver.findElement(startsWithLocator);
        driver.findElement(attributeNameLocator);

        driver.findElement(ancestorNameLocator);
        driver.findElement(ancestorOrSelfLocator);

        driver.findElement(selfLocator);
        driver.findElement(childLocator);

        driver.findElement(childrenLocator);
        List<WebElement> childrenLocatorElements = driver.findElements(childrenLocator);
        Assert.assertEquals(childrenLocatorElements.size(), 20, "Количество элементов не равно 20");

        driver.findElement(parentLocator);
        List<WebElement> parentLocatorElements = driver.findElements(parentLocator);
        Assert.assertEquals(parentLocatorElements.size(), 1, "Количество элементов не равно 1");

        driver.findElement(descendantLocator);
        driver.findElement(descendantOrSelfLocator);

        driver.findElement(followingLocator);
        driver.findElement(followingSiblingLocator);

        driver.findElement(precedingLocator);
        driver.findElement(precedingSiblingLocator);




    }
}
