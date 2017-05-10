package com.vivian.java.leetcode;

/**
 * Say you have an array for which the ith element is the price of a given stock
 * on day i.
 * 
 * If you were only permitted to complete at most one transaction (ie, buy one
 * and sell one share of the stock), design an algorithm to find the maximum
 * profit.
 * 
 * Example 1:
 * 
 * <pre>
 * Input: [7, 1, 5, 3, 6, 4]
 * Output: 5
 * </pre>
 * 
 * max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger
 * than buying price)
 * 
 * Example 2:
 * 
 * <pre>
 * Input: [7, 6, 4, 3, 1]
 * Output: 0
 * </pre>
 * 
 * In this case, no transaction is done, i.e. max profit = 0.
 */
public class Q121_BestTimetoBuyandSellStock {
    public int bestTimetoBuyandSellStock(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max_profit = 0;
        int lowest = 0;
        int higgest = nums.length - 1;
        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            if (nums[lowest] > nums[i]) {
                lowest = i;
            }
            if (nums[higgest] < nums[j]) {
                higgest = j;
            }
            if (nums[higgest] - nums[lowest] > max_profit) {
                max_profit = nums[higgest] - nums[lowest];
            }
        }
        return max_profit;
    }

}
