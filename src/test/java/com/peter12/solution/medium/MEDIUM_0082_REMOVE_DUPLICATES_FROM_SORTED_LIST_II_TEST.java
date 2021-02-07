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
public class MEDIUM_0082_REMOVE_DUPLICATES_FROM_SORTED_LIST_II_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0082_REMOVE_DUPLICATES_FROM_SORTED_LIST_II_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0082_REMOVE_DUPLICATES_FROM_SORTED_LIST_II_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		int[] nums = new int[] { 1, 1, 1, 2, 3 };
		int[] ans = new int[] { 2, 3};

		ListNode ln = ListNode.getLinkList(nums);
		ListNode la = ListNode.getLinkList(ans);
		ListNode result = MEDIUM_0082_REMOVE_DUPLICATES_FROM_SORTED_LIST_II.deleteDuplicates(ln);

		Assert.assertTrue( ListNode.theSameList(la, result));
		//
		nums = new int[] { 1, 2, 3, 3, 4, 4, 5, 6, 6, 6 };
		ans = new int[] { 1, 2, 5};

		ln = ListNode.getLinkList(nums);
		la = ListNode.getLinkList(ans);
		result = MEDIUM_0082_REMOVE_DUPLICATES_FROM_SORTED_LIST_II.deleteDuplicates(ln);

		Assert.assertTrue( ListNode.theSameList(la, result));



	}


}
