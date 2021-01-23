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
public class EASY_0268_MISSING_NUMBER_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0268_MISSING_NUMBER_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0268_MISSING_NUMBER_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {

    	int[] nums = new int[] {3, 0, 1};
    	Assert.assertEquals(2, EASY_0268_MISSING_NUMBER.missingNumber(nums));
    	
    	nums = new int[] {0, 1};
    	Assert.assertEquals(2, EASY_0268_MISSING_NUMBER.missingNumber(nums));
    	
    	nums = new int[] {9, 6, 4, 2, 3, 5, 7, 0 ,1};
    	Assert.assertEquals(8, EASY_0268_MISSING_NUMBER.missingNumber(nums));
    	
    	nums = new int[] {0};
    	Assert.assertEquals(1, EASY_0268_MISSING_NUMBER.missingNumber(nums));
    	
    	
    	
     	
    }
    
   
   
}
