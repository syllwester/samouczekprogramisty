package com.dom.samouczek.zadanie4;

public class Main2 {
    public int biggest(int[] tableOfNumbers){
        return Math.max(tableOfNumbers[0],Math.max(tableOfNumbers[1],tableOfNumbers[2]));
    }
    public static void main(String[] args) {
        int[] table = new int[3];
        table[0] = 1;
        table[1] = 2;
        table[2] = 3;

        Main2 main2 = new Main2();
        System.out.println(main2.biggest(table));
    }
}
