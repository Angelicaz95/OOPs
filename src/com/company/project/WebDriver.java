package com.company.project;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}

interface TakesScreenShot{
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver, TakesScreenShot{
    void navigate();
}
class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opens Chrome browser");

    }

    @Override
    public void close() {
        System.out.println("Closes Chrome browser");

    }

    @Override
    public String getTitle() {
        return "Chrome";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Takes screenshot in Chrome browser");

    }

    @Override
    public void navigate() {
        System.out.println("Navigate to Chrome browser");

    }
}
class FirefoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opens Firefox browser");

    }

    @Override
    public void close() {
        System.out.println("Close Firefox browser");

    }

    @Override
    public String getTitle() {
        return "Firefox";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Takes screenshot in Firefox browser");

    }

    @Override
    public void navigate() {
        System.out.println("Navigates to Firefox browser");

    }
}
class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opens  Safari browser");

    }

    @Override
    public void close() {
        System.out.println("Close Safari browser");

    }

    @Override
    public String getTitle() {
        return "Safari";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Takes screenshot in Safari browser");

    }

    @Override
    public void navigate() {
        System.out.println("Navigates tp Safari browser");

    }
}
class WebDriverTester {
    public static void main(String[] args) {

        RemoteWebDriver chrome = new ChromeDriver();
        chrome.navigate();
        chrome.open();
        chrome.close();
        chrome.getScreenshot();
        chrome.getTitle();

        RemoteWebDriver safari=new SafariDriver();
        safari.getTitle();
        safari.navigate();
        safari.getScreenshot();
        safari.open();
        safari.close();

        RemoteWebDriver firefox=new FirefoxDriver();
        firefox.navigate();
        firefox.open();
        firefox.getScreenshot();
        firefox.close();

    }
}
