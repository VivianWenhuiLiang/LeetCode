package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q122_BestTimetoBuyandSellStockIITest {
    private Q122_BestTimetoBuyandSellStockII solution = new Q122_BestTimetoBuyandSellStockII();

    @Test
    public void test() {
        Assert.assertEquals(7, solution.bestTimetoBuyandSellStockII(new int[] { 7, 1, 5, 3, 6, 4 }));
        Assert.assertEquals(0, solution.bestTimetoBuyandSellStockII(new int[] { 7, 6, 4, 3, 1 }));
        Assert.assertEquals(6, solution.bestTimetoBuyandSellStockII(new int[] { 1, 2, 3, 4, 5, 6, 7 }));
        Assert.assertEquals(9, solution.bestTimetoBuyandSellStockII(new int[] { 1, 2, 1, 4, 8, 6, 7 }));

    }
}
