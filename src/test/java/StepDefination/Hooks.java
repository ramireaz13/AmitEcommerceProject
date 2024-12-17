package StepDefination;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.util.TimeUtils;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;



public class Hooks {

    public static WebDriver driver;
    public static ExtentReports report;
    public static ExtentTest test;
    public static ExtentTest logger;


    @Before
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com");
        System.out.println("driver is :" + driver);
    }
    @After
    public void teardown() {
        driver.quit();
    }
}
