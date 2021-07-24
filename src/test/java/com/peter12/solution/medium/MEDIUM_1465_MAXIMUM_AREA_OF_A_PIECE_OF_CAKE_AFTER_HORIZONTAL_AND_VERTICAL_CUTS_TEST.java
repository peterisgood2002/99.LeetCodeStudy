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
public class MEDIUM_1465_MAXIMUM_AREA_OF_A_PIECE_OF_CAKE_AFTER_HORIZONTAL_AND_VERTICAL_CUTS_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_1465_MAXIMUM_AREA_OF_A_PIECE_OF_CAKE_AFTER_HORIZONTAL_AND_VERTICAL_CUTS_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_1465_MAXIMUM_AREA_OF_A_PIECE_OF_CAKE_AFTER_HORIZONTAL_AND_VERTICAL_CUTS_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {


		int[] data = new int[] {2};
		
		MEDIUM_1465_MAXIMUM_AREA_OF_A_PIECE_OF_CAKE_AFTER_HORIZONTAL_AND_VERTICAL_CUTS.maxArea(1000000000, 1000000000, data, data);
		
		
		


	}
}
