package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTests {

    @Test
    public void testFileUpload(){

        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("D:\\TestAutomationPractice\\demo3\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFiles(),"chromedriver.exe","upload text incorrect");


    }


}
