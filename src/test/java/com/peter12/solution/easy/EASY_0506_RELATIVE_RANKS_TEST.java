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
public class EASY_0506_RELATIVE_RANKS_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0506_RELATIVE_RANKS_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0506_RELATIVE_RANKS_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	int[] nums = new int[] { 5, 4, 3, 2, 1};
    	String[] ans = new String[] {"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"};
    	String[] result = EASY_0506_RELATIVE_RANKS.findRelativeRanks(nums);
    	
    	for( int i = 0; i < ans.length; i++ ) {
    		Assert.assertEquals(ans[i], result[i]);
    	}
    }
    
   
   
}
