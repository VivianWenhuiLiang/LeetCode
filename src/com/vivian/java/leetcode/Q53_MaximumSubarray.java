package com.vivian.java.leetcode;

/**
 * Find the contiguous subarray within an array (containing at least one number)
 * which has the largest sum.
 * 
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4], the contiguous subarray
 * [4,-1,2,1] has the largest sum = 6.
 * 
 * click to show more practice. More practice:
 * 
 * If you have figured out the O(n) solution, try coding another solution using
 * the divide and conquer approach, which is more subtle.
 */
public class Q53_MaximumSubarray {
    public int maximumSubarray(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int max = arr[0];
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (sum < 0) {
                sum = sum > arr[i] ? sum : arr[i];
                
            } // pass all the negative until find the first positive and pass
              // the value to sum
              // or select the biggest one in negative
            else {
                max = Math.max((Math.max(sum, arr[i])), max);// record the
                                                             // biggest positive
                                                             // number
                sum = sum + arr[i];// find the positive one and begin to add up
                                   // the next
            }
            max = Math.max(sum, max);
        }
        return max;
    }
}
