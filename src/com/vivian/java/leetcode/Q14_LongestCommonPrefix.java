package com.vivian.java.leetcode;

/**
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 */
public class Q14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] arr) {
        StringBuilder sb = new StringBuilder();
        if (arr.length == 0) {
            return null;
        }
        for (int j = 0; j < arr[0].length();) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length() < j) {
                    return sb.toString();
                } else if (arr[0].charAt(j) != arr[i].charAt(j)) {
                  return sb.toString();
                }
            }
            sb.append(arr[0].charAt(j));
            j++;
        }
        return sb.toString();
    }
}
