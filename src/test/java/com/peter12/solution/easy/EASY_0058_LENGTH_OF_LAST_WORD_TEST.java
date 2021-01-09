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
public class EASY_0058_LENGTH_OF_LAST_WORD_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0058_LENGTH_OF_LAST_WORD_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0058_LENGTH_OF_LAST_WORD_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	Assert.assertEquals(5, EASY_0058_LENGTH_OF_LAST_WORD.lengthOfLastWord("Hello World"));
    	Assert.assertEquals(0, EASY_0058_LENGTH_OF_LAST_WORD.lengthOfLastWord(" "));
    	
    	
    }
    
    
   
}
