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
public class MEDIUM_0117_POPULATING_NEXT_RIGHT_POINTERS_IN_EACH_NODE_II_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0117_POPULATING_NEXT_RIGHT_POINTERS_IN_EACH_NODE_II_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0117_POPULATING_NEXT_RIGHT_POINTERS_IN_EACH_NODE_II_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		Integer[] data = new Integer[] {1, 2, 3, 4, 5, null, 6, 7, null, null, null, null, null, null, 8};

		Node nd = Node.createNode(data);

		MEDIUM_0117_POPULATING_NEXT_RIGHT_POINTERS_IN_EACH_NODE_II.connect(nd);

		Assert.assertTrue( nd != null);

		//
		data = new Integer[] {1, 2, 3, 4, 5, null, 7};

		nd = Node.createNode(data);

		MEDIUM_0117_POPULATING_NEXT_RIGHT_POINTERS_IN_EACH_NODE_II.connect(nd);

		Assert.assertTrue( nd != null);





	}
}
