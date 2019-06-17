package com.vivian.java.leetcode;

public class Solution {
    public int titleToNumber(String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            num += (s.charAt(s.length() - i - 1) - 'A' + 1) * power(26, i);
        }
        return num;
    }

    private int power(int x, int y) {
        int res = 1;
        while (y-- > 0) {
            res *= x;
        }
        return res;
    }
}