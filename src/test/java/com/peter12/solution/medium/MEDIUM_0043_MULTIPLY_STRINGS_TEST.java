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
public class MEDIUM_0043_MULTIPLY_STRINGS_TEST 
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0043_MULTIPLY_STRINGS_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0043_MULTIPLY_STRINGS_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		Assert.assertEquals("121932631112635269", MEDIUM_0043_MULTIPLY_STRINGS.multiply("123456789", "987654321"));
		Assert.assertEquals("0", MEDIUM_0043_MULTIPLY_STRINGS.multiply("9133", "0"));
		Assert.assertEquals("81", MEDIUM_0043_MULTIPLY_STRINGS.multiply("9", "9"));
		Assert.assertEquals("56088", MEDIUM_0043_MULTIPLY_STRINGS.multiply("123", "456"));
		Assert.assertEquals("6", MEDIUM_0043_MULTIPLY_STRINGS.multiply("2", "3"));
		
	}

	
}
