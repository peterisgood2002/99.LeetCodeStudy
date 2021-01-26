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
public class EASY_0496_NEXT_GREATER_ELEMENT_I_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0496_NEXT_GREATER_ELEMENT_I_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0496_NEXT_GREATER_ELEMENT_I_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	int[] nums1 = new int[] {2, 4 };
    	int[] nums2 = new int[] {1, 2, 3, 4 };
    	int[] result = EASY_0496_NEXT_GREATER_ELEMENT_I.nextGreaterElement(nums1, nums2);
    	
    	Assert.assertEquals(3, result.length);
    	
    	
    	nums1 = new int[] {4, 1, 2 };
    	nums2 = new int[] {1, 3, 4, 2 };
    	result = EASY_0496_NEXT_GREATER_ELEMENT_I.nextGreaterElement(nums1, nums2);
    	
    	Assert.assertEquals(3, result.length);
    	
    }
    
   
   
}
