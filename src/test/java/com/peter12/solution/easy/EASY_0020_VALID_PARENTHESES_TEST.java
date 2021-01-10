package com.peter12.solution.easy;

import com.peter12.solution.easy.EASY_0020_VALID_PARENTHESES;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class EASY_0020_VALID_PARENTHESES_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0020_VALID_PARENTHESES_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0020_VALID_PARENTHESES_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	Assert.assertEquals( true,  EASY_0020_VALID_PARENTHESES.isValid("(([]){})") );
    	
    	Assert.assertEquals( true,  EASY_0020_VALID_PARENTHESES.isValid("{}{}()[]") );
    	Assert.assertEquals( false, EASY_0020_VALID_PARENTHESES.isValid("(){}}{") );
    	
    	Assert.assertEquals( true,  EASY_0020_VALID_PARENTHESES.isValid("()") );
    	
    	Assert.assertEquals( false, EASY_0020_VALID_PARENTHESES.isValid("(]") );
    	
    	Assert.assertEquals( false, EASY_0020_VALID_PARENTHESES.isValid("([)]") );
    	
    	Assert.assertEquals( true,  EASY_0020_VALID_PARENTHESES.isValid("()[]{}") );
    	
    	Assert.assertEquals( true,  EASY_0020_VALID_PARENTHESES.isValid("{[]}") );
    }
}
