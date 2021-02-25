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
public class MEDIUM_0131_PALINDROME_PARTITIONING_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0131_PALINDROME_PARTITIONING_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0131_PALINDROME_PARTITIONING_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		Assert.assertEquals(16384, MEDIUM_0131_PALINDROME_PARTITIONING.partition("fffffffffffffff").size() );
		Assert.assertEquals(2, MEDIUM_0131_PALINDROME_PARTITIONING.partition("aab").size() );
		Assert.assertEquals(1, MEDIUM_0131_PALINDROME_PARTITIONING.partition("a").size() );
		Assert.assertEquals(2, MEDIUM_0131_PALINDROME_PARTITIONING.partition("bb").size() );
		
		
		


	}
}
