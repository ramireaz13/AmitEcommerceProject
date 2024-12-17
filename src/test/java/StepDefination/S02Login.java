package StepDefination;

import DataFiles.Data;
import Pages.P02Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.asserts.SoftAssert;

public class S02Login {
    P02Login login = new P02Login(Hooks.driver);
;

    SoftAssert softAssert = new SoftAssert();

@Given("user click on login icon")
public void clickOnLoginIcon() {
  login.clickOnLoginIcon();

}

   @And("user Enter Email")
    public void enterEmail() {
        login.enterEmail(Data.Email);
    }

    @And("Enter Password")
    public void enterPassword() {
        login.enterPassword(Data.Password);
    }

    @And("user click on remmber me")
    public void clickOnRemberMe() {
    login.clickOnRememberMe();
    }

    @And("click on Log in button")
    public void clickOnLogInBtn() {
        login.pressOnLoginBtn();
    }
}
//    @Then("Welcome to our store")

