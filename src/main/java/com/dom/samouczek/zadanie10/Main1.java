package com.dom.samouczek.zadanie10;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");
        int num = scanner.nextInt();

        int resultInt = (int) (num*Math.PI);
        double resultDouble = num*Math.PI;

        System.out.println("Wyniki: " + "\n" + "int = " + resultInt + "\n" +
                "double = " + resultDouble);
    }
}
