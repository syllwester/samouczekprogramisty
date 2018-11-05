package com.dom.samouczek.zadanie7;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddAndMultiplicationNumbersTest {

    @Test
    public void shouldAddTwoNumbers(){
        AddNumbers addNumbers = new AddNumbers();
        double num1 = 4;
        double num2 = 5;

        assertEquals(9,addNumbers.compute(num1, num2),0);
    }


    @Test
    public void shouldMultiplicationTwoNumbers(){
        MultiplicationNumbers multi = new MultiplicationNumbers();

        double num1 = 4;
        double num2 = 5;

        assertEquals(20, multi.compute(num1, num2),0);

    }

}