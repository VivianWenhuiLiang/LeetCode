package com.vivian.java.leetcode;
import com.vivian.java.collections.Stack;
/* Hanoi ,you have 3 rods and N disks different sizes which can slide onto any tower.
The puzzle starts with disks sorted in ascending order of size from top to bottom.(each disk sits on top of an even larger one)
Follow constrains:
              1)only one disk can be moved at a time
              2)A disk is slid off the top of one rod onto the next rod
              3)A disk can only be placed on top of a larger disk
              Write a program to move the disks from the first rod to the last using Stacks

claritification: Does the data structure of 3 rods are Stack?(yes)
approach: use Recursive, move ascending numbers from A to C,
          step1: move n-1 numbers to buffer B,
          step2: move the last number to Stack C
          step3: step2 (n-1)-1 numbers to stack A
          continue step 1,2,3
edge case :n<=0 ,then return
           n=1,c.push()
complexity: runtime complexity n^2
            memory complexity 0, inplace reverse

*/

public class CCI3_4Hanoi {
    public void hanoiStack(Stack<Integer> A, Stack<Integer> buffer, Stack<Integer>C) {
        move(A, A.size(), C, buffer);
    }

    public void move (Stack<Integer> a, int n, Stack<Integer> c, Stack<Integer> buffer) {
        if(n <= 0) {
            return;
        }
        if(n == 1) {
            c.push(a.pop());
            return;
        }
        move(a, n - 1, buffer, c);
        move(a, 1, c, buffer);
        move(buffer, n - 1, c, a);
    }
}