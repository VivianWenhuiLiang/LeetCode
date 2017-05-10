package com.vivian.java.leetcode;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as
 * one sorted array.
 * 
 * Note: You may assume that nums1 has enough space (size that is greater or
 * equal to m + n) to hold additional elements from nums2. The number of
 * elements initialized in nums1 and nums2 are m and n respectively.
 */
public class Q88_MergeSortedArray {
    public int[] mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n - 1;
        int j, i;
        for (i = m - 1, j = n - 1; i >= 0 && j >= 0;) {
            nums1[length] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
            length--;
        }
        while (j >= 0) {
            nums1[length--] = nums2[j--];
        }
        return nums1;

    }

}
