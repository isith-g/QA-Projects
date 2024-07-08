package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.Assert.assertEquals;

public class KeysTests  extends BaseTests {

    @Test
    public void testBackspace(){
        var keyPage = homePage.clickKeyPressed();
        keyPage.enterTex("A"+ Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(),"You entered: BACK_SPACE","Wrong Message Displayed");

    }


}
