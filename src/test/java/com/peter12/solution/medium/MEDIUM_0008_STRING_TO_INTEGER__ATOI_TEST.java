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
public class MEDIUM_0008_STRING_TO_INTEGER__ATOI_TEST 
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0008_STRING_TO_INTEGER__ATOI_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0008_STRING_TO_INTEGER__ATOI_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {
		
		Assert.assertEquals(0, MEDIUM_0008_STRING_TO_INTEGER__ATOI.myAtoi("+-12"));
		
		Assert.assertEquals(1, MEDIUM_0008_STRING_TO_INTEGER__ATOI.myAtoi("+1"));
		
		Assert.assertEquals(3, MEDIUM_0008_STRING_TO_INTEGER__ATOI.myAtoi("3.14159"));
		
		Assert.assertEquals(-2147483648, MEDIUM_0008_STRING_TO_INTEGER__ATOI.myAtoi("-91283472332"));
		Assert.assertEquals(0, MEDIUM_0008_STRING_TO_INTEGER__ATOI.myAtoi("words and 987"));
		
		Assert.assertEquals(4193, MEDIUM_0008_STRING_TO_INTEGER__ATOI.myAtoi("4193 with words"));
		Assert.assertEquals(42, MEDIUM_0008_STRING_TO_INTEGER__ATOI.myAtoi("42"));
		Assert.assertEquals(-42, MEDIUM_0008_STRING_TO_INTEGER__ATOI.myAtoi("   -42"));
	}




}
