package com.leetcode.Solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanToIntTest {

    @Test
    public void itShouldReturnCorrectIntForSimpleRomanInt() {
        String test = "III";

        RomanToInt romanToInt = new RomanToInt();
        int actual = romanToInt.romanToInt(test);

        assertEquals(3, actual);
    }

    @Test
    public void itShouldReturnCorrectIntForComplexRomanInt() {
        String test = "MCMXCIV";

        RomanToInt romanToInt = new RomanToInt();
        int actual = romanToInt.romanToInt(test);

        assertEquals(1994, actual);
    }
}
