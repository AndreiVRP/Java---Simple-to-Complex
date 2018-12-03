package com.learning.collections.maps;
import java.util.*;

public class TreeMapRunner {
    public static void main(String[] args) {
        NavigableMap<AverageStudenGrade, Set<SubjectGrade>> grades = createGrades();
        printGrades(grades, false);
        AverageStudenGrade threshold = grades.ceilingKey(new AverageStudenGrade("", 80));
//        SortedMap<AverageStudenGrade, Set<SubjectGrade>> scholarshipStudents = grades.tailMap( threshold);
        NavigableMap<AverageStudenGrade, Set<SubjectGrade>> scholarshipStudents = (NavigableMap<AverageStudenGrade, Set<SubjectGrade>>) grades.tailMap( threshold);

        System.out.println("---------- SCHOLARSHIP ----------");
        printGrades(scholarshipStudents.descendingMap(),false);
        System.out.println("---------- CONTENDER ----------");
        AverageStudenGrade contender = grades.lowerKey(threshold);
        System.out.println(contender);
        System.out.println("---------- BEST STUDENT ----------");
        System.out.println(scholarshipStudents.descendingMap().firstEntry());
    }

    private static NavigableMap<AverageStudenGrade, Set<SubjectGrade>> createGrades() {
        Set<SubjectGrade> alexGrades = new HashSet<>();
        populateGrades(alexGrades, 89, 65, 95, 90, 75);
        Set<SubjectGrade> jamesGrades = new HashSet<>();
        populateGrades(jamesGrades, 75, 80, 55, 70, 80);
        Set<SubjectGrade> antonyGrades = new HashSet<>();
        populateGrades(antonyGrades, 93, 91, 82, 78, 88);
        Set<SubjectGrade> victoriaGrades = new HashSet<>();
        populateGrades(victoriaGrades, 73, 65, 75, 66, 50);
        Set<SubjectGrade> alinaGrades = new HashSet<>();
        populateGrades(alinaGrades, 90, 70, 78, 88, 89);

        //best practice is to wrap collections to use as parameters for other collections but this time we'll put it this way
        NavigableMap<AverageStudenGrade, Set<SubjectGrade>> map = new TreeMap<>();
        map.put(new AverageStudenGrade("Alex", calcAverage(alexGrades)), alexGrades);
        map.put(new AverageStudenGrade("James", calcAverage(jamesGrades)), jamesGrades);
        map.put(new AverageStudenGrade("Antony", calcAverage(antonyGrades)), antonyGrades);
        map.put(new AverageStudenGrade("Victoria", calcAverage(victoriaGrades)), victoriaGrades);
        map.put(new AverageStudenGrade("Alina", calcAverage(alinaGrades)), alinaGrades);
        return map;
    }

    private static float calcAverage(Set<SubjectGrade> grades) {
        float sum = 0;
        for (SubjectGrade grade : grades) {
            sum += grade.getGrade();
        }
        return sum / grades.size();
    }

    private static void populateGrades(Set<SubjectGrade> grades, int math, int physics, int history, int literature, int chemistry) {
        grades.add(new SubjectGrade("Math", math));
        grades.add(new SubjectGrade("Physics", physics));
        grades.add(new SubjectGrade("History", history));
        grades.add(new SubjectGrade("Literature", literature));
        grades.add(new SubjectGrade("Chemistry", chemistry));
    }

    private static void printGrades(Map<AverageStudenGrade, Set<SubjectGrade>> grades, boolean printValue) {
        Set<AverageStudenGrade> averageGrades = grades.keySet();
        for (AverageStudenGrade ag : averageGrades) {
            System.out.println(ag);
            if (printValue) {
                System.out.println(grades.get(ag));
            }
        }
    }
}
