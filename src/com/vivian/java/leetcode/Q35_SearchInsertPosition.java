package com.vivian.java.leetcode;

/**
 * Given a sorted array and a target value, return the index if the target is
 * found. If not, return the index where it would be if it were inserted in
 * order.
 * 
 * You may assume no duplicates in the array.
 * 
 * Here are few examples. <br>
 * [1,3,5,6], 5 → 2 <br>
 * [1,3,5,6], 2 → 1 <br>
 * [1,3,5,6], 7 → 4 <br>
 * [1,3,5,6], 0 → 0 <br>
 */
public class Q35_SearchInsertPosition {
    public int searchInsertPosition(int[] arr, int val) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= val) {
                return i;
            }
        }
        return arr.length;
    }

}
