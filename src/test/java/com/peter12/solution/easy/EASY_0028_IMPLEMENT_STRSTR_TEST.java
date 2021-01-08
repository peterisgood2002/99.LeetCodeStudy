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
public class EASY_0028_IMPLEMENT_STRSTR_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0028_IMPLEMENT_STRSTR_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0028_IMPLEMENT_STRSTR_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	Assert.assertEquals(EASY_0028_IMPLEMENT_STRSTR.strStr("a", "a"), 0);
    	Assert.assertEquals(EASY_0028_IMPLEMENT_STRSTR.strStr("mississippi", "issi"), 1);
    	
    	Assert.assertEquals(EASY_0028_IMPLEMENT_STRSTR.strStr("hello", "ll"), 2);
    	Assert.assertEquals(EASY_0028_IMPLEMENT_STRSTR.strStr("aaaaa", "bba"), -1);
    	Assert.assertEquals(EASY_0028_IMPLEMENT_STRSTR.strStr("", ""), 0);
    	
    	
    }
    
    
   
}
