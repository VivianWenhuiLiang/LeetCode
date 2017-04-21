package com.vivian.java.leetcode;

/**
 * Implement strStr().
 * 
 * Returns the index of the first occurrence of needle in haystack, or -1 if
 * needle is not part of haystack.
 */
public class Q28_strStr {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                return i;
            }
        }
        return -1;
    }
}
