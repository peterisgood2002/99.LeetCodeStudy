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
public class MEDIUM_0061_ROTATE_LIST_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0061_ROTATE_LIST_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0061_ROTATE_LIST_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		int[] nums = new int[] { 1, 2};
		int[] ans = new int[] { 2, 1};
		
		ListNode ln = ListNode.getLinkList(nums);
		ListNode la = ListNode.getLinkList(ans);
		
		ListNode result = MEDIUM_0061_ROTATE_LIST.rotateRight(ln, 1);
		Assert.assertTrue( ListNode.theSameList(la, result));
		//
		nums = new int[] { 0};
		ans = new int[] { 0};
		
		ln = ListNode.getLinkList(nums);
		la = ListNode.getLinkList(ans);
		
		result = MEDIUM_0061_ROTATE_LIST.rotateRight(ln, 1);
		Assert.assertTrue( ListNode.theSameList(la, result));
		
		
		nums = new int[] { 1, 2, 3, 4, 5};
		ans = new int[] { 4, 5, 1, 2, 3};
		
		ln = ListNode.getLinkList(nums);
		la = ListNode.getLinkList(ans);
		
		result = MEDIUM_0061_ROTATE_LIST.rotateRight(ln, 2);
		Assert.assertTrue( ListNode.theSameList(la, result));
		
		
		
	}


}
