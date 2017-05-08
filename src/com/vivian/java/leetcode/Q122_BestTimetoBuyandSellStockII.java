package com.vivian.java.leetcode;

/**
 * Say you have an array for which the ith element is the price of a given stock
 * on day i.
 * 
 * Design an algorithm to find the maximum profit. You may complete as many
 * transactions as you like (ie, buy one and sell one share of the stock
 * multiple times). However, you may not engage in multiple transactions at the
 * same time (ie, you must sell the stock before you buy again).
 */
public class Q122_BestTimetoBuyandSellStockII {
    public int bestTimetoBuyandSellStockII(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int total_earn = 0;
        int buy = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[buy] > nums[i]) {
                buy = i;
            } else {
                total_earn += nums[i] - nums[buy];
                buy = i;
            }
        }
        return total_earn;
    }

}
