package com.dom.samouczek.zadanie6;

/**
 * Create by Sylwester Garstecki
 * Program oblicza średnią każdego przedmiotu oraz średnią ogólną ze wszystkich przedmiotów.
 * Oceny z przedmiotów umieszone są w tablicy dwuwymiarowej.
 */
public class AverageGrade {
    public static void main(String[] args) {
        int[][] tableOfClasses = new int[][]{new int[]{1, 2, 3, 4}, new int[]{5, 6, 5, 5}, new int[]{3, 3, 3, 3}};
        int[][] tableOfClasses2 = new int[][]{new int[]{5, 6, 1, 2}, new int[]{1, 5, 2, 3}, new int[]{2, 3, 5, 3}};

        System.out.println("Tabela 1: ");
        getAverage(tableOfClasses);

        System.out.println("Tabela 2: ");
        getAverage(tableOfClasses2);
    }

    public static void getAverage(int[][] tableOfClasses) {

        int totalAverage = 0;
        for (int i = 0; i < tableOfClasses.length; i++) {
            int average = 0;
                for (int note : tableOfClasses[i]) {
                    average += note;
                }
            average /= tableOfClasses[i].length;
            System.out.println("Średnia z przedmiotu numer " + (i + 1) + " = " + average);
            totalAverage += average;
        }

        totalAverage /= tableOfClasses.length;
        System.out.println("Średnia ze wszystkich przedmiotów wynosi " + totalAverage);

    }
}
