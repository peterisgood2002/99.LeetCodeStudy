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
public class MEDIUM_0103_BINARY_TREE_ZIGZAG_LEVEL_ORDER_TRAVERSAL_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0103_BINARY_TREE_ZIGZAG_LEVEL_ORDER_TRAVERSAL_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0103_BINARY_TREE_ZIGZAG_LEVEL_ORDER_TRAVERSAL_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.left.left = new TreeNode(8);
		root.left.right = new TreeNode(6);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		
		List<List<Integer>> result = MEDIUM_0103_BINARY_TREE_ZIGZAG_LEVEL_ORDER_TRAVERSAL.zigzagLevelOrder(root);
		
		List<List<Integer>> ans = new Vector<List<Integer>>();
		List<Integer> a = new Vector<Integer>();
		a.add(3);
		ans.add(a);
		a = new Vector<Integer>();
		a.add(20);
		a.add(9);
		ans.add(a);
		a = new Vector<Integer>();
		a.add(8);
		a.add(6);
		a.add(15);
		a.add(7);
		ans.add(a);
		
		Assert.assertTrue( ResultCheck.equalsForList(ans, result) );
		
		

	}


}
