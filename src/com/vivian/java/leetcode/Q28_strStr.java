package com.vivian.java.leetcode;

/**
 * Implement strStr().
 * 
 * Returns the index of the first occurrence of needle in haystack, or -1 if
 * needle is not part of haystack.
 */
public class Q28_strStr {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return 0;
        }
        if (haystack.isEmpty() || needle.isEmpty()) {
            return 0;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        } else {
            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
                if (haystack.charAt(i) == needle.charAt(0)) {
                    if (match(haystack, i, needle)) {
                        return i;
                    }
                }
            }
            return -1;
        }
    }

    public boolean match(String haystack, int i, String needle) {
        if (needle.length() > haystack.length() - i) {
            return false;
        }
        for (int k = 0; k < needle.length(); k++) {
            if (haystack.charAt(i + k) != needle.charAt(k)) {
                return false;
            }
        }
        return true;
    }
}
