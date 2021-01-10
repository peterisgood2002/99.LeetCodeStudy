package com.peter12.solution.easy;

import com.peter12.solution.easy.EASY_0007_REVERSE_INTEGER;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class EASY_0007_REVERSE_INTEGER_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0007_REVERSE_INTEGER_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0007_REVERSE_INTEGER_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	Assert.assertEquals( 0, EASY_0007_REVERSE_INTEGER.reverse(1534236469) );
    	Assert.assertEquals( 321, EASY_0007_REVERSE_INTEGER.reverse(123) );
    	Assert.assertEquals( -321, EASY_0007_REVERSE_INTEGER.reverse(-123) );
    	Assert.assertEquals( 21, EASY_0007_REVERSE_INTEGER.reverse(120) );
    	Assert.assertEquals( 0, EASY_0007_REVERSE_INTEGER.reverse(0) );
    	
    	
    	
    	
    	
    	
    }
}
