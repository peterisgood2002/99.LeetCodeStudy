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
public class MEDIUM_0073_SET_MATRIX_ZEROES_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0073_SET_MATRIX_ZEROES_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0073_SET_MATRIX_ZEROES_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {
		
		
		int[][] data = new int[2][];
		data[0] = new int[] { 0};
		data[1] = new int[] { 1};
		
		int[][] ans = new int[2][];
		ans[0] = new int[] {0};
		ans[1] = new int[] {0};
		
		
		MEDIUM_0073_SET_MATRIX_ZEROES.setZeroes(data);
		
		Assert.assertTrue( ResultCheck.equalsForArray(ans, data));
		//
		
		data = new int[3][];
		data[0] = new int[] { 0, 1, 2, 0};
		data[1] = new int[] { 3, 4, 5, 2};
		data[2] = new int[] { 1, 3, 1, 5};
		
		 ans = new int[3][];
		ans[0] = new int[] {0 ,0, 0, 0};
		ans[1] = new int[] {0, 4, 5, 0};
		ans[2] = new int[] {0, 3, 1, 0};
		
		MEDIUM_0073_SET_MATRIX_ZEROES.setZeroes(data);
		
		Assert.assertTrue( ResultCheck.equalsForArray(ans, data));
		//
		
		data = new int[3][];
		data[0] = new int[] { 1, 1, 1};
		data[1] = new int[] { 1, 0, 1};
		data[2] = new int[] { 1, 1, 1};
		
		ans = new int[3][];
		ans[0] = new int[] {1, 0, 1};
		ans[1] = new int[] {0, 0, 0};
		ans[2] = new int[] {1, 0, 1};
		
		MEDIUM_0073_SET_MATRIX_ZEROES.setZeroes(data);
		
		Assert.assertTrue( ResultCheck.equalsForArray(ans, data));
		
		
		
		
	}


}
