package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    WebDriver driver;
    private String linkXpath_Format = ".//a[contains(text(),'%s')]";
    private By link_EXAMPLE1 = By.xpath(String.format(linkXpath_Format,"Example 1"));

    public DynamicLoadingPage(WebDriver driver){

        this.driver = driver;

    }

    public DynamicLoadingExample1Page clickExample1(){
        driver.findElement(link_EXAMPLE1).click();
        return new DynamicLoadingExample1Page(driver);
    }
}
