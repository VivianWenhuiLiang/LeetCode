package com.vivian.java.leetcode;

/**
 * Given an index k, return the kth row of the Pascal's triangle.
 * 
 * For example, given k = 3, Return [1,3,3,1].
 */
public class Q119_PascalsTriangleII {
    public int[] pascalsTriangleII(int k) {
        int[][] nums = new int[k + 1][];// 此时只创建了第一维数组长度，二位数组没行长度不同（只有Java允许）
        for (int i = 0; i < k + 1; i++) {
            nums[i] = new int[i + 1];// 杨辉三角的特殊性，刚好行的长度即i的index
            nums[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                if (j == i) {
                    nums[i][j] = 1;
                } else {
                    nums[i][j] = nums[i - 1][j - 1] + nums[i - 1][j];
                }
            }
        }
        return nums[k];

    }

}
