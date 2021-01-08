package com.peter12.solution.easy;

import com.peter12.solution.easy.EASY_0009_PALINDROME_NUMBER;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class EASY_0009_PALINDROME_NUMBER_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0009_PALINDROME_NUMBER_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0009_PALINDROME_NUMBER_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	Assert.assertTrue( EASY_0009_PALINDROME_NUMBER.isPalindrome(121));
    	
    	Assert.assertFalse( EASY_0009_PALINDROME_NUMBER.isPalindrome(-121));
    	
    	Assert.assertFalse( EASY_0009_PALINDROME_NUMBER.isPalindrome(10));
   
    	Assert.assertFalse( EASY_0009_PALINDROME_NUMBER.isPalindrome(-101));
    	
    	
    	
    	
    }
}
