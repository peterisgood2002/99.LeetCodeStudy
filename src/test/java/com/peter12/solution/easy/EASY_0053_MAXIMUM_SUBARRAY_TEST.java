package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.ListNode;
import com.peter12.solution.easy.EASY_0020_VALID_PARENTHESES;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class EASY_0053_MAXIMUM_SUBARRAY_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0053_MAXIMUM_SUBARRAY_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0053_MAXIMUM_SUBARRAY_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	int [] nums1 = new int[] { -2,1,-3,4,-1,2,1,-5,4 };
    	
    	EASY_0053_MAXIMUM_SUBARRAY.findMax(nums1, 4);
    	Assert.assertEquals(6, EASY_0053_MAXIMUM_SUBARRAY.maxSubArray(nums1));
    	
    	nums1 = new int[] { 1 };
    	Assert.assertEquals(1, EASY_0053_MAXIMUM_SUBARRAY.maxSubArray(nums1));
    	
    	nums1 = new int[] { 0 };
    	Assert.assertEquals(0, EASY_0053_MAXIMUM_SUBARRAY.maxSubArray(nums1));
    }
    
    
   
}
