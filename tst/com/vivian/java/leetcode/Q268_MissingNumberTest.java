package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q268_MissingNumberTest {
	private Q268_MissingNumber solution = new Q268_MissingNumber();

	@Test
	public void test() {
		Assert.assertEquals(2, solution.missingNumer(new int[] { 1, 0, 3, 4 }));
		Assert.assertEquals(2, solution.missingNumer(new int[] { 0, 1, 3 }));
	}
}
