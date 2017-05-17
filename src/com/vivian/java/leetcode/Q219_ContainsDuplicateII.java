package com.vivian.java.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers and an integer k, find out whether there are two
 * distinct indices i and j in the array such that nums[i] = nums[j] and the
 * absolute difference between i and j is at most k.
 */
public class Q219_ContainsDuplicateII {
    public boolean containDuplicateII(int[] nums, int k) {
        if (nums == null || nums.length <= 1 || k <= 0) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) == k) {
                    return true;
                }
                return false;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
