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
public class EASY_0067_ADD_BINARY_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0067_ADD_BINARY_TEST( String testName )
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
    	Assert.assertEquals("11110", EASY_0067_ADD_BINARY.addBinary("1111", "1111"));
    	Assert.assertEquals("10101", EASY_0067_ADD_BINARY.addBinary("1010", "1011"));
    	
    	Assert.assertEquals("10", EASY_0067_ADD_BINARY.addBinary("1", "1"));
    	Assert.assertEquals("0", EASY_0067_ADD_BINARY.addBinary("0", "0"));
    	Assert.assertEquals("1", EASY_0067_ADD_BINARY.addBinary("0", "1"));
    	Assert.assertEquals("1", EASY_0067_ADD_BINARY.addBinary("1", "0"));
    	
    	
    	Assert.assertEquals("100", EASY_0067_ADD_BINARY.addBinary("11", "1"));
    	
    
    }
    
   
}
