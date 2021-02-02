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
public class MEDIUM_0024_SWAP_NODES_IN_PAIRS_TEST 
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0024_SWAP_NODES_IN_PAIRS_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0024_SWAP_NODES_IN_PAIRS_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		
		int[] nums = new int[] { 1, 2, 3, 4};
		int[] ans = new int[] {2, 1, 4, 3};
		ListNode ln = ListNode.getLinkList(nums);
		ListNode la = ListNode.getLinkList(ans);
		ListNode result = MEDIUM_0024_SWAP_NODES_IN_PAIRS.swapPairs(ln);
		
		Assert.assertTrue( ListNode.theSameList(la, result));
		
		


	}





}
