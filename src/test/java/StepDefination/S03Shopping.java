package StepDefination;

import DataFiles.Data;
import Pages.P02Login;
import Pages.P03Shopping;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;

public class S03Shopping {
    SoftAssert softAssert = new SoftAssert();
    P02Login login = new P02Login(Hooks.driver);
    P03Shopping shopping = new P03Shopping(Hooks.driver);


    @Given("user login into system")
    public void user_login_into_system() {
        login.clickOnLoginIcon();
        login.enterEmail(Data.Email);
        login.enterPassword(Data.Password);
        login.pressOnLoginBtn();
    }
    @And("user Select the product")
    public void clickOnBooksIcon() {
        shopping.clickOnBooksIcon();
    }
    @And("user click add to cart")
    public void clickOnAddToCartIcon() {
      shopping.clickOnAddToCartIcon();
    }
    @And("user click on shopping cart icon")
    public void clickOnshoppingCartIcon() {
      shopping.clickOnshoppingCartIcon();
    }
    @And("user click on I agree with the terms of service")
    public void clickOnIAgreeWithTheTermsOfService() {
      shopping.clickOnIAgreeWithTheTermsOfService();
    }
    @And("user click on checkout Button")
    public void clickOnCheckoutButton() {
      shopping.clickOnCheckoutButton();
    }
    @And("user enter the Country")
    public void enterCountry() {
      shopping.enterCountry(Data.Country);
    }
    @And("user enter the City")
    public void enterCity() {
      shopping.enterCity(Data.City);
    }
    @And("user enter the Address")
    public void enterAddress() {
      shopping.enterAddress(Data.Address);
    }
    @And("user enter the Zip postal code")
    public void enterZipPostalCode() {
      shopping.enterZipPostalCode();
    }
    @And("user enter the Phone number")
    public void enterPhoneNumber() {
      shopping.enterPhoneNumber(Data.Phone);
    }
    @And("click on continue button1")
    public void clickOnContinueButton() {
      shopping.clickOnContinueButton();
    }
    @And("user Select the Shipping method")
    public void selectShippingMethod() {
      shopping.selectShippingMethod();
    }
    @And("click on continue button2")
    public void clickOnContinueButton2() {
      shopping.clickOnContinueButton2();
    }
    @And("user Select the Payment method")
    public void selectPaymentMethod() {
      shopping.selectPaymentMethod();
    }
    @And("click on continue button3")
    public void clickOnContinueButton3() {
      shopping.clickOnContinueButton3();
    }
    @And("user Select the Payment information")
    public void selectPaymentInformation() {
      shopping.selectPaymentInformation();
    }
    @And("click on continue button4")
    public void clickOnContinueButton4() {
      shopping.clickOnContinueButton4();
    }
    @And("user confirm order")
    public void confirmOrder() {
      shopping.confirmOrder();
    }
    @And("click on confirm button")
    public void clickOnConfirmButton() {
      shopping.clickOnConfirmButton();
    }
    @Then("your order has been successfully processed!")
    public void yourOrderHasBeenProcessed() {
      shopping.yourOrderHasBeenProcessed();
    }

}
