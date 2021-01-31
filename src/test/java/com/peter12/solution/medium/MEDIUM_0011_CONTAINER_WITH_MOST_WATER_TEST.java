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
public class MEDIUM_0011_CONTAINER_WITH_MOST_WATER_TEST 
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0011_CONTAINER_WITH_MOST_WATER_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0011_CONTAINER_WITH_MOST_WATER_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {
		
		int[] height = new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7};
		Assert.assertEquals(49, MEDIUM_0011_CONTAINER_WITH_MOST_WATER.maxArea(height));
		
		height = new int[] {1, 1};
		Assert.assertEquals(1, MEDIUM_0011_CONTAINER_WITH_MOST_WATER.maxArea(height));
		
		height = new int[] {4, 3, 2, 1, 4};
		Assert.assertEquals(16, MEDIUM_0011_CONTAINER_WITH_MOST_WATER.maxArea(height));
		
		height = new int[] {1, 2, 1};
		Assert.assertEquals(2, MEDIUM_0011_CONTAINER_WITH_MOST_WATER.maxArea(height));
	}




}
