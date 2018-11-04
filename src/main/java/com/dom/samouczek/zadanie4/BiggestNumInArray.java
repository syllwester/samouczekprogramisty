package com.dom.samouczek.zadanie4;

/**
 * Create by Sylwester Garstecki
 * Program sprawdza oraz wyświetla największą liczbę w tablicy.
 */

public class BiggestNumInArray {
    public int biggest(int[] tableOfNumbers){
        int max = 0;

        for (int i = 0; i < tableOfNumbers.length; i++) {
            if(tableOfNumbers[i]>max){
                max = tableOfNumbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] table = new int[6];
        table[0] = 1;
        table[1] = 2;
        table[2] = 3;
        table[3] = 54;
        table[4] = 22;
        table[5] = 17;

        BiggestNumInArray biggestNumInArray = new BiggestNumInArray();
        System.out.println(biggestNumInArray.biggest(table));
    }
}
