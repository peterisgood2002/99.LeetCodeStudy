package com.peter12.solution.medium;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.ListNode;
import com.peter12.solution.data.TreeNode;
import com.peter12.solution.data.TreeNodeData;
import com.peter12.solution.easy.EASY_0020_VALID_PARENTHESES;
import com.peter12.solution.util.Util;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class MEDIUM_0047_PERMUTATIONS_II_TEST 
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0047_PERMUTATIONS_II_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0047_PERMUTATIONS_II_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		int[] nums = new int[] { 1, 1, 2};

		List<List<Integer>> result = MEDIUM_0047_PERMUTATIONS_II.permuteUnique(nums);

		Assert.assertEquals(3, result.size());


		nums = new int[] { 1, 2, 3};

		result = MEDIUM_0046_PERMUTATIONS.permute(nums);

		Assert.assertEquals(6, result.size());
	}


}
