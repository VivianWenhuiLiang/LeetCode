package com.vivian.java.leetcode;

/**
 * Given a word, you need to judge whether the usage of capitals in it is right
 * or not.
 * 
 * We define the usage of capitals in a word to be right when one of the
 * following cases holds:
 * 
 * All letters in this word are capitals, like "USA". All letters in this word
 * are not capitals, like "leetcode". Only the first letter in this word is
 * capital if it has more than one letter, like "Google".
 * 
 * Otherwise, we define that this word doesn't use capitals in a right way.
 * 
 * Example 1:
 * 
 * Input: "USA" Output: True
 * 
 * Example 2:
 * 
 * Input: "FlaG" Output: False
 */
public class Q520_DetectCapital {
    public boolean detectCapital(String str) {
        boolean c = isCapital(str.charAt(0));
        for (int i = 0; i < str.length(); i++) {
            if (c == true && !isCapital(str.charAt(i))) {
                if (i == 1) {
                    c = false;
                    continue;
                } else {
                    return false;
                }
            }
            if (c == false && isCapital(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    boolean isCapital(char c) {
        return ('Z' >= c && c >= 'A');
    }
}
