package com.dom.samouczek.zadanie9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę: ");

        Scanner scanner = new Scanner(System.in);
        double userNumber = 0;


        while (true) {
            try {
                userNumber = scanner.nextDouble();
                break;
            } catch (InputMismatchException e){
                System.out.println("Podaj poprawną liczbę!");
                scanner.next();
            }
        }

        if (userNumber < 0 ){
            throw new IllegalArgumentException("Pierwiastek z liczby rzeczywistej " + userNumber + " nie istnieje!");

        }

        System.out.println("Pierwiastek z liczby " + userNumber +" to " + Math.sqrt(userNumber));
    }
}
