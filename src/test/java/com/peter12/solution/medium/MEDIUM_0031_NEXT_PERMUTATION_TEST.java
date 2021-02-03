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
public class MEDIUM_0031_NEXT_PERMUTATION_TEST 
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public MEDIUM_0031_NEXT_PERMUTATION_TEST( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( MEDIUM_0031_NEXT_PERMUTATION_TEST.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}


	public static void testGetResult() {

		int[] nums = new int[] {2,2,7,5,4,3,2,2,1};
		int[] ans = new int[] {2,3,1,2,2,2,4,5,7 };
		MEDIUM_0031_NEXT_PERMUTATION.nextPermutation(nums);
		check(nums, ans);
		
		
		nums = new int[] {1, 2, 3};
		ans = new int[] {1, 3, 2 };
		MEDIUM_0031_NEXT_PERMUTATION.nextPermutation(nums);
		check(nums, ans);
		
		nums = new int[] {3, 2, 1};
		ans = new int[] {1, 2, 3 };
		MEDIUM_0031_NEXT_PERMUTATION.nextPermutation(nums);
		check(nums, ans);
		
		
		nums = new int[] {1,3 ,4 ,6 ,5, 2};
		ans = new int[] {1,3 ,5 ,2, 4, 6 };
		MEDIUM_0031_NEXT_PERMUTATION.nextPermutation(nums);
		
		check(nums, ans);
	}

	public static void check(int[] nums, int[] ans) {
		for( int i = 0; i < nums.length; i++ ) {
			Assert.assertEquals(ans[i], nums[i]);
		}
	}




}
