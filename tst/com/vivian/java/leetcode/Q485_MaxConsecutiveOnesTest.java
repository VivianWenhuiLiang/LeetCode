package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q485_MaxConsecutiveOnesTest {
	private Q485_MaxConsecutiveOnes solution = new Q485_MaxConsecutiveOnes();

	@Test
	public void test() {
		Assert.assertEquals(3, solution.maxConsecutiveOnes(new int[] { 1, 1, 0, 1, 1, 1 }));
		Assert.assertEquals(2, solution.maxConsecutiveOnes(new int[] { 0, 1, 1 }));
		Assert.assertEquals(4, solution.maxConsecutiveOnes(new int[] { 1, 1, 1, 1 }));
		Assert.assertEquals(0, solution.maxConsecutiveOnes(new int[] { 0, 0, 0, 0 }));
	}

}
