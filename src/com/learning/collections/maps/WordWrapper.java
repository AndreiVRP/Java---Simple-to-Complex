package com.learning.collections.maps;

public final class WordWrapper implements Comparable<WordWrapper> {
    private final String word;
    private final Integer count;

    public WordWrapper(String word, Integer count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public Integer getCount() {
        return count;
    }

    @Override
    public int compareTo(WordWrapper thatWord) {
        // this method is required to sort by values (in this case a value is the count = how many times th word is used in the input text
        if (count < thatWord.getCount()) {
            return +1;
        }
        if (count > thatWord.getCount()) {
            return -1;
        }
        return word.compareTo(thatWord.getWord()); //this is required to compare different words with identical word count
    }

    @Override
    public String toString() {
        return word + " -> " + count;
    }
}
