package com.dom.samouczek.zadanie10;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        int num1 = scanner.nextInt();
        System.out.println("Podaj drugą lcizbę: ");
        int num2 = scanner.nextInt();

        double result = (double)num1 / num2;
        System.out.println("Wynik dzielenia: " + result);
    }
}
