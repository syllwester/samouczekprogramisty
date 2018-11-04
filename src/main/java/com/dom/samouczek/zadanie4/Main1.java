package com.dom.samouczek.zadanie4;

public class Main1 {

    public int sum(int[] tableOfNumbers){
        return tableOfNumbers[0] + tableOfNumbers[1];
    }
    public static void main(String[] args) {
        Main1 main1 = new Main1();
        int[] table = new int[2];
        table[0] = 4;
        table[1] = 5;

        System.out.println(main1.sum(table));
    }


}
