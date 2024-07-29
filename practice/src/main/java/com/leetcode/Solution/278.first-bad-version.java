/*
 * @lc app=leetcode id=278 lang=java
 *
 * [278] First Bad Version
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int firstBadVersion = 1;
        int min = 1;
        int max = n;

        if (n == 1) {
            return 1;
        }

        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (isBadVersion(mid)) {
                firstBadVersion = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        return firstBadVersion;
    }
}
// @lc code=end
