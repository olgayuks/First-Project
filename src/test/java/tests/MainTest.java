package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

public class MainTest extends BaseTest {

    @Test
    public void test(){
        LoginPage loginPage = new LoginPage(driver);

    }
}
