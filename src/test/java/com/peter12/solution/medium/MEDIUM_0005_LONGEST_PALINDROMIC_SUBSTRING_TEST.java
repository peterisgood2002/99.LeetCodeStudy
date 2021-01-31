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
public class MEDIUM_0005_LONGEST_PALINDROMIC_SUBSTRING_TEST 
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0005_LONGEST_PALINDROMIC_SUBSTRING_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0005_LONGEST_PALINDROMIC_SUBSTRING_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {
		
		Assert.assertEquals("ccc", MEDIUM_0005_LONGEST_PALINDROMIC_SUBSTRING.longestPalindrome("ccc"));
		Assert.assertEquals("bb", MEDIUM_0005_LONGEST_PALINDROMIC_SUBSTRING.longestPalindrome("cbbd"));
		
		Assert.assertEquals("aba", MEDIUM_0005_LONGEST_PALINDROMIC_SUBSTRING.longestPalindrome("babad"));
		
		Assert.assertEquals("a", MEDIUM_0005_LONGEST_PALINDROMIC_SUBSTRING.longestPalindrome("a"));
		
		Assert.assertEquals("c", MEDIUM_0005_LONGEST_PALINDROMIC_SUBSTRING.longestPalindrome("ac"));
	}




}
