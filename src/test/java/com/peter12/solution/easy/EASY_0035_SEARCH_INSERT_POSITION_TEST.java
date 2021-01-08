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
public class EASY_0035_SEARCH_INSERT_POSITION_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0035_SEARCH_INSERT_POSITION_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0035_SEARCH_INSERT_POSITION_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	int[] nums = new int[] {1, 3, 5, 6};
    	Assert.assertEquals(EASY_0035_SEARCH_INSERT_POSITION.searchInsert(nums, 7), 4);
    	Assert.assertEquals(EASY_0035_SEARCH_INSERT_POSITION.searchInsert(nums, 2), 1);
    	Assert.assertEquals(EASY_0035_SEARCH_INSERT_POSITION.searchInsert(nums, 5), 2);
    	
    	Assert.assertEquals(EASY_0035_SEARCH_INSERT_POSITION.searchInsert(nums, 0), 0);
    	
    	int[] nums1 = new int[] {1};
    	Assert.assertEquals(EASY_0035_SEARCH_INSERT_POSITION.searchInsert(nums1, 0), 0);
    }
    
    
   
}
