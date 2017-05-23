package com.vivian.java.leetcode;

import java.util.Arrays;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find
 * the one that is missing from the array.
 * 
 * For example, Given nums = [0, 1, 3] return 2.
 */
public class Q268_MissingNumber {
	public int missingNumer(int nums[]) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (i != nums[i]) {
				return i;
			}
		}
		return -1;
	}

}
