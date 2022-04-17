package com.epam.java.map.enumMap.weakHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class SimpleWeakHashMap {
    public static void main(String[] args) {
//        Integer test = 1;//Strong reference
//        SoftReference<Integer> softReference = new SoftReference<>(test);
//        WeakReference<Integer> weakReference = new WeakReference<>(test);
//        test = null;
//
//        PhantomReference<Integer> phantomReference = new PhantomReference<>(test, new ReferenceQueue<>());*/

        Map<String,String> weakHshMap = new WeakHashMap<>();
        Map<String,String > hashMap = new HashMap<>();

        String keyWeakHashMap = new String("keyWeakHashMap");
        String keyHashMap = new String("keyHashMap");

        weakHshMap.put(keyWeakHashMap,"weakHash");
        hashMap.put(keyHashMap,"Hash");

        System.out.println("Before gc, weak = " + weakHshMap.get("keyWeakHashMap") + " hash = " + hashMap.get("keyHashMap"));

        keyWeakHashMap = null;
        keyHashMap = null;

        System.gc();

        System.out.println("After gc, weak = " + weakHshMap.get("keyWeakHashMap") + " hash = " + hashMap.get("keyHashMap"));
    }
}
