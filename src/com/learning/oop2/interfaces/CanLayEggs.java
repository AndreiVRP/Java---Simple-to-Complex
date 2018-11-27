package com.learning.oop2.interfaces;

public interface CanLayEggs {

    default void layEggs(){
        System.out.println("Laying eggs");
    }
}
