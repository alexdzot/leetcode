package com.leetcode.problems.p283;

/**
 * 283. Move zeroes
 *
 * @see - https://leetcode.com/problems/move-zeroes/
 *
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Example:
 *
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Note:
 *
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 * */
public class Solution {

    public void moveZeroes(int[] nums) {
        for (int i = 0, zeroesCount = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroesCount++;
            }
            else {
                if (zeroesCount > 0) {
                    nums[i - zeroesCount] = nums[i];
                    nums[i] = 0;
                }
            }
        }
    }
}
