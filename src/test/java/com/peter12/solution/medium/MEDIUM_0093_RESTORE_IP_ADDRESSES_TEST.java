package com.peter12.solution.medium;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.ListNode;
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
public class MEDIUM_0093_RESTORE_IP_ADDRESSES_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0093_RESTORE_IP_ADDRESSES_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0093_RESTORE_IP_ADDRESSES_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		List<String> result = MEDIUM_0093_RESTORE_IP_ADDRESSES.restoreIpAddresses("010010");
		Assert.assertEquals(2, result.size() );
		//

		result = MEDIUM_0093_RESTORE_IP_ADDRESSES.restoreIpAddresses("0000");
		Assert.assertEquals(1, result.size() );
		//
		result = MEDIUM_0093_RESTORE_IP_ADDRESSES.restoreIpAddresses("25525511135");
		Assert.assertEquals(2, result.size() );
		//

		result = MEDIUM_0093_RESTORE_IP_ADDRESSES.restoreIpAddresses("1111");
		Assert.assertEquals(1, result.size() );
		//

		result = MEDIUM_0093_RESTORE_IP_ADDRESSES.restoreIpAddresses("101023");
		Assert.assertEquals(5, result.size() );




	}


}
