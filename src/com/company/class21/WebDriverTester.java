package com.company.class21;

public class WebDriverTester {
    public static void main(String[] args) {
        GoogleChrome gc=new GoogleChrome();
        gc.openWebsite();
        gc.signUp();
        gc.logIn();
        gc.enterUserPassword();
        gc.clickSubmit();
        gc.closeBrowser();
        WebDriver wb=new Safari();
        wb.openWebsite();
        wb.signUp();
        wb.logIn();
        wb.enterUserPassword();
        wb.clickSubmit();
        wb.closeBrowser();

        WebDriver[] webDrivers={new GoogleChrome(), new Safari(), new FireFox()};
        for(WebDriver wD: webDrivers){
            wD.openWebsite();
            wD.signUp();
            wD.logIn();
            wD.enterUserPassword();
            wD.clickSubmit();
            wD.closeBrowser();


            WebDriver webDriver=new GoogleChrome();
            GoogleChrome chrome=(GoogleChrome) webDriver; // downcasting
            


        }



    }
}
