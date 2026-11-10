package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Cat {
    private String name;

    public void sayMeow() {
        System.out.println("Meow");
    }

    public void sayMeow(String sound) {
        System.out.println(sound);
    }

}
