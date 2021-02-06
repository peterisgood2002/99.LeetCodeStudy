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
public class MEDIUM_0063_UNIQUE_PATHS_II_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0063_UNIQUE_PATHS_II_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0063_UNIQUE_PATHS_II_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		
		int[][] nums = new int[1][];
		nums[0] = new int[] { 1, 0 };
		
		
		Assert.assertEquals(0, MEDIUM_0063_UNIQUE_PATHS_II.uniquePathsWithObstacles(nums));
		
		nums = new int[5][];
		nums[0] = new int[] { 0, 0, 0, 0 };
		nums[1] = new int[] { 0, 1, 0, 0 };
		nums[2] = new int[] { 0, 0, 0, 0 };
		nums[3] = new int[] { 0, 0, 1, 0 };
		nums[4] = new int[] { 0, 0, 0, 0 };
		
		Assert.assertEquals(7, MEDIUM_0063_UNIQUE_PATHS_II.uniquePathsWithObstacles(nums));
		
		
		 nums = new int[1][];
		nums[0] = new int[] { 0, 1 };
		
		
		Assert.assertEquals(0, MEDIUM_0063_UNIQUE_PATHS_II.uniquePathsWithObstacles(nums));
		
		 nums = new int[3][];
		nums[0] = new int[] { 0, 0 ,0 };
		nums[1] = new int[] { 0, 1 ,0 };
		nums[2] = new int[] { 0, 0, 0 };
		
		Assert.assertEquals(2, MEDIUM_0063_UNIQUE_PATHS_II.uniquePathsWithObstacles(nums));
		
		
	}


}
