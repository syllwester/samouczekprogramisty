package com.dom.samouczek.zadanie5;

/**
 * Create by Sylwester Garstecki
 * Program sprawdzający działanie operatora --, poprzez użycie pętli for oraz while
 */

public class Operator2Minus {
    public static void main(String[] args) {
        for (int i = 20; i >= 10; i--) {
            System.out.println(i);
        }
        System.out.println("");
        int number = 20;

        while(number >= 10){
            System.out.println(number);
            number--;
        }
    }
}
