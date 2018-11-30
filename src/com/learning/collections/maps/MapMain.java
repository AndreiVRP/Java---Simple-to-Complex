package com.learning.collections.maps;
import java.util.*;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"fiveeeeeeee");

        printMap(map);
        map.put(5,"five");
        printMap(map); // keys must be unique
        // adding a KV pair with the same key will only update the existing KV pair with the same key

        System.out.println(map.get(2));
        System.out.println(map.get(3));

    }

    public static void printMap(Map<Integer,String> map) {
        for (String value : map.values()) {
            System.out.println(value);
        }
        System.out.println("----------");
    }
}
