package com.learning.oop2.nested2;

public class Display {

    private static final int DISPLAY_HEIGHT = 1920; //turned static
    private static final int DISPLAY_WIDTH = 1280; //turned static

    public Display() {
        Pixel pixel = new Pixel(10, 10, Color.BLUE);
    }

    // a nested class -> no pixel cannot exist outside of a display
    // now this is also a STATIC class
    private class Pixel { //turned private and static
        private int x;
        private int y;
        private Color color;

        public Pixel(int x, int y, Color color) {

            if (0 <= x && x <= DISPLAY_WIDTH && 0 <= y && y <= DISPLAY_HEIGHT) {
                this.x = x;
                this.y = y;
                this.color = color;
                System.out.println("Creating a " + color.toString().toLowerCase() + " pixel at " + x + " , " + y);
            } else {
                System.out.println("The pixel is out of bounds");
                throw new IllegalArgumentException("X must be within 0 and 1280. Y must be within 0 and 1920.");
            }

        }
    }

    public enum Color {
        RED, GREEN, BLUE, CYAN, MAGENTA, YELLOW, BLACK
    }
}
