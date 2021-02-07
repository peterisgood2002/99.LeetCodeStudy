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
public class MEDIUM_0075_SORT_COLORS_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0075_SORT_COLORS_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0075_SORT_COLORS_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {
		
		int[] nums = new int[]{ 1, 2, 0 };
		int[] ans = new int[] {0, 1, 2};
		
		MEDIUM_0075_SORT_COLORS.sortColors(nums);
		
		Assert.assertTrue( ResultCheck.equalsForArray(ans, nums) );
		//
		
		nums = new int[]{ 2, 1, 2 };
		ans = new int[] { 1, 2, 2};
		
		MEDIUM_0075_SORT_COLORS.sortColors(nums);
		
		Assert.assertTrue( ResultCheck.equalsForArray(ans, nums) );
		//
		nums = new int[]{ 2, 0, 1 };
		ans = new int[] {0, 1, 2};
		
		MEDIUM_0075_SORT_COLORS.sortColors(nums);
		
		Assert.assertTrue( ResultCheck.equalsForArray(ans, nums) );
		//
		nums = new int[]{ 2, 0, 2, 1, 1, 0 };
		ans = new int[] {0, 0, 1, 1, 2, 2};
		
		MEDIUM_0075_SORT_COLORS.sortColors(nums);
		
		Assert.assertTrue( ResultCheck.equalsForArray(ans, nums) );
		
	
		
		
		
		
		
		
		
	}


}
