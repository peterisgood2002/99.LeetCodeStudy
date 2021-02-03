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
public class MEDIUM_0033_SEARCH_IN_ROTATED_SORTED_ARRAY_TEST 
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0033_SEARCH_IN_ROTATED_SORTED_ARRAY_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0033_SEARCH_IN_ROTATED_SORTED_ARRAY_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		int[] nums = new int[] {1, 3};
		Assert.assertEquals(-1, MEDIUM_0033_SEARCH_IN_ROTATED_SORTED_ARRAY.search(nums, 0));
		
		nums = new int[] {4, 5, 6, 7, 0, 1, 2};
		Assert.assertEquals(4, MEDIUM_0033_SEARCH_IN_ROTATED_SORTED_ARRAY.search(nums, 0));
		
		Assert.assertEquals(-1, MEDIUM_0033_SEARCH_IN_ROTATED_SORTED_ARRAY.search(nums, 3));
	}

	public void check(int[] nums, int[] ans) {
		for( int i = 0; i < nums.length; i++ ) {
			Assert.assertEquals(ans[i], nums[i]);
		}
	}




}
