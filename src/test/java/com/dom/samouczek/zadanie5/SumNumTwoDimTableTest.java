package com.dom.samouczek.zadanie5;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumNumTwoDimTableTest {

    SumNumTwoDimTable sumNumTwoDimTable = new SumNumTwoDimTable();

    @Test
    public void shouldSumNumbersInTwoDimensionalTable(){
        int[][] table = new int[2][2];
        table[0][0] = 1;
        table[0][1] = 2;
        table[1][0] = 3;
        table[1][1] = 4;

        assertEquals(10, sumNumTwoDimTable.sum(table));


    }

}