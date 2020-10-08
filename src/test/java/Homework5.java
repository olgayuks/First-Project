import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Homework5 {

    private static final String URL = "https://healthunify.com/bmicalculator/";

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
    public void metricMeasureTest () {

        driver.get(URL);

        WebElement weightElement = driver.findElement(By.name("wg"));
        weightElement.sendKeys("40");

        WebElement heightElement = driver.findElement(By.name("ht"));
        heightElement.sendKeys("158");

        WebElement buttonElement = driver.findElement(By.name("cc"));
        buttonElement.click();

        WebElement SIElement = driver.findElement(By.name("si"));
        String siValue = SIElement.getAttribute("value");
        Assert.assertEquals(siValue, "16.02", "SI Units не соответствует");

        WebElement USElement = driver.findElement(By.name("us"));
        String usValue = USElement.getAttribute("value");
        Assert.assertEquals(usValue, "16.29", "US Units не соответствует");

        WebElement UKElement = driver.findElement(By.name("uk"));
        String ukValue = UKElement.getAttribute("value");
        Assert.assertEquals(ukValue, "101.73", "UK Units не соответствует");

        WebElement descElement = driver.findElement(By.name("desc"));
        String descValue = descElement.getAttribute("value");
        Assert.assertEquals(descValue, "Your category is Underweight", "Статус не соответствует");

        driver.quit();
    }

    @Test
    public void britishImperialSystemOfMeasurementTest () {

        driver.get(URL);

        WebElement measureElement = driver.findElement(By.name("opt1"));
        measureElement.sendKeys("pounds");

        WebElement weightElement = driver.findElement(By.name("wg"));
        weightElement.clear();
        weightElement.sendKeys("70");

        WebElement height1Element = driver.findElement(By.name("opt2"));
        height1Element.sendKeys("5");

        WebElement height2Element = driver.findElement(By.name("opt3"));
        height2Element.sendKeys("6");

        WebElement buttonElement = driver.findElement(By.name("cc"));
        buttonElement.click();

        WebElement SIElement = driver.findElement(By.name("si"));
        String siValue = SIElement.getAttribute("value");
        Assert.assertEquals(siValue, "11.27", "SI Units не соответствует");

        WebElement USElement = driver.findElement(By.name("us"));
        String usValue = USElement.getAttribute("value");
        Assert.assertEquals(usValue, "11.46", "US Units не соответствует");

        WebElement UKElement = driver.findElement(By.name("uk"));
        String ukValue = UKElement.getAttribute("value");
        Assert.assertEquals(ukValue, "71.58", "UK Units не соответствует");

        WebElement descElement = driver.findElement(By.name("desc"));
        String descValue = descElement.getAttribute("value");
        Assert.assertEquals(descValue, "Your category is Normal", "Статус не соответствует");

        driver.quit();
    }


}
