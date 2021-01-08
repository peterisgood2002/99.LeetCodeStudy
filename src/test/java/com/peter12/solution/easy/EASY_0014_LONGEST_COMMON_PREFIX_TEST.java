package com.peter12.solution.easy;

import com.peter12.solution.easy.EASY_0014_LONGEST_COMMON_PREFIX;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class EASY_0014_LONGEST_COMMON_PREFIX_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0014_LONGEST_COMMON_PREFIX_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0014_LONGEST_COMMON_PREFIX_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	Assert.assertEquals(EASY_0014_LONGEST_COMMON_PREFIX.longestCommonPrefix(new String[] {"cir","car"} ), "c");
    	
    	Assert.assertEquals(EASY_0014_LONGEST_COMMON_PREFIX.longestCommonPrefix(new String[] {} ), "");
    	Assert.assertEquals(EASY_0014_LONGEST_COMMON_PREFIX.longestCommonPrefix(new String[] {"flower","flow","flight"} ), "fl");
    	
    	Assert.assertEquals(EASY_0014_LONGEST_COMMON_PREFIX.longestCommonPrefix(new String[] {"dog","racecar","car"} ), "");
    	
    	
    }
}
