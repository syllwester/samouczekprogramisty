package com.dom.samouczek.zadanie4;

/**
 * Create by Sylwester Garstecki
 * Program sumujący liczby w tablicy.
 */
public class SumNumInArray {

    public int sum(int[] tableOfNumbers){
        int sum = 0;
        for (int i = 0; i < tableOfNumbers.length; i++){
            sum = sum + tableOfNumbers[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        SumNumInArray sumNumInArray = new SumNumInArray();
        int[] table = new int[5];
        table[0] = 4;
        table[1] = 5;
        table[2] = 1;
        table[3] = 3;
        table[4] = 2;

        System.out.println("Sum of numbers = " + sumNumInArray.sum(table));
    }


}
