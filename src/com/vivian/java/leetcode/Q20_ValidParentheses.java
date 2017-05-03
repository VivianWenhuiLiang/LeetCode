package com.vivian.java.leetcode;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid
 * but "(]" and "([)]" are not.
 */
public class Q20_ValidParentheses {
    public boolean validParentheses(String str) {
        if (str == null) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(')');
                continue;
            } else if (c == '[') {
                stack.push(']');
                continue;
            } else if (c == '{') {
                stack.push('}');
                continue;
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

}
