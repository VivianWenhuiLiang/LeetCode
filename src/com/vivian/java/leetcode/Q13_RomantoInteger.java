package com.vivian.java.leetcode;

/**
 * Given a roman string, convert it to an integer.
 * 
 * Input is guaranteed to be within the range from 1 to 3999.
 */
public class Q13_RomantoInteger {
    // 右加左减
    public int romanToInteger(String str) {
        int current;
        int pervious = 0;
        int sum = 0;
        if (str.isEmpty() || str == null) {
            return -1;
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            current = romanNumber(str.charAt(i));
            if (i == str.length() - 1) {
                sum = sum + current;
            } else {
                if (current >= pervious) {
                    sum = current + sum;
                } else {
                    sum = sum - current;
                }
            }
            pervious = current;

        }
        return sum;
    }

    // 罗马数字共有7个，即Ⅰ（1）、Ⅴ（5）、Ⅹ（10）、Ⅼ（50）、Ⅽ（100）、Ⅾ（500）和Ⅿ（1000）
    public int romanNumber(char c) {
        int num = 0;
        switch (c) {
        case 'I':
            num = 1;
            break;
        case 'V':
            num = 5;
            break;
        case 'X':
            num = 10;
            break;
        case 'L':
            num = 50;
            break;
        case 'C':
            num = 100;
            break;
        case 'D':
            num = 500;
            break;
        case 'M':
            num = 1000;
            break;
        }
        return num;
    }
}
