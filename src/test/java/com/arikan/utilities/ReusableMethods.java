package com.arikan.utilities;

public class ReusableMethods {

    public static void sleep(int milliseconds){

        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
