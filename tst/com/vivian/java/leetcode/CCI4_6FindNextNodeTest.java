package com.vivian.java.leetcode;
import org.junit.Assert;
import org.junit.Test;


public class CCI4_6FindNextNodeTest {
    CCI4_6FindNextNode solution = new CCI4_6FindNextNode();
    BiDirBiTreeNode<Integer> a = new BiDirBiTreeNode<>(1, null, null, null);
    BiDirBiTreeNode<Integer> b = new BiDirBiTreeNode<>(2, null, a, null);
    BiDirBiTreeNode<Integer> c = new BiDirBiTreeNode<>(3, null, b, null);

    BiDirBiTreeNode<Integer> no3 = new BiDirBiTreeNode<>(3, null, null, null);
    BiDirBiTreeNode<Integer> no2= new BiDirBiTreeNode<>(2, null, null, no3);
    BiDirBiTreeNode<Integer> no4 = new BiDirBiTreeNode<>(4, null, no2, null);
    BiDirBiTreeNode<Integer> no1 = new BiDirBiTreeNode<>(1, null, null, no4);
    BiDirBiTreeNode<Integer> no5 = new BiDirBiTreeNode<>(5, null, no1, null);


    @Test
    public void test() {
        b.setParent(c);
        a.setParent(b);
        Assert.assertEquals(b, solution.findNextNode(a));

        no3.setParent(no2);
        no2.setParent(no4);
        no4.setParent(no1);
        no1.setParent(no5);
        Assert.assertEquals(no5, solution.findNextNode(no4));

    }
}
