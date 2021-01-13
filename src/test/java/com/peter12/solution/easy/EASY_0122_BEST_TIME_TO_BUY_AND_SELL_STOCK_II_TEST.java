package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.ListNode;
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
public class EASY_0122_BEST_TIME_TO_BUY_AND_SELL_STOCK_II_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0122_BEST_TIME_TO_BUY_AND_SELL_STOCK_II_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0122_BEST_TIME_TO_BUY_AND_SELL_STOCK_II_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	int[] data = new int[] { 1, 2, 3, 4, 5 };
    	Assert.assertEquals(4, EASY_0122_BEST_TIME_TO_BUY_AND_SELL_STOCK_II.maxProfit(data));
    	
    	
    	data = new int[] { 7, 1, 5, 3, 6, 4 };
    	Assert.assertEquals(7, EASY_0122_BEST_TIME_TO_BUY_AND_SELL_STOCK_II.maxProfit(data));
    	
    	
    	
    	data = new int[] { 7, 6, 4, 3, 1 };
    	Assert.assertEquals(0, EASY_0122_BEST_TIME_TO_BUY_AND_SELL_STOCK_II.maxProfit(data));
    	
    	
    	
    }
    
   
   
}
