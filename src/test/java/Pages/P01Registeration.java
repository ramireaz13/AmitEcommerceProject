package Pages;

import GeneralMethods.GeneralMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01Registeration {
    private static WebDriver driver;

    public P01Registeration(WebDriver driver) {
        this.driver = driver;
    }
    GeneralMethods methods = new GeneralMethods();
    // 1- Locators

    By registerIcon = By.className("ico-register");
    By firstName = By.xpath("//*[@id=\"FirstName\"]");
    By lastName = By.xpath("//*[@id=\"LastName\"]");
    By email = By.xpath("//*[@id=\"Email\"]");
    By password = By.xpath("//*[@id=\"Password\"]");
    By confirmPassword = By.xpath("//*[@id=\"ConfirmPassword\"]");
    By registerBtn = By.id("register-button");



    // 2- Methods

    public void clickOnRegisterIcon() {
        methods.waitTillButtonClickable(driver, registerIcon);
        driver.findElement(registerIcon).click();
    }

    public void enterFirstName(String firstName) {
        driver.findElement(this.firstName).sendKeys(firstName);
    }
    public void enterLastName(String lastName) {
        driver.findElement(this.lastName).sendKeys(lastName);
    }
    public void enterEmail(String email) {
        driver.findElement(this.email).sendKeys(email);
    }
    public void enterPassword(String password) {
        driver.findElement(this.password).sendKeys(password);
    }
    public void enterConfirmPassword(String confirmPassword) {
        driver.findElement(this.confirmPassword).sendKeys(confirmPassword);
    }
    public void clickOnRegisterBtn() {
        methods.waitTillButtonClickable(driver, registerBtn);
        driver.findElement(registerBtn).click();
    }
}