package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class navigationTest extends BaseTests {

    @Test
    public void testNavigator(){

        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");

    }

}
