package com.company.class19.hw;


 public class userClass {
    String name;
    String phoneNumber;
    userClass(String name, String phoneNumber){
        this.name=name;
        this.phoneNumber=phoneNumber;
    }



}

 class userInfo extends userClass {
    String name;
    String phoneNumber;
    String address;
    userInfo(String name, String phoneNumber, String address){
        super(name, phoneNumber);
        this.address=address;
    }
void userDetails(){
    System.out.println(name+" "+phoneNumber+" "+address);

}


}


