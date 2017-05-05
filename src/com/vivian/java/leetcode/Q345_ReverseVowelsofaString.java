package com.vivian.java.leetcode;

/**
 * Write a function that takes a string as input and reverse only the vowels of
 * a string.
 * 
 * Example 1: Given s = "hello", return "holle".
 * 
 * Example 2: Given s = "leetcode", return "leotcede".
 */
public class Q345_ReverseVowelsofaString {
    public String reverseVowelsofaString(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        char right, left;
        char temp;
        for (int i = 0, j = sb.length()-1; i < j;) {
            left = sb.charAt(i);
            right = sb.charAt(j);
            if (isVowel(left) && isVowel(right)) {
                temp = left;
                sb.setCharAt(i, right);
                sb.setCharAt(j, temp);
                i++;
                j--;
            } else if (isVowel(left) && !isVowel(right)) {
                j--;
            } else if (!isVowel(left) && isVowel(right)) {
                i++;
            } else if (!isVowel(left) && !isVowel(right)) {
                i++;
                j--;
            }
        }
        return sb.toString();
    }

    public boolean isVowel(char n) {
        return (n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u');
    }

}
