package com.company.reviewclass10;

public class FacebookAccount {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;

    }
}
class FacebookAccountTester{
    public static void main(String[] args) {
        FacebookAccount fb= new FacebookAccount();
        fb.setUserName("angelica1234567");
        System.out.println(fb.getUserName());

    }
}
