package com.vivian.java.leetcode;

/**
 * Given an array of integers that is already sorted in ascending order, find
 * two numbers such that they add up to a specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they
 * add up to the target, where index1 must be less than index2. Please note that
 * your returned answers (both index1 and index2) are not zero-based.
 * 
 * You may assume that each input would have exactly one solution and you may
 * not use the same element twice.
 * 
 * Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
 */
public class Q167_TwoSumII {
	public int[] twoSumII(int nums[], int target) {
		if (nums == null || nums.length < 2) {
			return null;
		}
		int[] result = new int[2];
		for (int i = 0, j = nums.length - 1; i < j;) {
			int sum = nums[i] + nums[j];
			if (sum == target) {
				result[0] = i + 1;
				result[1] = j + 1;
				i++;
				j--;
			} else if (sum > target) {
				j--;
			} else {
				i++;
			}
		}
		return result;
	}
}
