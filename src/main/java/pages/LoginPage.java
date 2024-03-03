package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;
    private By emailLocator = By.name("email");
    private By pwd = By.name("passwor");
    private By loginBtn = By.xpath("//input[@type='submit']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void enterEmail(String email){
        WebElement emailAddress =  driver.findElement(emailLocator);
        emailAddress.sendKeys(email);
    }

    public void enterPassword(String password){
        WebElement pwdInput = driver.findElement(pwd);
        pwdInput.sendKeys(password);
    }

    public void clickLoginBtn(){
        WebElement loginButton = driver.findElement(loginBtn);
        loginButton.click();
    }

  /* public void login(String email, String password){
       enterEmail(email);
       enterPassword(password);
       clickLoginBtn();
   }*/
}
