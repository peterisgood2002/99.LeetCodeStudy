package com.peter12.solution.medium;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.ListNode;
import com.peter12.solution.data.TreeNode;
import com.peter12.solution.data.TreeNodeData;
import com.peter12.solution.easy.EASY_0020_VALID_PARENTHESES;
import com.peter12.solution.util.ResultCheck;
import com.peter12.solution.util.Util;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class MEDIUM_0080_REMOVE_DUPLICATES_FROM_SORTED_ARRAY_II_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0080_REMOVE_DUPLICATES_FROM_SORTED_ARRAY_II_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0080_REMOVE_DUPLICATES_FROM_SORTED_ARRAY_II_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {
		
		int[] nums = new int[] {1, 1, 1, 2, 2, 3 };
		Assert.assertEquals(5, MEDIUM_0080_REMOVE_DUPLICATES_FROM_SORTED_ARRAY_II.removeDuplicates(nums) );
		
		nums = new int[] {0, 0, 1, 1, 1, 1, 2, 3, 3};
		Assert.assertEquals(7, MEDIUM_0080_REMOVE_DUPLICATES_FROM_SORTED_ARRAY_II.removeDuplicates(nums) );
		
		
	}


}
