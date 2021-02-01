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
public class MEDIUM_0012_INTEGER_TO_ROMAN_TEST 
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0012_INTEGER_TO_ROMAN_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0012_INTEGER_TO_ROMAN_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {
		
		Assert.assertEquals("CM", MEDIUM_0012_INTEGER_TO_ROMAN.intToRoman(900));
		Assert.assertEquals("XX", MEDIUM_0012_INTEGER_TO_ROMAN.intToRoman(20));
		Assert.assertEquals("III", MEDIUM_0012_INTEGER_TO_ROMAN.intToRoman(3));
		
		Assert.assertEquals("IV", MEDIUM_0012_INTEGER_TO_ROMAN.intToRoman(4));
		
		Assert.assertEquals("IX", MEDIUM_0012_INTEGER_TO_ROMAN.intToRoman(9));
		
		Assert.assertEquals("LVIII", MEDIUM_0012_INTEGER_TO_ROMAN.intToRoman(58));
		
		Assert.assertEquals("MCMXCIV", MEDIUM_0012_INTEGER_TO_ROMAN.intToRoman(1994));
	}




}
