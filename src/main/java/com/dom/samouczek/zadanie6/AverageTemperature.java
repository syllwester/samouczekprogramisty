package com.dom.samouczek.zadanie6;

/**
 * Create by Sylwester Garstecki
 * Program obliczający średnią z 7 wprowadzonych przez użytkownika temperatur.
 */

import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] tableOfTemperature = new double[7];

        for (int i = 0; i < tableOfTemperature.length; i++) {
            System.out.println("Wprowadź temperaturę " + (i+1));
            tableOfTemperature[i] = scanner.nextDouble();
        }

        double sumOfTemperature = 0;
        for (double temperature :
                tableOfTemperature) {
            sumOfTemperature += temperature;
        }

        System.out.println("Średnia temperatura wynosi: " + (sumOfTemperature/tableOfTemperature.length));

        
    }
}
