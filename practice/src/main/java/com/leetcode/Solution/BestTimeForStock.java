package com.leetcode.Solution;

public class BestTimeForStock {
    /*
     * You are given an array prices where prices[i] is the price of a given stock
     * on the ith day.
     * 
     * You want to maximize your profit by choosing a single day to buy one stock
     * and choosing a different day in the future to sell that stock.
     * 
     * Return the maximum profit you can achieve from this transaction. If you
     * cannot achieve any profit, return 0.
     * 
     * Notes
     * Elements in the given array are i = price on the ith day.
     * Brute force route would be to loop through the array i times and get the ith
     * element and subtract it from i + 1 to i.length elements and save the largest
     * positive difference. I believe this would be O(2^n), which is very bad.
     * 
     * Since I need to do it in one loop, I can start with checking for the minimum
     * price in each iteration and compare the current loop value with the min
     * price, and find the greatest different for the max profit.
     * 
     * 
     */

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }

}
