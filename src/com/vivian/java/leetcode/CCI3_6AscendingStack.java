package com.vivian.java.leetcode;
import com.vivian.java.collections.Stack;
/* Write a program to sort a stack in ascending order(with biggest items on top).
You may use at most one additional stack to hold items,
but you may not copy the elements into any other data structure.
Tht stack supports  supports the following operations:push,pop,peek,and isEmpty.

claritification: should be the bottom of stack holds the minimum value?(yes)
                 bottom->top: 12345
                 use one additional stack
approach: when support stack isEmpty,it can push element original stack pop
         need two while loop ,outer while for original stack pop,support stack push
         inner while for support stack pop back to origin stack until support stack peek() less then outer pop() elemen

complexity :runtime complexity o(n^2)
            memory complexity o(n)

*/
public class CCI3_6AscendingStack {
    public Stack<Integer> ascendingStack(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();
        int hold;
        while(!stack.isEmpty()) {
            hold = stack.pop();
            while(!temp.isEmpty() && temp.peek() > hold) {
                stack.push(temp.pop());
            }
            temp.push(hold);
        }
        return temp;
    }
}