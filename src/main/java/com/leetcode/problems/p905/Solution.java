package com.leetcode.problems.p905;
/**
 * 905. Sort Array By Parity
 *
 * @see  - https://leetcode.com/problems/sort-array-by-parity/description/
 *
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
 * You may return any answer array that satisfies this condition.
 *
 * Example 1:
 *
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 *
 * Note:
 *  1. 1 <= A.length <= 5000
 *  2. 0 <= A[i] <= 5000
 * */
public class Solution {

    public int[] sortArrayByParity(int[] A) {
        if (A.length == 1) {
            return A;
        }

        for (int i = 0, evenPos = 0; i < A.length; i++) {
            int el = A[i];
            if (isEven(el)) {
                if (evenPos != i) {
                    swap(A, i, evenPos);
                }
                evenPos++;
            }
        }

        return A;
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }

    private void swap(int A[], int oddIndex, int evenIndex) {
        int tmp = A[oddIndex];
        A[oddIndex] = A[evenIndex];
        A[evenIndex] = tmp;
    }
}
