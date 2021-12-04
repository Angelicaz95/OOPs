package com.company.project;

public class Registration {
   private  String email;
    private String userName;
    private String password;

   public void setEmail(String email){

       if(email.contains("yahoo")){
           this.email=email;
       }else{
           System.out.println("Invalid email");
       }
    }
    public void setUserName(String userName){
       if(!userName.isEmpty() && userName.length()>6){
           this.userName=userName;
       }else{
           System.out.println("Invalid user name");
       }
    }
    public void setPassword(String password){
       if(!password.isEmpty() && password.length()>6 && !password.contains(userName)){
           this.password=password;
       }else{
           System.out.println("Invalid password");
       }
    }

    public String getEmail(){
       return email;
    }
    public String getUserName(){
       return userName;
    }
    public String getPassword(){
       return password;
    }

}
class RegistrationTester{
    public static void main(String[] args) {


        Registration user = new Registration();

        user.setEmail("johnsnow@yahoo.com");
        System.out.println(user.getEmail());
        user.setUserName("kinginthenorth");
        System.out.println(user.getUserName());
        user.setPassword("king123456");
        System.out.println(user.getPassword());
    }
}
