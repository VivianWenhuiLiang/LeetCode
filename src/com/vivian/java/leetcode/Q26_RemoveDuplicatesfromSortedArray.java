package com.vivian.java.leetcode;

/**
 * Given a sorted array, remove the duplicates in place such that each element
 * appear only once and return the new length.
 * 
 * Do not allocate extra space for another array, you must do this in place with
 * constant memory.
 * 
 * For example, Given input array nums = [1,1,2],
 * 
 * Your function should return length = 2, with the first two elements of nums
 * being 1 and 2 respectively. It doesn't matter what you leave beyond the new
 * length.
 */
public class Q26_RemoveDuplicatesfromSortedArray {
    public int removeDuplicatesfromSortedArray(int[] nums, int len) {
        if (len == 1) {
            return 1;
        }
        int index = 1;// place may has duplicate and the place which next
                      // unduplicate fit in
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;

    }
}
