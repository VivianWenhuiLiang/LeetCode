package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q167_TwoSumIITest {
	private Q167_TwoSumII solution = new Q167_TwoSumII();

	@Test
	public void test() {
		Assert.assertArrayEquals(new int[] { 1, 2 }, solution.twoSumII(new int[] { 2, 7, 11, 15 }, 9));
		Assert.assertArrayEquals(new int[] { 2, 3 }, solution.twoSumII(new int[] { 2, 7, 11, 15 }, 18));
	}
}
