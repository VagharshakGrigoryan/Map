package com.epam.java.map.enumMap.treeMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        NavigableMap <String ,Animals> nm = new TreeMap<>();
        nm.put("Aram",new Animals(7000));

        Animals pet = new Animals(8000);
        nm.put("Alex",pet);
        nm.put("Poghos",new Animals(5000));
        nm.put("Hayk",new Animals(6000));

        System.out.println(nm);

        System.out.println(nm.get("Alex"));
        System.out.println(nm.containsKey("Poghos"));
        System.out.println(nm.containsValue(new Animals(8000)));
        System.out.println(nm.containsValue(pet));

        Set<String> keyName  = nm.keySet();
        Collection<Animals> petsPrice = nm.values();
        System.out.println(keyName);
        System.out.println(petsPrice);

        Set <Map.Entry<String,Animals>> keysAndValue = nm.entrySet();
        System.out.println(keysAndValue);
        for (Map.Entry<String, Animals> temp : keysAndValue) {

            temp.setValue(new Animals(10000));

        }
        System.out.println(keysAndValue);

    }
}
