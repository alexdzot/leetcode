package com.leetcode.problems.p832;

/**
 * 832. Flipping an Image
 *
 * @see - https://leetcode.com/problems/flipping-an-image/description/
 *
 * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
 *
 * To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
 *
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].
 *
 * Example 1:
 *
 * Input: [[1,1,0],[1,0,1],[0,0,0]]
 * Output: [[1,0,0],[0,1,0],[1,1,1]]
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
 * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 * Example 2:
 *
 * Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
 * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Notes:
 *
 * 1 <= A.length = A[0].length <= 20
 * 0 <= A[i][j] <= 1
 * */
public class Solution {

    public int[][] flipAndInvertImage(int[][] A) {
        if (A.length < 1) {
            return A;
        }

        int i = 0, j = A.length - 1;
        while (true) {
            if (i == j) {
                invertArray(reverseArray(A[i]));
                break;
            } else {
                invertArray(reverseArray(A[i]));
                invertArray(reverseArray(A[j]));
                if (j - i == 1) {
                    break;
                }
            }
            i++;
            j--;
        }
        return A;
    }

    private int[] invertArray(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                A[i] = 1;
            } else {
                A[i] = 0;
            }
        }
        return A;
    }

    private int[] reverseArray(int[] A) {
        if (A.length == 0) {
            return A;
        }

        int i = 0, j = A.length - 1;
        while (i < j) {
            swap(A, i, j);
            i++;
            j--;
        }
        return A;
    }

    private int[] swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
        return A;
    }
}
