package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;
import com.vivian.java.collections.Stack;

public class CCI3_6AscendingStackTest {
    private CCI3_6AscendingStack solution = new CCI3_6AscendingStack();
    Stack<Integer> origin = new Stack<>();
    Stack<Integer> result = new Stack<>();
    Stack<Integer> r;
  
    @Test
    public void test() {
        origin.push(2);
        origin.push(4);
        origin.push(1);
        origin.push(5);
        origin.push(3);

        result.push(1);
        result.push(2);
        result.push(3);
        result.push(4);
        result.push(5);

        r=solution.ascendingStack(origin);
        while(!result.isEmpty()){
            Assert.assertEquals(result.pop(), r.pop());
        }   
    }
}