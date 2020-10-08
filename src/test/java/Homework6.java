import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Homework6 {
    private static final String URL = "https://jobs.tut.by/";

    private ChromeDriver driver;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:/program Files/Driver/chromedriver.exe");
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void cssSelectorTest() {
        driver.get(URL);

        By singleClassNameLocator = By.cssSelector(".supernova-search-group");
        By multipleClassesNameLocator = By.cssSelector(".bloko-button.bloko-button_primary");
        By childLocator = By.cssSelector(".supernova-navi-item .supernova-button");

        By idLocator = By.cssSelector("#topmailru-code");

        By elementLocator = By.cssSelector("ul");
        By elementClassLocator = By.cssSelector("ul.multiple-column-list");
        By twoElementsLocator = By.cssSelector("ul,form");
        By insideElementLocator = By.cssSelector("form input");
        By directChildElementLocator = By.cssSelector("form>fieldset");
        By placeAfterElementLocator = By.cssSelector("fieldset+label");
        By precededElementLocator = By.cssSelector("input~span");

        By attributeLocator = By.cssSelector("[autocomplete]");
        By attributeValueLocator = By.cssSelector("[type='hidden']");
        By attributeContainsValueLocator = By.cssSelector("[placeholder~=или]");
        By attributeBeginWithValueLocator = By.cssSelector("[name|=vk]");
        By elementAttributeStartLocator = By.cssSelector("input[placeholder^='Профессия']");
        By elementAttributeEndLocator = By.cssSelector("input[placeholder$=компания]");
        By elementAttributeContainsLocator = By.cssSelector("input[placeholder*=или]");

        By firstChildElementsLocator = By.cssSelector("input:first-child");
        By lastChildElementsLocator = By.cssSelector("p:last-child");
        By fifthChildElementsLocator = By.cssSelector("li:nth-child(5)");

        By directDescendantLocator = By.cssSelector(".bloko-icon-dynamic > a");


        driver.findElement(singleClassNameLocator);
        driver.findElements(multipleClassesNameLocator);
        driver.findElements(childLocator);

        driver.findElement(idLocator);

        List<WebElement> elementLocatorElements = driver.findElements(elementLocator);
        Assert.assertEquals(elementLocatorElements.size(), 18, "Количество элементов не равно 18");
        driver.findElement(elementClassLocator);
        driver.findElement(twoElementsLocator);
        driver.findElement(insideElementLocator);
        driver.findElement(directChildElementLocator);
        driver.findElement(placeAfterElementLocator);
        driver.findElement(precededElementLocator);

        driver.findElement(attributeLocator);
        driver.findElement(attributeValueLocator);
        driver.findElement(attributeContainsValueLocator);
        driver.findElement(attributeBeginWithValueLocator);
        driver.findElement(elementAttributeStartLocator);
        driver.findElement(elementAttributeEndLocator);
        driver.findElement(elementAttributeContainsLocator);

        driver.findElement(firstChildElementsLocator);
        driver.findElement(lastChildElementsLocator);
        driver.findElement(lastChildElementsLocator);
        driver.findElement(fifthChildElementsLocator);

        driver.findElement(directDescendantLocator);


        driver.quit();

    }
}
