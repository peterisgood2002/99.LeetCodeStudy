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
public class MEDIUM_0029_DIVIDE_TWO_INTEGERS_TEST 
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0029_DIVIDE_TWO_INTEGERS_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0029_DIVIDE_TWO_INTEGERS_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {
		Assert.assertEquals(2147483647, MEDIUM_0029_DIVIDE_TWO_INTEGERS.divide(-2147483648, -1));
		
		Assert.assertEquals(-2147483648, MEDIUM_0029_DIVIDE_TWO_INTEGERS.divide(-2147483648, 1));
		
		Assert.assertEquals(-2, MEDIUM_0029_DIVIDE_TWO_INTEGERS.divide(7, -3));
		Assert.assertEquals(3, MEDIUM_0029_DIVIDE_TWO_INTEGERS.divide(10, 3));
		
		
		Assert.assertEquals(0, MEDIUM_0029_DIVIDE_TWO_INTEGERS.divide(0, 1));
		Assert.assertEquals(1, MEDIUM_0029_DIVIDE_TWO_INTEGERS.divide(1, 1));
	}





}
