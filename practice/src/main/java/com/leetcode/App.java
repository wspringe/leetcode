package com.leetcode;

public class App {
    public static void main(String[] args) {
    }

    public int numJewelsInStones(String jewels, String stones) {
        int numJewels = -1;

        for (char jewel : jewels.toCharArray()) {
            for (char stone : stones.toCharArray()) {
                if (jewel == stone) {
                    numJewels++;
                }
            }
        }

        return numJewels;
    }
}
