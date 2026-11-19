package com.pluralsight.advancedoop;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Lion l = new Lion();
        Cat c = new Cat();
        Dog d = new Dog();
        Rabbit r = new Rabbit();

        List<Animal> animals = new ArrayList<>();
        animals.add(l);
        animals.add(c);
        animals.add(d);
        animals.add(r);

        List<Pettable> pettables = new ArrayList<>();
        pettables.add(d);
        pettables.add(c);

        petThing(c);
        petThing(d);

    }

    public static void petThing(Pettable p) {
        p.pet();
    }
}
