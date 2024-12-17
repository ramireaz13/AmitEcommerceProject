package Pages;

import GeneralMethods.GeneralMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02Login {
    private static WebDriver driver;


    public P02Login(WebDriver driver) {
        this.driver = driver;
    }
    GeneralMethods methods = new GeneralMethods();
    By loginIcon =By.xpath("//a[@class='ico-login']");
    By Email = By.xpath("//input[@name='Email']");
    By Password = By.xpath("//input[@name='Password']");
    By rememberMe = By.xpath("//input[@name='RememberMe'][1]");
    By LoginBtn = By.xpath("//button[@class='button-1 login-button']");

    public void clickOnLoginIcon() {
        methods.waitTillButtonClickable(driver,loginIcon);
        driver.findElement(loginIcon).click();
    }
    public void enterEmail(String email) {
        driver.findElement(this.Email).sendKeys(email);
    }
    public void enterPassword(String password) {
        driver.findElement(this.Password).sendKeys(password);
    }
    public void clickOnRememberMe() {
        if (!driver.findElement(rememberMe).isSelected()) {
            driver.findElement(rememberMe).click();
        }
    }

    public void pressOnLoginBtn() {
        methods.waitTillButtonClickable(driver, LoginBtn);
        driver.findElement(LoginBtn).click();
    }

}