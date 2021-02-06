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
public class MEDIUM_0074_SEARCH_A_2D_MATRIX_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0074_SEARCH_A_2D_MATRIX_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0074_SEARCH_A_2D_MATRIX_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {
		
		int[][] data = new int[1][];
		data[0] = new int[] { 1};

		
		Assert.assertFalse(MEDIUM_0074_SEARCH_A_2D_MATRIX.searchMatrix(data, 2));
		
		data = new int[3][];
		data[0] = new int[] { 1, 3, 5, 7};
		data[1] = new int[] { 10, 11, 16, 20};
		data[2] = new int[] { 23, 30 ,34, 60};
		
		Assert.assertTrue(MEDIUM_0074_SEARCH_A_2D_MATRIX.searchMatrix(data, 3));
		
		Assert.assertFalse(MEDIUM_0074_SEARCH_A_2D_MATRIX.searchMatrix(data, 13));
	
		
		
		
		
		
		
		
	}


}
