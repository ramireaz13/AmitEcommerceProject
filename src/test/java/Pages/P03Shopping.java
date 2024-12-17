package Pages;

import DataFiles.Data;
import GeneralMethods.GeneralMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P03Shopping {
    private static WebDriver driver;


    public P03Shopping(WebDriver driver) {
        this.driver = driver;
    }
    GeneralMethods methods = new GeneralMethods();
    By Books = By.xpath("(//a[text()='Books '])[1]");
    By AddToCart = By.xpath("//button[text()='Add to cart']");
    By ShoppingCart = By.xpath("//*[@id=\"topcartlink\"]/a/span[1]");
    By Iagreewiththetermsofservice = By.xpath("//*[@id=\"termsofservice\"]");
    By checkout =By.xpath("//*[@id=\"checkout\"]");
    By Country = By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]");
    By City = By.xpath("//*[@id=\"BillingNewAddress_City\"]");
    By Address = By.xpath("//*[@id=\"BillingNewAddress_Address1\"]");
    By ZipPostalCode = By.xpath("//*[@id=\"BillingNewAddress_ZipPostalCode\"]");
    By PhoneNumber = By.xpath("//*[@id=\"BillingNewAddress_PhoneNumber\"]");
    By ContinueBtn1 = By.xpath("//*[@id=\"billing-buttons-container\"]/button[2]");
    By ShoppingMethood = By.xpath("//*[@id=\"shippingoption_0\"]");
    By ContinueBtn2 = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button");
    By Paymentmethod = By.xpath("//*[@id=\"paymentmethod_0\"]");
    By ContinueBtn3 = By.xpath("//*[@id=\"payment-method-buttons-container\"]/button");
    By ContinueBtn4 = By.xpath("//*[@id=\"payment-info-buttons-container\"]/button");
    By ConfirmOrder = By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button");
    By ContinueBtn5 = By.xpath("//*[@id=\"main\"]/div//button[2]");

    By conBtn = By.xpath("//button[text()='Continue']");

    public void clickOnBooksIcon() {
        methods.waitTillButtonClickable(driver, Books);
        driver.findElement(Books).click();
    }
    public void clickOnAddToCartIcon() {
        methods.waitTillButtonClickable(driver, AddToCart);
        driver.findElement(AddToCart).click();
    }
    public void clickOnshoppingCartIcon() {
        methods.waitTillButtonClickable(driver, ShoppingCart);
        driver.findElement(ShoppingCart).click();
    }
    public void clickOnIAgreeWithTheTermsOfService() {
        methods.waitTillButtonClickable(driver, Iagreewiththetermsofservice);
        driver.findElement(Iagreewiththetermsofservice).click();
    }
    public void clickOnCheckoutButton() {
        methods.waitTillButtonClickable(driver, checkout);
        driver.findElement(checkout).click();
    }

    public void enterCountry(String Country) {
        driver.findElement(this.Country).sendKeys(Country);
    }
    public void enterCity(String City) {
        driver.findElement(this.City).sendKeys(City);
    }

    public void enterAddress(String Address) {
        driver.findElement(this.Address).sendKeys(Address);
    }
    public void enterZipPostalCode() {driver.findElement(this.ZipPostalCode).sendKeys(Data.ZipPostalCode);}
    public void enterPhoneNumber(String PhoneNumber) {
        driver.findElement(this.PhoneNumber).sendKeys(PhoneNumber);
    }

    public void clickOnContinueButton() {methods.waitTillButtonClickable(driver, conBtn);
        driver.findElement(conBtn).click();
    }
    public void selectShippingMethod() {methods.waitTillButtonClickable(driver, ShoppingMethood);
        driver.findElement(ShoppingMethood).click();
    }
    public void clickOnContinueButton2() {methods.waitTillButtonClickable(driver, conBtn);
        driver.findElement(conBtn).click();
    }
    public void selectPaymentMethod() {methods.waitTillButtonClickable(driver, Paymentmethod);
        driver.findElement(Paymentmethod).click();
    }

    public void clickOnContinueButton3() {methods.waitTillButtonClickable(driver, conBtn);
        driver.findElement(conBtn).click();
    }
    public void selectPaymentInformation() {
    }

    public void clickOnContinueButton4() { methods.waitTillButtonClickable(driver, conBtn);
        driver.findElement(conBtn).click();
    }

    public void confirmOrder() {methods.waitTillButtonClickable(driver, ConfirmOrder);
        driver.findElement(ConfirmOrder).click();
    }
    public void clickOnConfirmButton() { methods.waitTillButtonClickable(driver, conBtn);
        driver.findElement(conBtn).click();
    }


    public void yourOrderHasBeenProcessed() {

    }
}
