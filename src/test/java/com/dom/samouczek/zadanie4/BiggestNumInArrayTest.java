package com.dom.samouczek.zadanie4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BiggestNumInArrayTest {

    BiggestNumInArray biggestNumInArray = new BiggestNumInArray();

    @Test
    public void shouldShowBiggestNumberInArray(){
        int[] table = new int[5];
        table[0] = 5;
        table[1] = 23;
        table[2] = 12;
        table[3] = 55;
        table[4] = 11;

        Assert.assertEquals(55, biggestNumInArray.biggest(table));

    }

}