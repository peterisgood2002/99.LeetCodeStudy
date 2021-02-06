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
public class MEDIUM_0059_SPIRAL_MATRIX_II_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0059_SPIRAL_MATRIX_II_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0059_SPIRAL_MATRIX_II_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		int[][] ans = new int[3][];
		ans[0] = new int[] {1, 2, 3};
		ans[1] = new int[] {8, 9, 4};
		ans[2] = new int[] {7, 6, 5};
		
		int[][] result =MEDIUM_0059_SPIRAL_MATRIX_II.generateMatrix(3);
		Assert.assertTrue( ResultCheck.equalsForArray(ans, result));
		
		ans = new int[4][];
		ans[0] = new int[] {1,  2,  3 , 4};
		ans[1] = new int[] {12, 13, 14, 5};
		ans[2] = new int[] {11, 16, 15, 6};
		ans[3] = new int[] {10, 9 , 8,  7};
		result =MEDIUM_0059_SPIRAL_MATRIX_II.generateMatrix(4);
		Assert.assertTrue( ResultCheck.equalsForArray(ans, result));
		
		
		
	}


}
