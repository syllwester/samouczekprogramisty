package com.dom.samouczek.zadanie4;

/**
 * Create by Sylwester Garstecki
 */
public class Sudoku {
    public static void main(String[] args) {
        Integer[][] table = new Integer[][]{
          new Integer[]{2, null, null, 6, null, 7, 5, null, null},
          new Integer[]{null, null, null, null, null, null, null, 9, 6},
          new Integer[]{6, null, 7, null, null, 1, 3, null, null},

          new Integer[]{null, 5, null, 7, 3, 2, null, null, null},
          new Integer[]{null, 7, null, null, null, null, null, 2, null},
          new Integer[]{null, null, null, 1, 8, 9, null, 7, null},

          new Integer[]{null, null, 3, 5, null, null, 6, null, 4},
          new Integer[]{8, 4, null, null, null, null, null, null, null},
          new Integer[]{null, null, 5, 2, null, 6, null, null, 8}
        };
    }
}
