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
public class EASY_0038_COUNT_AND_SAY_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0038_COUNT_AND_SAY_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0038_COUNT_AND_SAY_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	Assert.assertEquals("111221", EASY_0038_COUNT_AND_SAY.countAndSay(5));
    	Assert.assertEquals("21", EASY_0038_COUNT_AND_SAY.countAndSay(3));
    	Assert.assertEquals("1", EASY_0038_COUNT_AND_SAY.countAndSay(1));
    	Assert.assertEquals("11", EASY_0038_COUNT_AND_SAY.countAndSay(2));
    	
    	Assert.assertEquals("1211", EASY_0038_COUNT_AND_SAY.countAndSay(4));
    }
    
    
   
}
