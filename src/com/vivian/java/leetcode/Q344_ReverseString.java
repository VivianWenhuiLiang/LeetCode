package com.vivian.java.leetcode;

/**
 * Write a function that takes a string as input and returns the string
 * reversed.
 * 
 * Example: Given s = "hello", return "olleh".
 */
public class Q344_ReverseString {
    public String reverseString(String str) {
        if (str.isEmpty()||str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0, j = sb.length() - 1; i < j; i++, j--) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
        }
        return sb.toString();
    }

}
