package com.peter12.solution.easy;

import com.peter12.solution.easy.EASY_0001_TWO_SUM;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class EASY_0001_TWO_SUM_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0001_TWO_SUM_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0001_TWO_SUM_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	int[] nums1 = new int[] {3, 2, 4};
    	int target = 6;
    	
    	int[] result = EASY_0001_TWO_SUM.twoSum(nums1, target);
    	
    	Assert.assertTrue(result.length == 2  && result[0] == 1 && result[1] == 2);
    	
    	int[] nums5 = new int[] {-10,-1,-18,-19};
    	target = -19;
    	
    	result = EASY_0001_TWO_SUM.twoSum(nums5, target);
    	
    	Assert.assertTrue(result.length == 2 && result[0] == 1 && result[1] == 2);
    	
    	int[] nums4 = new int[] {-1, -2, -3, -4, -5};
    	target = -8;
    	
    	result = EASY_0001_TWO_SUM.twoSum(nums4, target);
    	
    	Assert.assertTrue(result.length == 2 && result[0] == 2 && result[1] == 4);
    	
    	
    	int[] nums = new int[] {2, 7 , 11, 5};
    	target = 9;
    	
    	 result = EASY_0001_TWO_SUM.twoSum(nums, target);
    	
    	Assert.assertTrue(result.length == 2 && result[0] == 0 && result[1] == 1);
    	
    	
    	
    	int[] nums2 = new int[] {3,3};
    	target = 6;
    	
    	result = EASY_0001_TWO_SUM.twoSum(nums2, target);
    	
    	Assert.assertTrue(result.length == 2 && result[0] == 0 && result[1] == 1);
    	
    	int[] nums3 = new int[] {-3, 4, 3, 90};
    	target = 0;
    	
    	result = EASY_0001_TWO_SUM.twoSum(nums3, target);
    	
    	Assert.assertTrue(result.length == 2 && result[0] == 0 && result[1] == 2);
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
