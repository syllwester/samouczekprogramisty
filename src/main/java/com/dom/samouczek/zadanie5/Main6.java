package com.dom.samouczek.zadanie5;

public class Main6 {
    public static int sum(int[][] tab) {
        int result = 0;
        for (int[] table : tab){
            for(int number : table){
                result += number;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] tab = new int[][] {new int[]{1,2},new int[]{5,6},new int[]{3,3}};
        System.out.println(sum(tab));
    }
}
