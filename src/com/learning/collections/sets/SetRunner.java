package com.learning.collections.sets;

import java.util.*;

public class SetRunner {
    public static void main(String[] args) {
        Set<Integer> intSet1 = new HashSet<>();
        Set<Integer> intSet2 = new HashSet<>();
        populateIntSet(intSet1, 1,2,3,1,4,5);
        populateIntSet(intSet2, 1,4,5,6,7,8,9);
        System.out.println(intSet1.size());
        System.out.println(intSet2.size());
        Set<Integer> intSetResulting = new HashSet<>();
        intSetResulting.addAll(intSet1);
        System.out.println(intSetResulting.size());
        System.out.println(intSetResulting);
        intSetResulting.addAll(intSet2);
        System.out.println(intSetResulting.size());
        System.out.println(intSetResulting);

        //operations
//        intSet1.removeAll(intSet2); // retails only the values of set1 that cannot be found in set2
//        intSet1.retainAll(intSet2); // retails only the common values shared between the 2 sets
        System.out.println("difference: " + intSet1);




        String[] cars = {"Audi", "Toyota", "Mercedez", "BMW", "Audi"};
        System.out.println("amount of cars: " + cars.length);

        // hash set - unique items - unordered (the fastest one)
        Set<String> uniqueCars = new HashSet<>(Arrays.asList(cars));
        System.out.println(Arrays.toString(cars));
        System.out.println("amount of unique cars (random order): " + uniqueCars.size());
        System.out.println(uniqueCars);

        //linked hash set - unique items - ordered (in the order they were added)
        Set<String> uniqueCarsOrdered = new LinkedHashSet<>(Arrays.asList(cars));
        System.out.println("amount of unique cars (ordered): " + uniqueCarsOrdered.size());
        System.out.println(uniqueCarsOrdered);

        //tree set - unique items - ordered (sorted A to Z)
        Set<String> uniqueCarsSorted = new TreeSet<>(Arrays.asList(cars));
        System.out.println("amount of unique cars (sorted A to Z): " + uniqueCarsSorted.size());
        System.out.println(uniqueCarsSorted);

        String str1 = "Test";
        String str2 = "Test";

        if (str1 == str2) {
            System.out.println("The 2 strings match");
        } else {
            System.out.println("The 2 strings don't match");
        }
        // when checking for uniqueness to populate sets, we can use equals for compare primitive types (and String) but we cannot use it to compare more complex types like objects
        // example:

        Car car1 = new Car("Audi", "A8", 35);
        Car car2 = new Car("Audi", "A8", 35);
        Car car3 = new Car("BMW", "X6", 55);
        Car car4 = new Car("BMW", "X5", 25);
        Car car5 = new Car("Bentley", "Continental", 100);
        Car car6 = new Car("Bentley", "Continental", 110);




        if (car1 == car2) {
            System.out.println("The 2 cars match");
        } else {
            System.out.println("The 2 cars don't match");
        }

        //with that said, if we populate a set with car duplicates, the set will store all of them because the default way to spot duplicates is by using equals()
        //this is where we should override equals() (Ctrl+O) and then use it


        if (car1.equals(car2)) {
            System.out.println("The 2 cars match");
        } else {
            System.out.println("The 2 cars don't match");
        }

        //now our default equals() is overriden and can check objects of the same class for being equal
        //however, to spot duplicates when populating sets, we also need to override hashCode()

        NavigableSet<Car> carSet = new TreeSet<>();
        carSet.add(car1);
        carSet.add(car2);
        carSet.add(car3);
        carSet.add(car4);
        carSet.add(car5);
        carSet.add(car6);
        System.out.println(carSet.size());
        System.out.println("Tree Set: " + carSet.toString()); // toString() is overriden - can avoid calling it explicitly
        //all 3 cars are in the set, including the duplicates, if there is no hashCode implemented
        //however, if you override hashCode(), everything starts working as intended (no duplicates)
        //TODO - read more on hash tables

        Set<Car> cars2 = carSet.headSet(car2); // argument excluded
        System.out.println(cars2); // can infer the usage of the overriden toString() method
        cars2 = carSet.tailSet(car2); // argument included
        System.out.println(cars2);

//        SortedSet<Car> carSubset = carSet.subSet(car2, true,car4, true); // watch out for the arguments you pass when creating a subset since otherwise you may get an exception
        SortedSet<Car> carSubset = carSet.subSet(car4, true,car2, true);
        System.out.println("SUBSET: " + carSubset);
        System.out.println("ENTIRE SET :" + carSet);
        System.out.println("HIGHER: " + carSet.higher(car3)); // next above
        System.out.println("LOWER: " + carSet.lower(car3)); // next below
        //the next two are useful when you compare against something (argument) you aren't sure is in the set
        System.out.println("CEILING: " + carSet.ceiling(car3)); // equal or next above
        System.out.println("FLOOR: " + carSet.floor(car3)); // equal next below

    }

    public static void populateIntSet(Set<Integer> set, Integer... nums) {
        for (Integer num : nums) {
            set.add(num);
        }
    }

}
