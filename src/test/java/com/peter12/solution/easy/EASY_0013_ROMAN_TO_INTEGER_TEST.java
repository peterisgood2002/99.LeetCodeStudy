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
    	
    	Assert.assertEquals(EASY_0013_ROMAN_TO_INTEGER.romanToInt("IV"), 4);
    	
    	Assert.assertEquals(EASY_0013_ROMAN_TO_INTEGER.romanToInt("IX"), 9);
    	
    	Assert.assertEquals(EASY_0013_ROMAN_TO_INTEGER.romanToInt("XL"), 40);
    	
    	Assert.assertEquals(EASY_0013_ROMAN_TO_INTEGER.romanToInt("XC"), 90);

    	Assert.assertEquals(EASY_0013_ROMAN_TO_INTEGER.romanToInt("CD"), 400);
    	
    	Assert.assertEquals(EASY_0013_ROMAN_TO_INTEGER.romanToInt("CM"), 900);
    	

    	//
    	Assert.assertEquals(EASY_0013_ROMAN_TO_INTEGER.romanToInt("LVIII"), 58);
    	
    	Assert.assertEquals(EASY_0013_ROMAN_TO_INTEGER.romanToInt("MCMXCIV"), 1994);
    	
    }
}
