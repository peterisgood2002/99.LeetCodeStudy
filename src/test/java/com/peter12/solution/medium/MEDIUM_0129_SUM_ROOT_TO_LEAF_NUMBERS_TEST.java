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
public class MEDIUM_0129_SUM_ROOT_TO_LEAF_NUMBERS_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0129_SUM_ROOT_TO_LEAF_NUMBERS_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0129_SUM_ROOT_TO_LEAF_NUMBERS_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		Integer[] data = new Integer[] { 4, 9, 0 ,5 ,1};
		TreeNode root = TreeNode.createTreeNode(data);
		
		Assert.assertEquals(1026, MEDIUM_0129_SUM_ROOT_TO_LEAF_NUMBERS.sumNumbers(root));
		
		data = new Integer[] {1, 2, 3};
		root = TreeNode.createTreeNode(data);
		
		Assert.assertEquals(25, MEDIUM_0129_SUM_ROOT_TO_LEAF_NUMBERS.sumNumbers(root));
		
		
		
		


	}
}
