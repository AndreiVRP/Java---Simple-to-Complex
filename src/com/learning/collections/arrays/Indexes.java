package com.learning.collections.arrays;

import java.security.SecureRandom;

public class Indexes {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] freq = new int[10];
        for(int i = 0; i < freq.length; i++) {
            freq[i] = 1 + random.nextInt(6); // dice can generate numbers from 1 to 6 inclusively = 1 + (0-5), nextInt's bound is exclusive
            System.out.println("Roll " + (i + 1) + ". Value: " + freq[i]); // i + 1 - because Roll cannot be number 0 but arrays start at index 0
        }
    }
}
