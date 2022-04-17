package com.epam.java.map.enumMap.hashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class SimpleHashMap {

    public static void main(String[] args) {
//        HashMap<String ,Integer > hm = new HashMap<>();
//        hm.put(null,25);
//        hm.put(null,50);
//        System.out.println(hm.get(null));

        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
        lhm.put("apple", "a");
        lhm.put("banana", "b");
        lhm.put("apricot", "c");

        Set<Map.Entry<String, String>> set = lhm.entrySet();


        for (Map.Entry<String, String> stringStringEntry : set) {
            System.out.println(stringStringEntry.getKey() + " " + stringStringEntry.getValue());
        }
    }
}
