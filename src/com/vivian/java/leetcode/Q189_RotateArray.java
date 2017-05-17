package com.vivian.java.leetcode;

/**
 * Rotate an array of n elements to the right by k steps.
 * 
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to
 * [5,6,7,1,2,3,4].
 */
public class Q189_RotateArray {
    public int[] rotateArray(int[] nums, int k) {
        if (k == 0) {
            return nums;
        }
        k = k % nums.length;
        reverse(nums, 0, nums.length);
        reverse(nums, 0, k);
        reverse(nums, k, nums.length);
        return nums;
    }

    public void reverse(int[] nums, int start, int end) {
        for (int i = start, j = end - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
