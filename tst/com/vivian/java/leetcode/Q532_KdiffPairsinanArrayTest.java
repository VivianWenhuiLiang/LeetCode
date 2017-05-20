package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q532_KdiffPairsinanArrayTest {
	private Q532_KdiffPairsinanArray solution = new Q532_KdiffPairsinanArray();

	@Test
	public void test() {
		Assert.assertEquals(2, solution.kDiffPairsInAnArray(new int[] { 3, 1, 4, 1, 5 }, 2));
		Assert.assertEquals(4, solution.kDiffPairsInAnArray(new int[] { 1, 2, 3, 4, 5 }, 1));
		Assert.assertEquals(1, solution.kDiffPairsInAnArray(new int[] { 1, 3, 1, 5, 4 }, 0));
		Assert.assertEquals(1, solution.kDiffPairsInAnArray(new int[] { 3, 3, 3, 3, 3 }, 0));
		Assert.assertEquals(1, solution.kDiffPairsInAnArray(new int[] { 1, 3, 1, 3, 1 }, 2));
	}
}
