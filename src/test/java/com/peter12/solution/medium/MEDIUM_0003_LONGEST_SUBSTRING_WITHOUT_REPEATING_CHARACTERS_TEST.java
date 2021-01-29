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
public class MEDIUM_0003_LONGEST_SUBSTRING_WITHOUT_REPEATING_CHARACTERS_TEST 
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0003_LONGEST_SUBSTRING_WITHOUT_REPEATING_CHARACTERS_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0003_LONGEST_SUBSTRING_WITHOUT_REPEATING_CHARACTERS_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {
		
		int result = MEDIUM_0003_LONGEST_SUBSTRING_WITHOUT_REPEATING_CHARACTERS.lengthOfLongestSubstring("abcabcbb");
		Assert.assertEquals(3,  result);
		
		result = MEDIUM_0003_LONGEST_SUBSTRING_WITHOUT_REPEATING_CHARACTERS.lengthOfLongestSubstring("tmmzuxt");
		Assert.assertEquals(5,  result);
		
		
		
		result = MEDIUM_0003_LONGEST_SUBSTRING_WITHOUT_REPEATING_CHARACTERS.lengthOfLongestSubstring(" ");
		Assert.assertEquals(1,  result);

		result = MEDIUM_0003_LONGEST_SUBSTRING_WITHOUT_REPEATING_CHARACTERS.lengthOfLongestSubstring("bbbbb");
		Assert.assertEquals(1,  result);
		
		result = MEDIUM_0003_LONGEST_SUBSTRING_WITHOUT_REPEATING_CHARACTERS.lengthOfLongestSubstring("pwwkew");
		Assert.assertEquals(3,  result);

		result = MEDIUM_0003_LONGEST_SUBSTRING_WITHOUT_REPEATING_CHARACTERS.lengthOfLongestSubstring("");
		Assert.assertEquals(0,  result);
	}




}
