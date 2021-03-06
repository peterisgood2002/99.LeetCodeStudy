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
public class EASY_0026_REMOVE_DUPLICATES_FROM_SORTED_ARRAY_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0026_REMOVE_DUPLICATES_FROM_SORTED_ARRAY_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0026_REMOVE_DUPLICATES_FROM_SORTED_ARRAY_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	int[] nums1 = new int[] {1, 1, 2 };
    	
    	Assert.assertEquals( EASY_0026_REMOVE_DUPLICATES_FROM_SORTED_ARRAY.removeDuplicates(nums1), 2);
    	
    	nums1 = new int[] {0,0,1,1,1,2,2,3,3,4};
    	
    	Assert.assertEquals( EASY_0026_REMOVE_DUPLICATES_FROM_SORTED_ARRAY.removeDuplicates(nums1), 5);
    	
    	
    	
    }
    
    
   
}
