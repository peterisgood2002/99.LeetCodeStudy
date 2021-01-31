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
public class MEDIUM_0006_ZIGZAG_CONVERSION_TEST 
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0006_ZIGZAG_CONVERSION_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0006_ZIGZAG_CONVERSION_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {
		
		Assert.assertEquals("PAHNAPLSIIGYIR", MEDIUM_0006_ZIGZAG_CONVERSION.convert("PAYPALISHIRING", 3));
		
		Assert.assertEquals("PINALSIGYAHRPI", MEDIUM_0006_ZIGZAG_CONVERSION.convert("PAYPALISHIRING", 4));
	}




}
