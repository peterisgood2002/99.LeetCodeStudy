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
public class MEDIUM_0120_TRIANGLE_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0120_TRIANGLE_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0120_TRIANGLE_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		List<List<Integer>> data = new Vector<List<Integer>>();
		
		List<Integer> d = new Vector<Integer>();
		d.add(2);
		data.add(d);
		d = new Vector<Integer>();
		d.add(3);
		d.add(4);
		data.add(d);
		d = new Vector<Integer>();
		d.add(6);
		d.add(5);
		d.add(7);
		data.add(d);
		d = new Vector<Integer>();
		d.add(4);
		d.add(1);
		d.add(8);
		d.add(3);
		data.add(d);
		
		Assert.assertEquals(11, MEDIUM_0120_TRIANGLE.minimumTotal(data));
		
		
		


	}
}
