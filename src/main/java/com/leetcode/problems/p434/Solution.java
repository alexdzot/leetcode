package com.leetcode.problems.p434;

/**
 * 434. Number of Segments in a String
 *
 * @see <a href="https://leetcode.com/problems/number-of-segments-in-a-string/">434. Number of Segments in a String</a>
 *
 * <p/>
 * Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.
 *
 * Please note that the string does not contain any non-printable characters.
 *
 * Example:
 *
 * Input: "Hello, my name is John"
 * Output: 5
 * */
public class Solution {

    public int countSegments(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        String[] segments = s.split(" ");

        int result = 0;
        for (String seg : segments) {
            if (!seg.trim().isEmpty()) {
                result++;
            }
        }
        return result;
    }
}
