package com.peter12.solution;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SolutionTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SolutionTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SolutionTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public static void testResult() {
    	int[] nums = new int[] {2, 7 , 0 };
    	boolean[] select = new boolean [3];
    	select[0] = true;
    	select[1] = true;
    	int[] result = Solution.getResult(select, nums);
    	Assert.assertTrue(result.length == 3 );
    	
    	
    }
    
    public static void testGetBiggest() {
    	int[] nums = new int[] {2, 7 , 11, 5};
    	boolean[] select = new boolean [4];
    	
    	int target = 9;
    	
    	int result = Solution.getBiggest(select, nums, target);
    	Assert.assertTrue(result == 2 );
    	
    	result = Solution.getBiggest(select, nums, target);
    	Assert.assertTrue(result == 7 );
    	
    	result = Solution.getBiggest(select, nums, target);
    	Assert.assertTrue(result == 5 );
    	
    	result = Solution.getBiggest(select, nums, target);
    	Assert.assertTrue(result == 0 );
    	
    	int[] nums3 = new int[] {-3, 4, 3, 90};
    	select = new boolean [4];
    	target = 0;
    	result = Solution.getBiggest(select, nums3, target);
    	Assert.assertTrue(result == -3 );
    	
    	
    }
    
    public static void testGetResult() {
    	int[] nums5 = new int[] {-10,-1,-18,-19};
    	int target = -19;
    	
    	int[] result = Solution.twoSum(nums5, target);
    	
    	Assert.assertTrue(result.length == 1 && result[0] == 3);
    	
    	int[] nums = new int[] {2, 7 , 11, 5};
    	target = 9;
    	
    	 result = Solution.twoSum(nums, target);
    	
    	Assert.assertTrue(result.length == 2 && result[0] == 0 && result[1] == 1);
    	
    	int[] nums1 = new int[] {3, 2, 4};
    	target = 6;
    	
    	result = Solution.twoSum(nums1, target);
    	
    	Assert.assertTrue(result.length == 2  && result[0] == 1 && result[1] == 2);
    	
    	int[] nums2 = new int[] {3,3};
    	target = 6;
    	
    	result = Solution.twoSum(nums2, target);
    	
    	Assert.assertTrue(result.length == 2 && result[0] == 0 && result[1] == 1);
    	
    	int[] nums3 = new int[] {-3, 4, 3, 90};
    	target = 0;
    	
    	result = Solution.twoSum(nums3, target);
    	
    	Assert.assertTrue(result.length == 2 && result[0] == 0 && result[1] == 2);
    	
    	int[] nums4 = new int[] {-1, -2, -3, -4, -5};
    	target = -8;
    	
    	result = Solution.twoSum(nums4, target);
    	
    	Assert.assertTrue(result.length == 2 && result[0] == 2 && result[1] == 4);
    	
    	
    	
    	
    	
    	
    }
}
