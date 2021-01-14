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
public class EASY_0167_TWO_SUM_II_INPUT_ARRAY_IS_SORTED_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0167_TWO_SUM_II_INPUT_ARRAY_IS_SORTED_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0167_TWO_SUM_II_INPUT_ARRAY_IS_SORTED_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	int[] nums1 = new int[] { 2, 7, 11, 15};
    	int[] result = EASY_0167_TWO_SUM_II_INPUT_ARRAY_IS_SORTED.twoSum(nums1, 9);
    	
    	Assert.assertTrue(result[0] == 1 && result[1] == 2);
    	
    	nums1 = new int[] { 2, 3, 4};
    	result = EASY_0167_TWO_SUM_II_INPUT_ARRAY_IS_SORTED.twoSum(nums1, 6);
    	
    	Assert.assertTrue(result[0] == 1 && result[1] == 3);
    	
    	nums1 = new int[] {-1, 0};
    	result = EASY_0167_TWO_SUM_II_INPUT_ARRAY_IS_SORTED.twoSum(nums1, -1);
    	
    	Assert.assertTrue(result[0] == 1 && result[1] == 2);
    }
    
   
   
}
