package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAceptAlert(){
       var alertsPage=  homePage.clickJavaScriptAlerts();
       alertsPage.triggerAlert();
       alertsPage.alert_clickToAccept();
       assertEquals(alertsPage.getResult(),"You successfully clicked an alert","incorrect message displayed");




    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage  = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text,"I am a JS Confirm","Alert text incorrect");


    }

    @Test
    public void testSetInputInAlert(){

        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        alertsPage.alert_setInput("Hello World");
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(),"You entered: Hello World","Results displayed incorrectly");



    }








}
