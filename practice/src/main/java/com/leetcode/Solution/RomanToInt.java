package com.leetcode.Solution;

import java.util.Map;

public class RomanToInt {

    /*
     * Convert string to int when string is a roman numeral
     * 
     * Rules:
     * 1. String as roman numeral is valid
     * 2.
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     * 
     * Notes
     * Since we can always assume the roman numeral is valid, we can take some
     * liberties here and can always assume that the current token, if less than the
     * next token, will always follow one of the rules as part of rule 2.
     * 
     * First need to split string and loop through the resulting array.
     * 
     * Will need to check for valid pairs of characters based on the rules above,
     * and iterate based on result. For example, you cannot do XIVX and interpret
     * 'VX' since 'V' would be used by 'IV'.
     * 
     * Need more control of the loop since I may be skipping places in the array
     * based on result, so use while loop.
     * 
     * Will also need a map for the character to int mapping.
     */

    public int romanToInt(String s) {
        Map<Character, Integer> charToInt = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        int result = 0;
        char[] split = s.toCharArray();

        int i = 0;
        while (i < split.length) {
            if (i + 1 >= split.length) {
                result += charToInt.get(split[i]);
                break;
            }

            if (charToInt.get(split[i]) < charToInt.get(split[i + 1])) {
                result += charToInt.get(split[i + 1]) - charToInt.get(split[i]);
                i += 2;
            } else {
                result += charToInt.get(split[i]);
                i++;
            }
        }

        return result;
    }
}
