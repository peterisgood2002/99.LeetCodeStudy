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
public class MEDIUM_0054_SPIRAL_MATRIX_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0054_SPIRAL_MATRIX_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0054_SPIRAL_MATRIX_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		int[][] matrix = new int[3][];
		matrix[0] = new int[] {1, 2, 3, 4};
		matrix[1] = new int[] {5, 6, 7, 8};
		matrix[2] = new int[] {9, 10, 11, 12};
		
		int[] ans = new int[] { 1,2,3,4,8,12,11,10,9,5,6,7 };
		List<Integer> result = MEDIUM_0054_SPIRAL_MATRIX.spiralOrder(matrix);
		
		for( int i = 0; i < ans.length; i++ ) {
			Assert.assertEquals( ans[i], (int)result.get(i) );
		}
		
		matrix = new int[3][];
		matrix[0] = new int[] {1, 2, 3};
		matrix[1] = new int[] {4, 5, 6};
		matrix[2] = new int[] {7, 8, 9};
		ans = new int[] {1, 2, 3, 6, 9, 8, 7, 4, 5 };
		
		result = MEDIUM_0054_SPIRAL_MATRIX.spiralOrder(matrix);
		
		for( int i = 0; i < ans.length; i++ ) {
			Assert.assertEquals( ans[i], (int)result.get(i) );
		}
		
		matrix = new int[4][];
		matrix[0] = new int[] {1, 2, 3};
		matrix[1] = new int[] {4, 5, 6};
		matrix[2] = new int[] {7, 8, 9};
		matrix[3] = new int[] {10, 11, 12};
		
		ans = new int[] { 1, 2, 3, 6, 9, 12 ,11,10, 7, 4, 5, 8 };
		result = MEDIUM_0054_SPIRAL_MATRIX.spiralOrder(matrix);
		
		for( int i = 0; i < ans.length; i++ ) {
			Assert.assertEquals( ans[i], (int)result.get(i) );
		}
		
	}


}
