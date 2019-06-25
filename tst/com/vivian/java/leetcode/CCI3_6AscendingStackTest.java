package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;
import com.vivian.java.collections.Stack;

public class CCI3_6AscendingStackTest {
    private CCI3_6AscendingStack solution = new CCI3_6AscendingStack();
    Stack<Integer> actual = new Stack<>();
    Stack<Integer> expected = new Stack<>();
    Stack<Integer> r;
  
    @Test
    public void test() {
        actual.push(2);
        actual.push(4);
        actual.push(1);
        actual.push(5);
        actual.push(3);

        expected.push(1);
        expected.push(2);
        expected.push(3);
        expected.push(4);
        expected.push(5);
        Assert.assertEquals(actual.size(),expected.size());

        r=solution.ascendingStack(actual);
        while(!expected.isEmpty()){
            Assert.assertEquals(expected.pop(), r.pop());
        }   
    }
}