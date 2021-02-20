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
public class MEDIUM_0113_PATH_SUM_II_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0113_PATH_SUM_II_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0113_PATH_SUM_II_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		Integer[] data = new Integer[] {0, 1, 1};
		TreeNode rd = TreeNode.createTreeNode(data);
		
		List<List<Integer>> result = MEDIUM_0113_PATH_SUM_II.pathSum(rd, 1);
		Assert.assertEquals(2, result.size());
		
		//
		data = new Integer[] {1, 2};
		 rd = TreeNode.createTreeNode(data);
		
		result = MEDIUM_0113_PATH_SUM_II.pathSum(rd, 1);
		Assert.assertEquals(0, result.size());
		
		//
		data = new Integer[] {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, null, 5, 1};
		rd = TreeNode.createTreeNode(data);
		
		 result = MEDIUM_0113_PATH_SUM_II.pathSum(rd, 22);
		Assert.assertEquals(2, result.size());
		
		//
		data = new Integer[] {1, 2, 3};
		rd = TreeNode.createTreeNode(data);
		
		result = MEDIUM_0113_PATH_SUM_II.pathSum(rd, 5);
		Assert.assertEquals(0, result.size());
		
		//
		data = new Integer[] {1, 2};
		rd = TreeNode.createTreeNode(data);
		
		result = MEDIUM_0113_PATH_SUM_II.pathSum(rd, 0);
		Assert.assertEquals(0, result.size());
		
		
		


	}
}
