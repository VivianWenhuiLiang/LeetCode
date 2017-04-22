package com.vivian.java.leetcode;

/**
 * Given a string, you need to reverse the order of characters in each word
 * within a sentence while still preserving whitespace and initial word order.
 * 
 * Example 1:
 * 
 * Input: "Let's take LeetCode contest"
 * <p>
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * 
 * Note: In the string, each word is separated by single space and there will
 * not be any extra space in the string.
 */
public class Q557_ReverseWords {
    public StringBuilder reverseAll(String str) {
        int start = 0;
        int end;
        if (str.isEmpty() || str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {
            if (str.charAt(i) == ' ') {
                end = i - 1;
                reverseWords(sb, start, end);
                start = i + 1;
            } else if (i== sb.length() - 1) {
                end = i;
                reverseWords(sb, start, end);
            }
        }
        return sb;
    }

    public StringBuilder reverseWords(StringBuilder st, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            char temp = st.charAt(i);
            st.setCharAt(i, st.charAt(j));
            st.setCharAt(j, temp);
        }
        return st;
    }

    public static void main(String[] args) {
        Q557_ReverseWords rw = new Q557_ReverseWords();
        System.out.println(rw.reverseAll("Let's take LeetCode contest"));

    }
}
