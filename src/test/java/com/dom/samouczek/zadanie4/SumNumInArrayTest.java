package com.dom.samouczek.zadanie4;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumNumInArrayTest {

    SumNumInArray sumNumInArray = new SumNumInArray();

    @Test
    public void shouldSumNumbersInArray(){
        int[] table = new int[4];

        table[0] = 2;
        table[1] = 4;
        table[2] = 1;
        table[3] = 3;

        assertEquals(10, sumNumInArray.sum(table));
    }

}