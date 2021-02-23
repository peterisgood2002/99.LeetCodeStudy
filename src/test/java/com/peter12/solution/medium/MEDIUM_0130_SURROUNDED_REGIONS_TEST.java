package com.peter12.solution.medium;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.ListNode;
import com.peter12.solution.data.Node;
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
public class MEDIUM_0130_SURROUNDED_REGIONS_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0130_SURROUNDED_REGIONS_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0130_SURROUNDED_REGIONS_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		char[][] board = new char[5][];
		board[0] = new char[] { 'O','X','X','O','X' };
		board[1] = new char[] { 'X','O','O','X','O' };
		board[2] = new char[] { 'X','O','X','O','X' };
		board[3] = new char[] { 'O','X','O','O','O' };
		board[4] = new char[] { 'X','X','O','X','O' };
		
		char[][] ans = new char[5][];
		ans[0] = new char[] {'O','X','X','O','X'  };
		ans[1] = new char[] {'X','X','X','X','O'  };
		ans[2] = new char[] {'X','X','X','O','X'  };
		ans[3] = new char[] {'O','X','O','O','O'  };
		ans[4] = new char[] {'X','X','O','X','O'  };
		
		MEDIUM_0130_SURROUNDED_REGIONS.solve(board);
		
		Assert.assertTrue( ResultCheck.equalsForArray(ans, board) );
		//
		board = new char[5][];
		board[0] = new char[] { 'X','X','X','X','X' };
		board[1] = new char[] { 'X','O','O','O','X' };
		board[2] = new char[] { 'X','X','O','O','X' };
		board[3] = new char[] { 'X','X','X','O','X' };
		board[4] = new char[] { 'X','O','X','X','X' };
		
		ans = new char[5][];
		ans[0] = new char[] {'X','X','X','X','X' };
		ans[1] = new char[] {'X','X','X','X','X' };
		ans[2] = new char[] {'X','X','X','X','X' };
		ans[3] = new char[] {'X','X','X','X','X' };
		ans[4] = new char[] {'X','O','X','X','X' };
		
		MEDIUM_0130_SURROUNDED_REGIONS.solve(board);
		
		Assert.assertTrue( ResultCheck.equalsForArray(ans, board) );
		
		//
		board = new char[3][];
		board[0] = new char[] { 'O','O','O' };
		board[1] = new char[] { 'O','O','O' };
		board[2] = new char[] { 'O','O','O' };
		
		ans = new char[3][];
		ans[0] = new char[] { 'O','O','O' };
		ans[1] = new char[] { 'O','O','O' };
		ans[2] = new char[] { 'O','O','O' };
		
		MEDIUM_0130_SURROUNDED_REGIONS.solve(board);
		
		Assert.assertTrue( ResultCheck.equalsForArray(ans, board) );
		
		//
		board = new char[4][];
		board[0] = new char[] { 'X','X','X','X' };
		board[1] = new char[] { 'X','O','O','X' };
		board[2] = new char[] { 'X','X','O','X' };
		board[3] = new char[] { 'X','O','X','X' };
		
		ans = new char[4][];
		ans[0] = new char[] { 'X','X','X','X' };
		ans[1] = new char[] { 'X','X','X','X' };
		ans[2] = new char[] { 'X','X','X','X' };
		ans[3] = new char[] { 'X','O','X','X' };
		
		MEDIUM_0130_SURROUNDED_REGIONS.solve(board);
		
		Assert.assertTrue( ResultCheck.equalsForArray(ans, board) );
		
		
		


	}
}
