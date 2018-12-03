package com.learning.collections.maps;

import java.util.*;

public class MapLauncher {
    public static void main(String[] args) {
        Map<String, Integer> wordMap = new HashMap<>();
        System.out.println("Please, enter some text");
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        String[] tokens = inputText.split(" ");
        for (String token : tokens) {
            String word = token.toLowerCase();
            Integer count = wordMap.get(word);
            if (count == null) {
                wordMap.put(word, 1);
            } else {
                wordMap.put(word, count + 1);
            }
        }

        NavigableSet<WordWrapper> wordWrappers = convertToSet(wordMap);
        printSet(wordWrappers);

    }

    private static NavigableSet<WordWrapper> convertToSet(Map<String, Integer> wordMap) {
        wordMap.remove("a");
        wordMap.remove("the");
//        wordMap.remove("the", 5); // the will be removed only if its count is 5
        wordMap.replace("this", 2, 0);

        NavigableSet<WordWrapper> wordSet = new TreeSet<>();
        for (Map.Entry<String, Integer> e : wordMap.entrySet()) {
            WordWrapper ww = new WordWrapper(e.getKey(), e.getValue());
            wordSet.add(ww);
        }
        return new TreeSet<>(wordSet); // this is done to avoid mutating the initial set that you may want to use again
    }

    private static void printSet(NavigableSet<WordWrapper> wordWrappers) {
        for (WordWrapper wordWrapper : wordWrappers) {
            System.out.println(wordWrapper);
        }
    }


}
