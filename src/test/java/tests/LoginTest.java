package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest {
    private WebDriver driver;
   public LoginPage loginPage;
    @BeforeTest
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
    }
    @Test
    public void loginTest() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.enterEmail("qatestertest@gmail.com");
        loginPage.enterPassword("Test@123");
        loginPage.clickLoginBtn();
        Thread.sleep(5);
    }
    @AfterMethod
    public void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }
}