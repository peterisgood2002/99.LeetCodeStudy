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
public class MEDIUM_0079_WORD_SEARCH_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0079_WORD_SEARCH_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0079_WORD_SEARCH_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {
		
		char[][] data = new char[3][];
		data[0] = new char[] { 'a', 'a', 'a', 'a' };
		data[1] = new char[] { 'a', 'a', 'a', 'a' };
		data[2] = new char[] { 'a', 'a', 'a', 'a' };	
		
		Assert.assertFalse( MEDIUM_0079_WORD_SEARCH.exist(data, "aaaaaaaaaaaaa"));
		//
		data = new char[1][];
		data[0] = new char[] { 'a' };
			
		Assert.assertTrue( MEDIUM_0079_WORD_SEARCH.exist(data, "a"));
		//
		data = new char[3][];
		data[0] = new char[] { 'A', 'B', 'C', 'E' };
		data[1] = new char[] { 'S','F','E','S' };
		data[2] = new char[] { 'A','D','E','E' };
		
		Assert.assertTrue( MEDIUM_0079_WORD_SEARCH.exist(data, "ABCESEEEFS"));	
		Assert.assertTrue( MEDIUM_0079_WORD_SEARCH.exist(data, "SEE"));
	
		//
		data = new char[3][];
		data[0] = new char[] { 'A', 'B', 'C', 'E' };
		data[1] = new char[] { 'S','F','C','S' };
		data[2] = new char[] { 'A','D','E','E' };
		
		Assert.assertFalse( MEDIUM_0079_WORD_SEARCH.exist(data, "ABCB") );
		Assert.assertTrue( MEDIUM_0079_WORD_SEARCH.exist(data, "SEE"));
		Assert.assertTrue( MEDIUM_0079_WORD_SEARCH.exist(data, "ABCCED"));
		
	}


}
