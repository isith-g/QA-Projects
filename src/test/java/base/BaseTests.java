package base;

import Utils.WindowManager;
import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.Homepage;

import java.io.File;
import java.io.IOException;

public class BaseTests {
    private WebDriver driver;
    protected Homepage homePage;

    @BeforeClass
    public void setUp(){

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        // driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); // Implicit wait
        goHome();
        homePage = new Homepage(driver);


    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");

    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @AfterMethod
    public void recordFailure(ITestResult result){

        var camera = (TakesScreenshot)driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        try {
            Files.move(screenshot,new File("D:\\TestAutomationPractice\\demo3\\resources\\screenshots\\"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Screenshot taken:"+ screenshot.getAbsolutePath());


    }

    public WindowManager getWindowManager(){

        return new WindowManager(driver);

    }


}
