package com.learning.collections.stack;

import java.util.*;

public class StackQueueLauncher {
    public static void main(String[] args) {
        passengerProcessing();
    }

    private static void passengerProcessing() {
        Stack<Passenger> bus = new Stack<>(); //stack - first in, last out / last in, first out
        bus.push(new Passenger("Jim", "Doe"));
        bus.push(new Passenger("John", "Doe"));
        bus.push(new Passenger("Dana", "White"));
        System.out.println("The last passenger to enter was " + bus.peek().getFullName());
        
        Passenger passengerToSearch = bus.get(1); // set it to the second passenger (index starts at 0 -> index 1 = second)
        System.out.println("Searching for " + passengerToSearch.getFullName());
        System.out.println("Passenger found at position " + bus.search(passengerToSearch)); //checking whether it's the right passenger

        try {
            while (!bus.empty()) {
                System.out.println(bus.pop().getFullName() + " got off the bus");
                System.out.println("The next passenger to get off the bus is " + bus.peek().getFullName());
            }
        } catch (EmptyStackException e) {
            System.out.println("The bus is now empty");
        }


    }

    private static class Passenger {
        private static int number = 1;
        private String name;
        private String surname;

        public Passenger(String name, String surname) {
            number++;
            this.name = name;
            this.surname = surname;
        }

        public static int getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        //computed property
        public String getFullName() {
            return name + " " + surname;
        }

        @Override
        public String toString() {
            return "Passenger{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
    }
}
