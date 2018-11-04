package com.dom.samouczek.zadanie5;

public class Main5 {
    public static void main(String[] args) {
        int[] tab = {6,6,6,6};

        Main5 main5 = new Main5();
        System.out.println(main5.sum(tab));
    }

    public int sum(int[] tab){
        int result = 0;
        for (int i = 0; i < tab.length; i++) {
            result = result + tab[i];
        }
        return result;
    }
}
