package com.dom.samouczek.zadanie5;

/**
 * Create by Sylwester Garstecki
 * Metoda sumująca liczby w tablicy
 */

public class SumNumTab {
    public static void main(String[] args) {
        int[] tab = {6,6,6,6};

        SumNumTab sumNumTab = new SumNumTab();
        System.out.println(sumNumTab.sum(tab));
    }

    public int sum(int[] tab){
        int result = 0;
        for (int i = 0; i < tab.length; i++) {
            result = result + tab[i];
        }
        return result;
    }
}
