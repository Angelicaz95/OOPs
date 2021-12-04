package com.company.class23;

import com.sun.prism.shader.AlphaOne_Color_AlphaTest_Loader;

public abstract class Phone {
        void makePhoneCalls(){
                System.out.println("Making a call");
        }
        void sendText(){
                System.out.println("Sending a text");
        }
        abstract void displayPictures();
        abstract void unlockPhone();

        }
        class Iphone extends Phone{
        @Override
        void displayPictures(){
                System.out.println("Iphone uses Photos app to display pictures");
        }
        @Override
        void unlockPhone(){
                System.out.println("Unlock phone using FACE ID");
        }

        }
class Samsung extends Phone{
        @Override
        void displayPictures() {
                System.out.println("Use gallery to view pictures");
        }
        @Override
        void unlockPhone(){
                System.out.println("Use fingerprint to unlock the phone");
        }
}