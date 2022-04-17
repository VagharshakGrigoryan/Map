package com.epam.java.map.enumMap;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class SimpleEnumMap {
    public static void main(String[] args) {
        Map<Animal, String> enumMap = new EnumMap<Animal, String>(Animal.class);
        enumMap.put(Animal.CAT, null);
        enumMap.put(Animal.DOG, "dog");
        enumMap.put(Animal.Bird, "bird");

        Collections.synchronizedMap(enumMap);

        Set set = enumMap.entrySet();
        for (Object o : set) {
            Map.Entry m = (Map.Entry) o;
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}

enum Animal {
    CAT, DOG, Bird
}
