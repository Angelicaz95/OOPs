package com.company.projecttasks;

public interface WebDriver {
    void open();
    void close();
    String getTitle();


}
interface TakeScreenShot {
    void getScreenShot();

}
interface RemoteWebDriver extends TakeScreenShot, WebDriver{
    void navigate();

}
class GoogleChrome implements RemoteWebDriver{


    @Override
    public void open() {
        System.out.println("Opens Google Chrome");

    }

    @Override
    public void close() {
        System.out.println("Closes Google Chrome ");

    }

    @Override
    public String getTitle() {
        return "Google Chrome";
    }

    @Override
    public void getScreenShot() {
        System.out.println("Takes screenshot in GoogleChrome");

    }

    @Override
    public void navigate() {
        System.out.println("Navigates to Gooogle Chrome");

    }
}
class RemoteWebDriverTester{
    public static void main(String[] args) {
        GoogleChrome driver=new GoogleChrome();
        driver.open();
        driver.close();
        driver.getScreenShot();
        driver.getTitle();


    }

}
