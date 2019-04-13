package com.leetcode.problems.p66;


/**
 * 66. Plus One
 *
 * @see - https://leetcode.com/problems/plus-one/
 *
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 *
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Example 2:
 *
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 *
 * */
public class Solution {

    public int[] plusOne(int[] digits) {
        int size = digits.length;
        if (digits[size - 1] < 9) {
            digits[size - 1]++;
            return digits;
        }

        int carry = 0;
        for (int i = size - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                carry++;
                digits[i] = 0;
            } else {
                digits[i] += carry;
                break;
            }

            if (i == 0) {
                int[] res = new int[size + 1];
                res[0] = carry;
                for (int j = 0; j < size; j++) {
                    res[j + 1] = digits[j];
                }
                return res;
            }
        }
        return digits;
    }
}
