package com.peter12.solution;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SolutionTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SolutionTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SolutionTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    
    
    public static void testGetResult() {
    	
    	Assert.assertEquals(Solution.romanToInt("IV"), 4);
    	
    	Assert.assertEquals(Solution.romanToInt("IX"), 9);
    	
    	Assert.assertEquals(Solution.romanToInt("XL"), 40);
    	
    	Assert.assertEquals(Solution.romanToInt("XC"), 90);

    	Assert.assertEquals(Solution.romanToInt("CD"), 400);
    	
    	Assert.assertEquals(Solution.romanToInt("CM"), 900);
    	

    	//
    	Assert.assertEquals(Solution.romanToInt("LVIII"), 58);
    	
    	Assert.assertEquals(Solution.romanToInt("MCMXCIV"), 1994);
    	
    }
}
