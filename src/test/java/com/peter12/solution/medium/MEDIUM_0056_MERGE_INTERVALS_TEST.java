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
public class MEDIUM_0056_MERGE_INTERVALS_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0056_MERGE_INTERVALS_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0056_MERGE_INTERVALS_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		int[][]data = new int[4][];
		data[0] = new int[] { 1, 3};
		data[1] = new int[] {2, 6};
		data[2] = new int[] {8, 10};
		data[3] = new int[] {15, 18};
		
		int[][] ans = new int[3][];
		ans[0] = new int[] {1, 6};
		ans[1] = new int[] {8, 10};
		ans[2] = new int[] {15, 18};
		
		int[][] result = MEDIUM_0056_MERGE_INTERVALS.merge(data);
		
		Assert.assertTrue( ResultCheck.equalsForArray(ans, result));
		
		
		data = new int[5][];
		data[0] = new int[] {2, 3};
		data[1] = new int[] {4, 5};
		data[2] = new int[] {6 ,7};
		data[3] = new int[] {8, 9};
		data[4] = new int[] {1, 10};
		
		ans = new int[1][];
		ans[0] = new int[] {1, 10};
		
		result = MEDIUM_0056_MERGE_INTERVALS.merge(data);
		
		Assert.assertTrue( ResultCheck.equalsForArray(ans, result));
		//
		data = new int[2][];
		data[0] = new int[] { 1, 4};
		data[1] = new int[] {2, 3};
			
		ans = new int[1][];
		ans[0] = new int[] {1, 4};
		
		result = MEDIUM_0056_MERGE_INTERVALS.merge(data);
		
		Assert.assertTrue( ResultCheck.equalsForArray(ans, result));
		//
		
		data = new int[2][];
		data[0] = new int[] { 1, 4};
		data[1] = new int[] {0, 4};
			
		ans = new int[1][];
		ans[0] = new int[] {0, 4};
		
		result = MEDIUM_0056_MERGE_INTERVALS.merge(data);
		
		Assert.assertTrue( ResultCheck.equalsForArray(ans, result));
		//
		data = new int[2][];
		data[0] = new int[] { 1, 4};
		data[1] = new int[] {0, 4};
		
		ans = new int[1][];
		ans[0] = new int[] {0, 4};
		
		result = MEDIUM_0056_MERGE_INTERVALS.merge(data);
		Assert.assertTrue( ResultCheck.equalsForArray(ans, result));
		//
	    data = new int[2][];
		data[0] = new int[] { 1, 4};
		data[1] = new int[] {4, 5};
		
		ans = new int[1][];
		ans[0] = new int[] {1, 5};
		
		result = MEDIUM_0056_MERGE_INTERVALS.merge(data);
		Assert.assertTrue( ResultCheck.equalsForArray(ans, result));
		
		//
		
		
		
		
		
		
		
	}


}
