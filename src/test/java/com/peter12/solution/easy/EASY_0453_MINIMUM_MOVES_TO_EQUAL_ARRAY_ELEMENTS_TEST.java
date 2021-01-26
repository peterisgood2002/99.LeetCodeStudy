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
public class EASY_0453_MINIMUM_MOVES_TO_EQUAL_ARRAY_ELEMENTS_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0453_MINIMUM_MOVES_TO_EQUAL_ARRAY_ELEMENTS_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0453_MINIMUM_MOVES_TO_EQUAL_ARRAY_ELEMENTS_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	int[] nums = new int[] {5, 6, 8 ,8 ,5};
    	Assert.assertEquals(7, EASY_0453_MINIMUM_MOVES_TO_EQUAL_ARRAY_ELEMENTS.minMoves(nums));
    	
    	nums = new int[] {1, 2, 3};
    	Assert.assertEquals(3, EASY_0453_MINIMUM_MOVES_TO_EQUAL_ARRAY_ELEMENTS.minMoves(nums));
    	
    	
    }
    
   
   
}
