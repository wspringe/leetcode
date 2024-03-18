package com.leetcode.Solution;

import java.util.Stack;
/*
 * @lc app=leetcode id=733 lang=java
 *
 * [733] Flood Fill
 * First thought is to use recursion to solve this. For each "pixel" there will be at most 4 directions to go, so we may have to call the method four times. However, we need to constrain this if it hits the edges or if an edge is not a pixel we want to change.
 * For the constraints, the m does not have to equal n, but m and n are consistent lengths in the image.
 * We'll want to first get the current pixel color, and check if it's the color we want. If it is, return. If not, change the color and check for related nodes that share the same color as the current one. Then, change those nodes until no nodes are left to change.
 * We also want to only modify references here, since we need to return a modified image.
 * Note: this is basically what old screens did in order to decide the pixel and color to light up
 */

// @lc code=start
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int currentColor = image[sr][sc];
        if (currentColor != color) {
            image[sr][sc] = color;
        } else {
            return image;
        }

        int xMax = image.length - 1;
        int yMax = image[sr].length - 1;
        if (sr != 0 && image[sr - 1][sc] == currentColor) {
            floodFill(image, sr - 1, sc, color);
        }
        if (sr < xMax && image[sr + 1][sc] == currentColor) {
            floodFill(image, sr + 1, sc, color);
        }
        if (sc != 0 && image[sr][sc - 1] == currentColor) {
            floodFill(image, sr, sc - 1, color);
        }
        if (sc < yMax && image[sr][sc + 1] == currentColor) {
            floodFill(image, sr, sc + 1, color);
        }
        return image;
    }
}
// @lc code=end
