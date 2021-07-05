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
public class MEDIUM_0166_FRACTION_TO_RECURRING_DECIMAL_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0166_FRACTION_TO_RECURRING_DECIMAL_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0166_FRACTION_TO_RECURRING_DECIMAL_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {
		MEDIUM_0166_FRACTION_TO_RECURRING_DECIMAL.fractionToDecimal(-1, -2147483648);
		MEDIUM_0166_FRACTION_TO_RECURRING_DECIMAL.fractionToDecimal(7, -12);
		MEDIUM_0166_FRACTION_TO_RECURRING_DECIMAL.fractionToDecimal(1, 6);
		
		
	}
}
