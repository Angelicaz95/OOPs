package com.company.class21;

public class WebDriver {
    void openWebsite(){
        System.out.println("Opening a website");
    }
    void signUp(){
        System.out.println("Sign up");
    }
    void logIn(){
        System.out.println("log in");
    }
    void enterUserPassword(){
        System.out.println("Entering user password");
    }
    void clickSubmit(){
        System.out.println("clicking on submitt button");
    }
    void closeBrowser(){
        System.out.println("closing the browser");
    }

}
class GoogleChrome extends WebDriver{
    void openWebsite(){
        System.out.println("Opening a website with GC");
    }
    void signUp(){
        System.out.println("Sign up on the website with GC");
    }
    void logIn(){
        System.out.println("log in on the website with GC");
    }
    void enterUserPassword(){
        System.out.println("Entering user password in GC");
    }
    void clickSubmit(){
        System.out.println("clicking on submit button in GC");
    }
    void closeBrowser(){
        System.out.println("closing the GC browser");
    }

}
class FireFox extends WebDriver{
    void openWebsite(){
        System.out.println("Opening a website with FF");
    }
    void signUp(){
        System.out.println("Sign up on the website with FF");
    }
    void logIn(){
        System.out.println("log in on the website with FF");
    }
    void enterUserPassword(){
        System.out.println("Entering user password in FF");
    }
    void clickSubmit(){
        System.out.println("clicking on submit button in FF");
    }
    void closeBrowser(){
        System.out.println("closing the FF browser");
    }

}
class Safari extends WebDriver{
    void openWebsite(){
        System.out.println("Opening a website with Safari");
    }
    void signUp(){
        System.out.println("Sign up on the website with Safari");
    }
    void logIn(){
        System.out.println("log in on the website with Safari");
    }
    void enterUserPassword(){
        System.out.println("Entering user password in Safari");
    }
    void clickSubmit(){
        System.out.println("clicking on submit button in Safari");
    }
    void closeBrowser(){
        System.out.println("closing the Safari browser");
    }

}