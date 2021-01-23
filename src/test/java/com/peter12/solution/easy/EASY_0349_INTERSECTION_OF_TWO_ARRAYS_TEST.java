package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.ListNode;
import com.peter12.solution.data.ListNodeData;
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
public class EASY_0349_INTERSECTION_OF_TWO_ARRAYS_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0349_INTERSECTION_OF_TWO_ARRAYS_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0349_INTERSECTION_OF_TWO_ARRAYS_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	int[] nums1 = new int[] { 1, 2, 2, 1};
    	int[] nums2 = new int[] { 2, 2 };
    	int[] ans = new int[] {2};
    	int[] result = EASY_0349_INTERSECTION_OF_TWO_ARRAYS.intersection(nums1, nums2);
    	Assert.assertTrue( Util.equalsForArray(ans, result));
    	
    	
    	nums1 = new int[] { 4, 9, 5};
    	nums2 = new int[] { 9, 4, 9, 8, 4 };
    	ans = new int[] {4, 9};
    	result = EASY_0349_INTERSECTION_OF_TWO_ARRAYS.intersection(nums1, nums2);
    	Assert.assertTrue( Util.equalsForArray(ans, result));
    	
     	
    }
    
   
   
}
