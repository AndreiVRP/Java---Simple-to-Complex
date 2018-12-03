package com.learning.collections.collectionInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionsMail {
    public static void main(String[] args) {

        //used to be
        List<Object> list1 = new LinkedList<>();
        list1.add("Test"); // String
        list1.add(12345); // int

        for ( Object item : list1) {
            if (item instanceof String) {
                System.out.println((String) item); // had to do downcasting back then
            }
        }

        // now its better to specify the type instead of using Object and then downcasting the Object items to a more specific type like String
        List<String> list2 = new LinkedList<>();
        list2.add("Test 1");
//        list2.add(12345); // in this case, you just cannot add an int to a String collection and therefore you don't have to downcast anything
        list2.add("Test 2");

        for (String item : list2 ) {
            System.out.println(item);
        }

        //primitive types cannot be used as parameters
        //since collections are now parametric, you cannot say List<int>
        //that's why there are wrappers for primitive types lke Integer -> List<Integer>

        // auto-boxing/unboxing
        List<Integer> list3 = new ArrayList<>();
//        list3.add(valueOf(1));  //unnecessary boxing
        list3.add(77);

        Integer num = 555;
        int num2 = num.intValue(); // unnecessary unboxing
        System.out.println(num2);

        //array to LinkedList
        String[] colors = {"red", "green", "blue"};
        List<String> colorList = new LinkedList<>(Arrays.asList(colors));
        for (String color : colors) {
            System.out.println(color);
        }

        //LinkedLIst to array
        colors = colorList.toArray(new String[colorList.size()]);
        for (String color : colors) {
            System.out.println(color);
        }


    }
}
