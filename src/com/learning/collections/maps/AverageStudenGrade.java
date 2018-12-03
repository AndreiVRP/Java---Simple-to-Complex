package com.learning.collections.maps;

public class AverageStudenGrade implements Comparable<AverageStudenGrade> {
    private final String name;
    private final float averageGrade;

    public AverageStudenGrade(String name, float averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public float getAverageGrade() {
        return averageGrade;
    }

    @Override
    public int compareTo(AverageStudenGrade that) {
        if (this.averageGrade < that.getAverageGrade()) {
            return -1;
        }
        if (this.averageGrade > that.getAverageGrade()) {
            return +1;
        }

        return name.compareTo(that.getName());
    }

    @Override
    public String toString() {
        return "Student's name: " + name + ". Grade: " + averageGrade;
    }
}
