package com.epam.java.map.enumMap.immutableClass;

public record Immutable(int id, String name) {

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
