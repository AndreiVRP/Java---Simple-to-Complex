package com.learning.oop2.nested1;

public class Display {

    private final int DISPLAY_HEIGHT = 1920;
    private final int DISPLAY_WIDTH = 1280;

    public Display() {
        Pixel pixel = new Pixel(10, 10, Color.BLUE);
    }

    // a nested class -> no pixel cannot exist outside of a display
    public class Pixel {
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
