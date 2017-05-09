package com.vivian.java.leetcode;

/**
 * Given numRows, generate the first numRows of Pascal's triangle.
 * 
 * For example, given numRows = 5, Return
 * 
 * <pre>
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 * </pre>
 */
public class Q118_PascalsTriangle {
    public int[][] pascalsTriangle(int n) {
        int[][] nums = new int[n][];// 此时只创建了第一维数组长度，二位数组没行长度不同（只有Java允许）
        for (int i = 0; i < n; i++) {
            nums[i] = new int[i + 1];
            nums[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    nums[i][j] = 1;
                } else {
                    nums[i][j] = nums[i - 1][j - 1] + nums[i - 1][j];
                }
            }

        }
        return nums;

    }

}
