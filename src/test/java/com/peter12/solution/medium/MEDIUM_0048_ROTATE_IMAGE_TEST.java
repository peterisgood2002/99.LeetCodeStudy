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
public class MEDIUM_0048_ROTATE_IMAGE_TEST 
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0048_ROTATE_IMAGE_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0048_ROTATE_IMAGE_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		int[][] data = new int[3][];
		data[0] = new int[] {1, 2, 3};
		data[1] = new int[] {4, 5, 6};
		data[2] = new int[] {7, 8, 9};
		
		int[][] ans = new int[3][];
		ans[0] = new int[] {7, 4, 1 };
		ans[1] = new int[] {8, 5, 2 };
		ans[2] = new int[] {9, 6, 3 };
		
		MEDIUM_0048_ROTATE_IMAGE.rotate(data);
		
		Assert.assertTrue( Util.equalsForArray(data, ans));
	}


}
