package com.vivian.java.leetcode;

/**
 * Given an arbitrary ransom note string and another string containing letters
 * from all the magazines, write a function that will return true if the ransom
 * note can be constructed from the magazines; otherwise, it will return false.
 * 
 * Each letter in the magazine string can only be used once in your ransom note.
 * 
 * Note: You may assume that both strings contain only lowercase letters.
 * 
 * canConstruct("a", "b") -> false canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 */
public class Q383_RansomNote {
    public boolean ransonNote(String mag, String str) {
        if (mag == null || str == null) {
            return false;
        }
        if (mag.length() > str.length()) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < str.length() - mag.length(); i++) {
            if (match(str, i, mag)) {
                count++;
            }
        }
        return (count == 1);
    }

    public boolean match(String str, int start, String mag) {
        for (int i = 0; i < mag.length(); i++) {
            if (str.charAt(i + start) != mag.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}
