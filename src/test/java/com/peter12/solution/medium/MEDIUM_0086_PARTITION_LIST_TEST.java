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
public class MEDIUM_0086_PARTITION_LIST_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0086_PARTITION_LIST_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0086_PARTITION_LIST_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		int[] nums = new int[] { 4, 3, 2, 5, 2 };
		int[] ans = new int[] { 2, 2, 4, 3, 5 };

		ListNode ln = ListNode.getLinkList(nums);
		ListNode la = ListNode.getLinkList(ans);
		ListNode result = MEDIUM_0086_PARTITION_LIST.partition(ln, 3);

		Assert.assertTrue( ListNode.theSameList(la, result));
		//

		nums = new int[] { 2, 1 };
		ans = new int[] { 1, 2};

		ln = ListNode.getLinkList(nums);
		la = ListNode.getLinkList(ans);
		result = MEDIUM_0086_PARTITION_LIST.partition(ln, 2);

		Assert.assertTrue( ListNode.theSameList(la, result));
		//

		nums = new int[] { 1, 4, 3, 2, 5, 2 };
		ans = new int[] { 1, 2, 2, 4, 3, 5};

		ln = ListNode.getLinkList(nums);
		la = ListNode.getLinkList(ans);
		result = MEDIUM_0086_PARTITION_LIST.partition(ln, 3);

		Assert.assertTrue( ListNode.theSameList(la, result));
		//




	}


}
