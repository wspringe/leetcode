package com.leetcode.Solution;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BestTimeForStockTest {

    @Test
    public void itShouldReturnLargestProfit() {
        int[] prices = { 7, 1, 5, 3, 6, 4 };

        BestTimeForStock testObject = new BestTimeForStock();
        int actual = testObject.maxProfit(prices);

        assertEquals(5, actual);
    }

    @Test
    public void itShouldReturn0ForNoProfit() {
        int[] prices = { 7, 6, 4, 3, 1 };

        BestTimeForStock testObject = new BestTimeForStock();
        int actual = testObject.maxProfit(prices);

        assertEquals(0, actual);
    }
}
