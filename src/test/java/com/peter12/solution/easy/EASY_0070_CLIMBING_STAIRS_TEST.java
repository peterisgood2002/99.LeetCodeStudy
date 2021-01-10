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
public class EASY_0070_CLIMBING_STAIRS_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0070_CLIMBING_STAIRS_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0067_ADD_BINARY_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	Assert.assertEquals(2, EASY_0070_CLIMBING_STAIRS.climbStairs(2));
    	Assert.assertEquals(3, EASY_0070_CLIMBING_STAIRS.climbStairs(3));
    	Assert.assertEquals(5, EASY_0070_CLIMBING_STAIRS.climbStairs(4));
    	Assert.assertEquals(8, EASY_0070_CLIMBING_STAIRS.climbStairs(5));
    	
    	
    
    }
    
   
}
