package com.learning.collections.collectionsClass;

import java.util.*;

public class CollectionsMain {
    public static void main(String[] args) {

        List<Card> deckOfCards = new ArrayList<>();
        for (Card.Face face : Card.Face.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                deckOfCards.add(new Card(face, suit));
            }
        }

        List<String> sDeck = convertToString(deckOfCards);

        System.out.println("---------- SORTED A to Z ----------");
        Collections.sort(sDeck); //TODO - figure out how to sort the array by Card.Face
        printToConsole(sDeck);

        System.out.println("---------- SHUFFLED ----------");
        Collections.shuffle(sDeck);
        printToConsole(sDeck);

//        System.out.println("---------- REVERSED (SORTED Z TO A) ----------");
//        Collections.sort(sDeck, Collections.reverseOrder());
//        printToConsole(sDeck);

        // binary search
//        Collections.shuffle(deckOfCards); // the instructor said binarySearch() works only for sorted collections
        Card card = new Card(Card.Face.Ace, Card.Suit.HEARTS);
        int cardIndex = Collections.binarySearch(deckOfCards, card);
        if (cardIndex >= 0) {
            System.out.println("The card was found at index " + cardIndex);
        } else {
            System.out.println("Card wasn't found...");
        }

        // copy an existing list into a new one
        List<String> newDeck1 = new ArrayList<>(sDeck);
        Collections.copy(newDeck1, sDeck);
        System.out.println(newDeck1);
        List<String> newDeck2 = new ArrayList<>();
        String sCard1 = sDeck.get(1);
        String sCard2 = sDeck.get(23);
        Collections.addAll(newDeck2, sCard1, sCard2);
        System.out.println(newDeck2);

        //frequency
//        sDeck.add(sCard1); // just to check the card alias down below
        int f = Collections.frequency(sDeck, sCard1);
        String cardAlias;
        if (f == 1) {
            cardAlias = "card";
        } else {
            cardAlias = "cards";
        }
        System.out.println(f + " " + cardAlias + " named " + sCard1 + " found in the deck");

        //MIN / MAX
        System.out.println("MIN: " + Collections.min(sDeck));
        System.out.println("MAX: " + Collections.max(sDeck)); // incorrect because of alphabetical sorting

        List<Integer> numbers = new ArrayList<>();
        numbers.add(12345);
        numbers.add(23);
        numbers.add(1);
        numbers.add(56789);
        System.out.println(numbers.size());
        System.out.println("MIN: " + Collections.min(numbers));
        System.out.println("MAX: " + Collections.max(numbers));

    }

    public static class Card implements Comparable<Card> {

        private enum Suit {SPADES, HEARTS, CLUBS, DIMONDS}

        private enum Face {Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King}

        private final Face face;
        private final Suit suit;

        public Card(Face face, Suit suit) {
            this.face = face;
            this.suit = suit;
        }

        public Suit getSuit() {
            return suit;
        }

        public Face getFace() {
            return face;
        }

        @Override
        public int compareTo(Card card) {
            Face[] values = Face.values();
            List<Face> faces = Arrays.asList(values);

            if (faces.indexOf(this.face) < faces.indexOf(card.getFace())) {
                return -1;
            } else if (faces.indexOf(this.face) > faces.indexOf(card.getFace())) {
//                return +1; // if you want alphabetical sorting
                return 0; // if you want natural sorting (in the sequence the enum values were introduced)
            } else if (faces.indexOf(this.face) == faces.indexOf(card.getFace())) {
                return String.valueOf(suit).compareTo(String.valueOf(card.getSuit()));
            }
            return 0;
        }

    }

    public static List<String> convertToString(List<Card> cards) {
        List<String> stringified = new ArrayList<>();
        for (Card card : cards) {
            stringified.add(card.face + " of " + card.suit);
        }
        return stringified;
    }

    public static void printToConsole(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }

    // CUSTOM COMPARATOR - Lesson 48, 15:23 ...
}
