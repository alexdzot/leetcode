package com.leetcode.problems.p268;
/**
 * 268. Missing Number
 *
 * @see - https://leetcode.com/problems/missing-number/description/
 *
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 *
 * Example 1:
 *
 * Input: [3,0,1]
 * Output: 2
 * Example 2:
 *
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 * */
public class Solution {

    public int missingNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0] > 0 ? 0 : 1;
        }

        int max = 0;
        int sum = 0;
        boolean isZeroPresent = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }

            if (nums[i] == 0) {
                isZeroPresent = true;
            }

            sum += nums[i];
        }

        if (!isZeroPresent) {
            return 0;
        }

        int expectedSum = 0;
        for (int i = 0; i <= max; i++) {
            expectedSum += i;
        }

        return (expectedSum - sum) == 0 ? max + 1 : (expectedSum - sum);
    }
}
