package com.pluralsight.oop;

public class Dog {
    private String furColor;
    private  String name;
    private double weight;
    private String breed;

    public Dog() {

    }

    public Dog(String furColor, String name, double weight, String breed) {
        this.furColor = furColor;
        this.name = name;
        this.weight = weight;
        this.breed = breed;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {
        System.out.println(name + " says woof woof");
    }
}
