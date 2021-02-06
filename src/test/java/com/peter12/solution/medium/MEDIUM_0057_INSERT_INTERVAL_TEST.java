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
public class MEDIUM_0057_INSERT_INTERVAL_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0057_INSERT_INTERVAL_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0057_INSERT_INTERVAL_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		int[][]data = new int[0][];
		
		int[] newInterval = new int[] { 5, 7 };
		
		int[][] ans = new int[1][];
		ans[0] = new int[] {5 ,7};
		
		int[][] result = MEDIUM_0057_INSERT_INTERVAL.insert(data, newInterval);
		
		Assert.assertTrue( Util.equalsForArray(ans, result));
		//
		data = new int[1][];
		data[0] = new int[] { 1, 5};
		newInterval = new int[] { 2, 3 };
		
		ans = new int[1][];
		ans[0] = new int[] {1, 5};
		
		result = MEDIUM_0057_INSERT_INTERVAL.insert(data, newInterval);
		
		Assert.assertTrue( Util.equalsForArray(ans, result));
		
		
		//
		data = new int[5][];
		data[0] = new int[] { 1, 2};
		data[1] = new int[] { 3, 5};
		data[2] = new int[] { 6, 7};
		data[3] = new int[] { 8, 10};
		data[4] = new int[] { 12, 16};
		newInterval = new int[] { 4, 8 };
		
		ans = new int[3][];
		ans[0] = new int[] {1, 2};
		ans[1] = new int[] {3, 10};
		ans[2] = new int[] {12, 16};
		
		result = MEDIUM_0057_INSERT_INTERVAL.insert(data, newInterval);
		
		Assert.assertTrue( Util.equalsForArray(ans, result));
		
		
	}


}
