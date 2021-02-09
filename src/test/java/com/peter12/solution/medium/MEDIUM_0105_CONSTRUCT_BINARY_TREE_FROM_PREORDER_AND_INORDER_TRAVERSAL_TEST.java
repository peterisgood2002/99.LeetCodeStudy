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
public class MEDIUM_0105_CONSTRUCT_BINARY_TREE_FROM_PREORDER_AND_INORDER_TRAVERSAL_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0105_CONSTRUCT_BINARY_TREE_FROM_PREORDER_AND_INORDER_TRAVERSAL_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0105_CONSTRUCT_BINARY_TREE_FROM_PREORDER_AND_INORDER_TRAVERSAL_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		//
		int[] preorder = new int[] {3, 1, 2, 4};
		int[] inorder = new int[] {1, 2, 3, 4};

		TreeNode result = MEDIUM_0105_CONSTRUCT_BINARY_TREE_FROM_PREORDER_AND_INORDER_TRAVERSAL.buildTree(preorder, inorder);

		Assert.assertTrue( result != null);
		//
		preorder = new int[] {3, 9, 20, 15, 7};
		inorder = new int[] {9, 3, 15, 20, 7};

		result = MEDIUM_0105_CONSTRUCT_BINARY_TREE_FROM_PREORDER_AND_INORDER_TRAVERSAL.buildTree(preorder, inorder);

		Assert.assertTrue( result != null);
		//
		preorder = new int[] {1, 2, 3};
		inorder = new int[] {3, 2, 1};

		result = MEDIUM_0105_CONSTRUCT_BINARY_TREE_FROM_PREORDER_AND_INORDER_TRAVERSAL.buildTree(preorder, inorder);

		Assert.assertTrue( result != null);
		//
		preorder = new int[] {1, 2};
		inorder = new int[] {1, 2};

		result = MEDIUM_0105_CONSTRUCT_BINARY_TREE_FROM_PREORDER_AND_INORDER_TRAVERSAL.buildTree(preorder, inorder);

		Assert.assertTrue( result != null);
		//
		preorder = new int[] {1, 2};
		inorder = new int[] {2, 1};

		result = MEDIUM_0105_CONSTRUCT_BINARY_TREE_FROM_PREORDER_AND_INORDER_TRAVERSAL.buildTree(preorder, inorder);

		Assert.assertTrue( result != null);


	}
}
