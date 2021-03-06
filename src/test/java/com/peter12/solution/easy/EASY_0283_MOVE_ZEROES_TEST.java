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
public class EASY_0283_MOVE_ZEROES_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0283_MOVE_ZEROES_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0283_MOVE_ZEROES_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {

    	int [] nums = new int[] {1 };
    	int [] ans = new int[] {1 };
    	
    	EASY_0283_MOVE_ZEROES.moveZeroes(nums);
    	
    	for( int i = 0; i < nums.length; i++ ) {
    		Assert.assertEquals(ans[i], nums[i]);
    	}
    	
    	
    	nums = new int[] {0, 1, 0, 3, 12 };
    	ans = new int[] {1, 3, 12, 0, 0 };
    	
    	EASY_0283_MOVE_ZEROES.moveZeroes(nums);
    	
    	for( int i = 0; i < nums.length; i++ ) {
    		Assert.assertEquals(ans[i], nums[i]);
    	}
    }
    
   
   
}
