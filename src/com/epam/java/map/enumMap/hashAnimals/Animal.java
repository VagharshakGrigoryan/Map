package com.epam.java.map.enumMap.hashAnimals;

import java.util.Objects;

public class Animal {
    private  int price;
    private  String bread;

    public Animal(int price, String bread) {
        this.price = price;
        this.bread = bread;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return price == animal.price && Objects.equals(bread, animal.bread);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, bread);
    }
}
