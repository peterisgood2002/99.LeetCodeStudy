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
public class MEDIUM_0015_3SUM_TEST 
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0015_3SUM_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0015_3SUM_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {
		
		int[] nums = new int[] {0, 0, 0};


		List<List<Integer>> result = MEDIUM_0015_3SUM.threeSum(nums);
		Assert.assertEquals(1, result.size() );
		
		nums = new int[] {-1, 0 ,1, 2, -1, -4, -2, -3, 3, 0 ,4};
		result = MEDIUM_0015_3SUM.threeSum(nums);
		Assert.assertEquals(9, result.size() );
		
		nums = new int[] {0, 0};


		result = MEDIUM_0015_3SUM.threeSum(nums);
		Assert.assertEquals(0, result.size() );


		nums = new int[] {-1, 0, 1, 2, -1, -4 };


		result = MEDIUM_0015_3SUM.threeSum(nums);
		Assert.assertEquals(2, result.size() );

	}





}
