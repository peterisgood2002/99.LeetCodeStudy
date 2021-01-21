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
public class EASY_0228_SUMMARY_RANGES_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0228_SUMMARY_RANGES_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0228_SUMMARY_RANGES_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	int[] data = new int[] {0 };
    	List<String> result = EASY_0228_SUMMARY_RANGES.summaryRanges(data);
     	Assert.assertEquals("0", result.get(0));
    	
    	data = new int[] {0, 1, 2, 4, 5, 7 };
    	
    	result = EASY_0228_SUMMARY_RANGES.summaryRanges(data);
    	Assert.assertEquals("0->2", result.get(0));
    	Assert.assertEquals("4->5", result.get(1));
    	Assert.assertEquals("7", result.get(2));
    	
    	data = new int[] {0, 2, 3, 4, 6, 8, 9 };
     	
     	result = EASY_0228_SUMMARY_RANGES.summaryRanges(data);
     	Assert.assertEquals("0", result.get(0));
     	Assert.assertEquals("2->4", result.get(1));
     	Assert.assertEquals("6", result.get(2));
     	Assert.assertEquals("8->9", result.get(3));
    	
     	
    }
    
   
   
}
