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
public class MEDIUM_0050_POW_X_N_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0050_POW_X_N_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0050_POW_X_N_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		Assert.assertEquals(54.83508, MEDIUM_0050_POW_X_N.myPow(0.44894, -5) );
		Assert.assertEquals(700.28148, MEDIUM_0050_POW_X_N.myPow(8.88023, 3) );
		Assert.assertEquals(9.26100, MEDIUM_0050_POW_X_N.myPow(2.10000, 3) );
		
		Assert.assertEquals(1024.00000, MEDIUM_0050_POW_X_N.myPow(2.00000, 10));
		
		Assert.assertEquals(1.00000, MEDIUM_0050_POW_X_N.myPow(1, 2147483647) );
		
		Assert.assertEquals(0.25000, MEDIUM_0050_POW_X_N.myPow(2.00000, -2) );
	}


}
