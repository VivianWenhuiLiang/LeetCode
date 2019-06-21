package com.vivian.java.leetcode;
import org.junit.Assert;
import org.junit.Test;


public class CCI4_7FirstCommAscentorTest {
    CCI4_7FirstCommAscentor solution = new CCI4_7FirstCommAscentor();
    BiTreeNode<Integer>n4 = new BiTreeNode<>(4, null, null);
    BiTreeNode<Integer>n5 = new BiTreeNode<>(5, null, null);
    BiTreeNode<Integer>n2 = new BiTreeNode<>(3, n4, n5);
    BiTreeNode<Integer>n3 = new BiTreeNode<>(2, null, null);
    BiTreeNode<Integer>n1 = new BiTreeNode<>(2, n2, n3);


    BiTreeNode<Integer>p = new BiTreeNode<>(4, null, null);
    BiTreeNode<Integer>q = new BiTreeNode<>(5, null, null);
    BiTreeNode<Integer>b = new BiTreeNode<>(3, p, null);
    BiTreeNode<Integer>d = new BiTreeNode<>(2, null, q);
    BiTreeNode<Integer>a = new BiTreeNode<>(1, b, d);

    BiTreeNode<Integer>no4= new BiTreeNode<>(4, null, null);
    BiTreeNode<Integer>no3 = new BiTreeNode<>(5, null, null);
    BiTreeNode<Integer>no2 = new BiTreeNode<>(3, no4, null);
    BiTreeNode<Integer>no1 = new BiTreeNode<>(2, no2, no3);
    
    @Test
    public void test() {
        Assert.assertEquals(n2,solution.comAscentor(n1,n4,n5));
        Assert.assertEquals(a,solution.comAscentor(a,p,q));
        Assert.assertEquals(no2,solution.comAscentor(no1,no2,no4));
    }
}
