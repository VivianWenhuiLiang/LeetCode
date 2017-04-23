package com.vivian.java.leetcode;

/**
 * Given two binary strings, return their sum (also a binary string).
 * 
 * For example, a = "11" b = "1" Return "100".
 */
public class Q67_AddBinary {
    public String sumOfBinary(String s, String ss) {
        if (s == null || ss == null || (s.isEmpty() && ss.isEmpty())) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = s.length() - 1, j = ss.length() - 1; i >= 0 || j >= 0;) {
            int sum = 0;
            if (i >= 0 && s.charAt(i) == '1') {
                sum++;
            }
            if (j >= 0 && ss.charAt(j) == '1') {
                sum++;
            }
            sum = sum + carry;
            carry = sum >= 2 ? 1 : 0;
            sb.append(digit2char(sum % 2));

            j--;
            i--;
        }
        if (carry == 1) {
            sb.append(digit2char(carry));
        }
        return sb.reverse().toString();
    }

    public char digit2char(int digit) {
        return (char) (digit + '0');
    }
}
