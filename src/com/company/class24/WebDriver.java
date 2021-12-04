package com.company.class24;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}

class ChromeDriver implements WebDriver{
    @Override
   public void openBrowser(){
        System.out.println("Opening the Google Chrome browser");
    }
    @Override
    public void closeBrowser(){
        System.out.println("Closing the Google Chrome browser");
    }
    @Override
    public void maximizeWindow(){
        System.out.println("Maximizing the Google Chrome window ");
    }
    @Override
    public void findElement(){
        System.out.println("Finding the element on Google Chrome");
    }

}
class FirefoxDriver implements WebDriver{
    @Override
    public void openBrowser(){
        System.out.println("Opening the FireFox");
    }
    @Override
    public void closeBrowser(){
        System.out.println("Closing FireFox");
    }
    @Override
    public void maximizeWindow(){
        System.out.println("Maximizing FireFox window ");
    }
    @Override
    public void findElement(){
        System.out.println("Finding the element on FireFox");
    }

}
