package com.learning.oop2.interfaces;

public interface CanWalk extends CanLayEggs {
    void walk();
    //since layEggs() is a default method, there is no need to add to implement it elsewhere
}
