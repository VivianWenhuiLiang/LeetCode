package com.vivian.java.leetcode;

/**
 * Given a non-empty array of integers, return the third maximum number in this
 * array. If it does not exist, return the maximum number. The time complexity
 * must be in O(n).
 * 
 * <pre>
 * Example 1:
 * Input: [3, 2, 1]
 * Output: 1
 * Explanation: The third maximum is 1.
 * 
 * Example 2:
 * Input: [1, 2]
 * Output: 2
 * Explanation: The third maximum does not exist, so the maximum (2) is returned
 * instead.
 * 
 * Example 3:
 * Input: [2, 2, 3, 1]
 * Output: 1
 * Explanation: Note that the third maximum here means the third maximum
 * distinct number. Both numbers with value 2 are both considered as second
 * maximum.
 * </pre>
 */
public class Q414_ThirdMaximumNumber {
	public int thirdMaximumNumber(int nums[]) {
		if (nums == null || nums.length == 0) {
			return 000;
		} else if (nums.length == 1) {
			return nums[0];
		} else if (nums.length == 2) {
			return nums[0] > nums[1] ? nums[0] : nums[1];
		} else {
			Integer first_Max = Integer.MIN_VALUE;
			Integer second_Max = Integer.MIN_VALUE;
			Integer third_Max = Integer.MIN_VALUE;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == first_Max || nums[i] == second_Max || nums[i] == third_Max) {
					continue;
				}
				if (nums[i] > first_Max) {
					third_Max = second_Max;
					second_Max = first_Max;
					first_Max = nums[i];

				} else if (nums[i] > second_Max) {
					third_Max = second_Max;
					second_Max = nums[i];

				} else if (nums[i] > third_Max) {
					third_Max = nums[i];
				}
			}
			return third_Max;
		}
	}

}
