package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;
import com.vivian.java.collections.Stack;

public class CCI3_4HanoiTest {
    private CCI3_4Hanoi solution = new CCI3_4Hanoi();
    Stack<Integer> A = new Stack<>();
    Stack<Integer> B = new Stack<>();
    Stack<Integer> C = new Stack<>();

    Stack<Integer> result=new Stack<>();


    @Test
    public void test() {
        A.push(5);
        A.push(4);
        A.push(3);
        A.push(2);
        A.push(1);
        result.push(5);
        result.push(4);
        result.push(3);
        result.push(2);
        result.push(1);
        solution.hanoiStack(A,B,C);
        Assert.assertEquals(true, A.isEmpty());
        Assert.assertEquals(true, B.isEmpty());
        Assert.assertEquals(5, C.size());
        while(!result.isEmpty()){
            Assert.assertEquals(result.pop(), C.pop());
        }
    }
}