package com.vivian.java.leetcode;

/**
 * Given a binary array, find the maximum number of consecutive 1s in this
 * array.
 * 
 * <pre>
 * Example 1: 
 * Input: [1,1,0,1,1,1] 
 * Output: 3 
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 * The maximum number of consecutive 1s is 3.
 * </pre>
 * 
 * Note: The input array will only contain 0 and 1. The length of input array is
 * a positive integer and will not exceed 10,000
 */
public class Q485_MaxConsecutiveOnes {
	public int maxConsecutiveOnes(int nums[]) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		int count = 0;
		int maxOnes = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				maxOnes = Math.max(count, maxOnes);
				count = 0;
			} else {
				count++;
				maxOnes = Math.max(count, maxOnes);
			}
		}
		return maxOnes;
	}

}
