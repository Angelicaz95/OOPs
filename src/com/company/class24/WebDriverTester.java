package com.company.class24;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver[] wb={new ChromeDriver(), new FirefoxDriver()};
        for(WebDriver w: wb){
            w.openBrowser();
            w.maximizeWindow();
            w.findElement();
            w.closeBrowser();
        }

    }
}
