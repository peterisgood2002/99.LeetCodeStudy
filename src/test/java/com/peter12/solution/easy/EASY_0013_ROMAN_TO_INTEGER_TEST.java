package com.peter12.solution.easy;

import com.peter12.solution.easy.EASY_0013_ROMAN_TO_INTEGER;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class EASY_0013_ROMAN_TO_INTEGER_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0013_ROMAN_TO_INTEGER_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0013_ROMAN_TO_INTEGER_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    
    
    public static void testGetResult() {
    	
    	Assert.assertEquals( 4,    EASY_0013_ROMAN_TO_INTEGER.romanToInt("IV") );
    	
    	Assert.assertEquals( 9,    EASY_0013_ROMAN_TO_INTEGER.romanToInt("IX") );
    	
    	Assert.assertEquals( 40,   EASY_0013_ROMAN_TO_INTEGER.romanToInt("XL") );
    	
    	Assert.assertEquals( 90,   EASY_0013_ROMAN_TO_INTEGER.romanToInt("XC") );

    	Assert.assertEquals( 400,  EASY_0013_ROMAN_TO_INTEGER.romanToInt("CD") );
    	
    	Assert.assertEquals( 900,  EASY_0013_ROMAN_TO_INTEGER.romanToInt("CM") );
    	

    	//
    	Assert.assertEquals( 58,   EASY_0013_ROMAN_TO_INTEGER.romanToInt("LVIII") );
    	
    	Assert.assertEquals( 1994, EASY_0013_ROMAN_TO_INTEGER.romanToInt("MCMXCIV") );
    	
    }
}
