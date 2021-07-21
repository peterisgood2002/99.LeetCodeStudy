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
public class MEDIUM_1481_LEAST_NUMBER_OF_UNIQUE_INTEGERS_AFTER_K_REMOVALS_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_1481_LEAST_NUMBER_OF_UNIQUE_INTEGERS_AFTER_K_REMOVALS_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_1481_LEAST_NUMBER_OF_UNIQUE_INTEGERS_AFTER_K_REMOVALS_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		int[] data = new int[] { 2, 4, 1, 8, 3, 5, 1, 3};
		Assert.assertEquals(3, MEDIUM_1481_LEAST_NUMBER_OF_UNIQUE_INTEGERS_AFTER_K_REMOVALS.findLeastNumOfUniqueInts(data, 3));
		
		 data = new int[] { 5, 5, 4};
		Assert.assertEquals(1, MEDIUM_1481_LEAST_NUMBER_OF_UNIQUE_INTEGERS_AFTER_K_REMOVALS.findLeastNumOfUniqueInts(data, 1));
		
		data = new int[] { 4,3,1, 1,3, 3, 2};
		Assert.assertEquals(2, MEDIUM_1481_LEAST_NUMBER_OF_UNIQUE_INTEGERS_AFTER_K_REMOVALS.findLeastNumOfUniqueInts(data, 3));
		
		
		
		


	}
}
