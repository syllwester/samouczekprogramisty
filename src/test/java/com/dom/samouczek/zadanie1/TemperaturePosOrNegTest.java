package com.dom.samouczek.zadanie1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TemperaturePosOrNegTest {

    TemperaturePosOrNeg temperature = new TemperaturePosOrNeg();

    @Test
        public void shouldShowTemperatureIsPositive() {
            int temp1 = 5;
            assertTrue(temperature.temperaturePosOrNeg(temp1));
    }

    @Test
        public void shouldShowTemperatureIsNegative()  {
            int temp2 = -4;
            assertFalse(temperature.temperaturePosOrNeg(temp2));
    }

}