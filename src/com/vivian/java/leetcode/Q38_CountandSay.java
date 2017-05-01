package com.vivian.java.leetcode;

/**
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 * 
 * 1 is read off as "one 1" or 11. 11 is read off as "two 1s" or 21. 21 is read
 * off as "one 2, then one 1" or 1211.
 * 
 * Given an integer n, generate the nth sequence.
 */
public class Q38_CountandSay {
    public StringBuilder countandSay(int k) {
        StringBuilder sb = new StringBuilder(String.valueOf(1));
        for (int i = 0; i < k; i++) {
            sb = countSay(sb);
        }
        return sb;
    }

    public StringBuilder countSay(StringBuilder sb) {
        int count = 1;
        StringBuilder reset = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (i == sb.length() - 1) {
                reset.append(String.valueOf(count));
                reset.append(sb.charAt(i));
                return reset;
            } else if (sb.charAt(i) == sb.charAt(i + 1)) {
                count += 1;
            } else {
                reset.append(String.valueOf(count));
                reset.append(sb.charAt(i));
                count = 1;
            }

        }
        return reset;
    }

}
