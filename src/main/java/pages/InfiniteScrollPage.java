package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {

    private WebDriver driver;
    private By textBlocks = By.className("iscroll-added");

    public InfiniteScrollPage(WebDriver driver){

        this.driver = driver;

    }

    public void scrollToParagraph(int index){

        String script = "window.scrollTo(0,document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor)driver;

        while (getNumberParagraphsPresent() < index){
            jsExecutor.executeScript(script);

        }


    }

    private int getNumberParagraphsPresent(){
        return driver.findElements(textBlocks).size();

    }


}
