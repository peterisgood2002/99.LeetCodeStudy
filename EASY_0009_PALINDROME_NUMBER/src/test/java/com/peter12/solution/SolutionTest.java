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
    	
    	Assert.assertTrue( Solution.isPalindrome(121));
    	
    	Assert.assertFalse( Solution.isPalindrome(-121));
    	
    	Assert.assertFalse( Solution.isPalindrome(10));
   
    	Assert.assertFalse( Solution.isPalindrome(-101));
    	
    	
    	
    	
    }
}
