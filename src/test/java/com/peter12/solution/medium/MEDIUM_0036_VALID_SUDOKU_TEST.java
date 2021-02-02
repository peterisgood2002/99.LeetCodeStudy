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
public class MEDIUM_0036_VALID_SUDOKU_TEST 
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0036_VALID_SUDOKU_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0036_VALID_SUDOKU_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		char[][] data = new char[9][];
		data[0] = new char[] { '.','.','.','.','5','.','.','1','.' };
		data[1] = new char[] { '.','4','.','3','.','.','.','.','.' };
		data[2] = new char[] { '.','.','.','.','.','3','.','.','1' };
		data[3] = new char[] { '8','.','.','.','.','.','.','2','.' };
		data[4] = new char[] { '.','.','2','.','7','.','.','.','.' };
		data[5] = new char[] { '.','1','5','.','.','.','.','.','.' };
		data[6] = new char[] { '.','.','.','.','.','2','.','.','.' };
		data[7] = new char[] { '.','2','.','9','.','.','.','.','.' };
		data[8] = new char[] { '.','.','4','.','.','.','.','.','.' };
		
		Assert.assertFalse( MEDIUM_0036_VALID_SUDOKU.isValidSudoku(data));
		
		
		
	}

	public static void check(int[] nums, int[] ans) {
		for( int i = 0; i < nums.length; i++ ) {
			Assert.assertEquals(ans[i], nums[i]);
		}
	}




}
