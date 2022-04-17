package com.epam.java.map.enumMap.hashAnimals;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal(5000,"Labrador");
        Animal cat = new Animal(7000,"Sphynx");
        Animal bird = new Animal(6000,"Parrot");

        HashMap<Animal,String> hm = new HashMap<>();
        hm.put(dog,"Mike");
        hm.put(cat,"Myu");
        hm.put(bird,"Kesha");

        Animal findName = new Animal(5000,"Labrador");
        System.out.println(hm.get(findName));
    }
}
