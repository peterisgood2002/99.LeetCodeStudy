package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.ListNode;
import com.peter12.solution.data.ListNodeData;
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
public class EASY_0448_FIND_ALL_NUMBERS_DISAPPEARED_IN_AN_ARRAY_TEST 
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public EASY_0448_FIND_ALL_NUMBERS_DISAPPEARED_IN_AN_ARRAY_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( EASY_0448_FIND_ALL_NUMBERS_DISAPPEARED_IN_AN_ARRAY_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		int[] nums = new int[] {4, 3, 2, 7, 8, 2, 3, 1};
		List<Integer> result = EASY_0448_FIND_ALL_NUMBERS_DISAPPEARED_IN_AN_ARRAY.findDisappearedNumbers(nums);

		Assert.assertEquals(2, result.size() );

		nums = new int[] {2 ,2 };
		result = EASY_0448_FIND_ALL_NUMBERS_DISAPPEARED_IN_AN_ARRAY.findDisappearedNumbers(nums);
		Assert.assertTrue(1 == result.get(0) );


	}



}
