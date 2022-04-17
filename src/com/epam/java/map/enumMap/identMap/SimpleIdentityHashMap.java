package com.epam.java.map.enumMap.identMap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class SimpleIdentityHashMap {
    public static void main(String[] args) {
        IdentityHashMap<Integer, String> identityHashMap = new IdentityHashMap<>();

        identityHashMap.put(1, "one");
        identityHashMap.put(11, "two");
        identityHashMap.put(55, "three");
        identityHashMap.put(1, "for");
        identityHashMap.put(22, "five");

        Set set = identityHashMap.entrySet();
        for (Object o : set) {
            Map.Entry<Integer, String> map = (Map.Entry) o;
            System.out.println(map.getKey() + " " + map.getValue());
        }

        System.out.println();

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "one");
        hashMap.put(11, "two");
        hashMap.put(55, "three");
        hashMap.put(1, "for");
        hashMap.put(22, "five");

        Set set2 = hashMap.entrySet();
        for (Object o : set) {
            Map.Entry<Integer, String> map = (Map.Entry) o;
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}
