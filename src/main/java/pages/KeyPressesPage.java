package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

    private WebDriver driver;
    private By inputsField = By.id("target");
    private By resultText = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterTex(String text){
        driver.findElement(inputsField).sendKeys(text);
    }

    public String getResult(){
        return driver.findElement(resultText).getText();

    }




}
