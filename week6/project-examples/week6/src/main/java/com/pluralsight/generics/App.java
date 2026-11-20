package com.pluralsight.generics;

public class App {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("lenovo", "thinkpad", 2025);
        LaptopBag laptopBag = new LaptopBag();
        laptopBag.setLaptop(laptop);

        Chihuahua chihuahua = new Chihuahua("toodle");
        ChihuahuaBag chihuahuaBag = new ChihuahuaBag();
        chihuahuaBag.setChihuahua(chihuahua);

        Bag<Laptop> laptopBag1 = new Bag<>();
        laptopBag1.setContent(laptop);

        Bag<Chihuahua> chihuahuaBag1 = new Bag<>();
        chihuahuaBag1.setContent(chihuahua);

        Bag<Integer> integerBag = new Bag<>();
        integerBag.setContent(4);



    }


}
