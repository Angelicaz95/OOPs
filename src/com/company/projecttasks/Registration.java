package com.company.projecttasks;

public class Registration {
    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName.isEmpty() || userName.length() <= 6) {
            System.out.println("Username cannot be empty or less than 6 characters");
        } else {
            this.userName = userName;
        }
    }

    private String userName;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length()<6){
            System.out.println("User password cannot be less than 6 characters");
        }else{
            if(password.contains(userName)){
                System.out.println("Password cannot contain user name");
            }
        }
        this.password = password;
    }

    private String password;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.toLowerCase().contains("yahoo")){
            this.email=email;
        }else{
            System.out.println("Not a valid email");
        }

    }




}
