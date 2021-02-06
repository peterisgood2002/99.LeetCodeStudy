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
public class MEDIUM_0055_JUMP_GAME_TEST
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0055_JUMP_GAME_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0055_JUMP_GAME_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		
		int[] nums = new int[] { 0, 1};
		Assert.assertFalse(MEDIUM_0055_JUMP_GAME.canJump(nums));
		
		nums = new int[] {3, 0, 0, 0};
		Assert.assertTrue(MEDIUM_0055_JUMP_GAME.canJump(nums));
		nums = new int[] {2, 0, 0};
		Assert.assertTrue(MEDIUM_0055_JUMP_GAME.canJump(nums));
		
		nums = new int[] { 0};
		Assert.assertTrue(MEDIUM_0055_JUMP_GAME.canJump(nums));
		
		nums = new int[] { 2, 3, 1, 1, 4};
		Assert.assertTrue(MEDIUM_0055_JUMP_GAME.canJump(nums));
		
		nums = new int[] { 2, 1, 0, 0};
		Assert.assertFalse(MEDIUM_0055_JUMP_GAME.canJump(nums));
		
		
		
		nums = new int[] { 3, 2, 1, 0 ,1, 2, 0, 4};
		Assert.assertFalse(MEDIUM_0055_JUMP_GAME.canJump(nums));
		nums = new int[] { 3, 2, 1, 0 ,4};
		Assert.assertFalse(MEDIUM_0055_JUMP_GAME.canJump(nums));
		
		
		
		
	}


}
