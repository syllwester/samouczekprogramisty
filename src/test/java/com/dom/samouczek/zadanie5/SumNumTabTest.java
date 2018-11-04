package com.dom.samouczek.zadanie5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumNumTabTest {
    SumNumTab sumNumTab = new SumNumTab();

    @Test
    public void shouldSumNumbersInArray(){
        int[] tab = new int[5];
        tab[0] = 1;
        tab[1] = 2;
        tab[2] = 3;
        tab[3] = 4;
        tab[4] = 5;

        Assert.assertEquals(15, sumNumTab.sum(tab));
    }

}