package StepDefination;



import Pages.P01Registeration;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class S01Registeration {
    P01Registeration registeration = new P01Registeration(Hooks.driver);
    SoftAssert softAssert=new SoftAssert();

    @Before
    public void initRegisterationPage() {
        registeration = new P01Registeration(Hooks.driver);
    }



    @Given("user click to register icon")
    public void clickOnRegisterIcon() {
        registeration.clickOnRegisterIcon();

    }
    @When("enter the first name")
    public void enterFirstName() {
        registeration.enterFirstName("Data.FirstName");

    }
    @And("enter the last name")
    public void enterLastName() {
        registeration.enterLastName("Data.LastName");

    }
    @And("enter the email")
    public void enterEmail() {
        registeration.enterEmail("Data.Email");

    }
    @And("enter the password")
    public void enterPassword() {
        registeration.enterPassword("Data.Password");

    }
    @And("enter the Confirm password")
    public void enterConfirmPassword() {
        registeration.enterConfirmPassword("Data.ConfirmPassword");

    }
    @And("click on Register button")
    public void clickOnRegisterBtn() {
        registeration.clickOnRegisterBtn();

    }
//    @Then("Your registration completed")
//    public void assertEmail() {
//        softAsser.assertEquals(registeration.getEmail() , Data.Email);
//        softAssert.assertAll();
//    }
}