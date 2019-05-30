package com.vivian.java.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Q28_strStr. In eclipse, you can right click this file, and run
 * as JUnit Test.
 */
public class Q414_ThirdMaximumNumberTest {
	private Q414_ThirdMaximumNumber solution = new Q414_ThirdMaximumNumber();

	@Test
	public void test() {
		Assert.assertEquals(1, solution.thirdMaximumNumber(new int[] { 1, 0, 3, 4 }));
		Assert.assertEquals(0, solution.thirdMaximumNumber(new int[] { 0, 1, 3 }));
		Assert.assertEquals(1, solution.thirdMaximumNumber(new int[] { 2, 2, 3, 1 }));
		Assert.assertEquals(2, solution.thirdMaximumNumber(new int[] { 1, 2 }));
		Assert.assertEquals(1, solution.thirdMaximumNumber(new int[] { 1 }));
	}

}
