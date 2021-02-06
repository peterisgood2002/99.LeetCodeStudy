package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.ListNode;
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
public class EASY_0088_MERGE_SORTED_ARRAY_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0088_MERGE_SORTED_ARRAY_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0088_MERGE_SORTED_ARRAY_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	int[] nums1 = new int[] {1,2,3,0,0,0};
    	int[] nums2 = new int[] {2,5,6};
    	int[] ans = new int[] {1,2,2,3,5,6};
    	EASY_0088_MERGE_SORTED_ARRAY.merge(nums1, 3, nums2, 3);
    	Assert.assertTrue( ResultCheck.equalsForArray(ans, nums1));
    	
    	nums1 = new int[] {1};
    	nums2 = new int[0] ;
    	ans = new int[] {1};
    	EASY_0088_MERGE_SORTED_ARRAY.merge(nums1, 1, nums2, 0);
    	Assert.assertTrue( ResultCheck.equalsForArray(ans, nums1));
    	
    	nums1 = new int[] {4,5,6,0,0,0};
    	nums2 = new int[] {1,2,3};
    	ans = new int[] {1,2,3,4,5,6};
    	EASY_0088_MERGE_SORTED_ARRAY.merge(nums1, 3, nums2, 3);
    	Assert.assertTrue( ResultCheck.equalsForArray(ans, nums1));
    	
    }
  
}
