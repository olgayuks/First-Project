package pages;

import homework9.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
//    private static String END_Point = "";

    private static By USERNAME_SELECTOR = By.id("username");
    private static By PASSWORD_SELECTOR = By.id("password");
    private static By LOGIN_BUTTON_SELECTOR = By.id("loginButton");
    private static By BOT_SELECTOR = By.className("bot_column");
    private static By LOGO_SELECTOR = By.className("login_logo");
    private static By INNER_SELECTOR = By.className("login_wrapper-inner");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openPage(){
        openPage(BASE_URL);
    }
    public boolean isPageOpened(){
        return driver.findElement(LOGIN_BUTTON_SELECTOR).isDisplayed();
    }
}
