package com.vivian.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-empty string check if it can be constructed by taking a substring
 * of it and appending multiple copies of the substring together. You may assume
 * the given string consists of lowercase English letters only and its length
 * will not exceed 10000.
 * 
 * Example 1:
 * 
 * Input: "abab"
 * 
 * Output: True
 * 
 * Explanation: It's the substring "ab" twice.
 * 
 * Example 2:
 * 
 * Input: "aba"
 * 
 * Output: False
 * 
 * Example 3:
 * 
 * Input: "abcabcabcabc"
 * 
 * Output: True
 * 
 * Explanation: It's the substring "abc" four times. (And the substring "abcabc"
 * twice.)
 */
public class Q459_RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= str.length() / 2; i++) {
            sb.append(str.charAt(i));
            if (consist(str, sb)) {
                return true;
            }
        }
        return false;
    }

    public boolean consist(String str, StringBuilder sb) {
        if (str.length() % sb.length() != 0) {
            return false;
        }
        for (int i = sb.length(); i < str.length(); i += sb.length()) {
            if (!match(str, i, sb)) {
                return false;
            }
        }
        return true;
    }

    public boolean match(String str, int start, StringBuilder sb) {
        for (int i = 0; i < sb.length(); i++) {
            if (str.charAt(i + start) != sb.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
