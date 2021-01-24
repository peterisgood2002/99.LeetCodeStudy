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
public class EASY_0389_FIND_THE_DIFFERENCE_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0389_FIND_THE_DIFFERENCE_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0389_FIND_THE_DIFFERENCE_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	char result = EASY_0389_FIND_THE_DIFFERENCE.findTheDifference("abcd", "abcde");
    	Assert.assertEquals('e', result);
    	
    	result = EASY_0389_FIND_THE_DIFFERENCE.findTheDifference("", "y");
    	Assert.assertEquals('y', result);
    	
    	result = EASY_0389_FIND_THE_DIFFERENCE.findTheDifference("a", "aa");
    	Assert.assertEquals('a', result);
    	
    	result = EASY_0389_FIND_THE_DIFFERENCE.findTheDifference("ae", "aea");
    	Assert.assertEquals('a', result);
    	
    }
    
   
   
}
