package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.ListNode;
import com.peter12.solution.data.TreeNode;
import com.peter12.solution.data.TreeNodeData;
import com.peter12.solution.easy.EASY_0020_VALID_PARENTHESES;
import com.peter12.solution.util.Util;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class EASY_0125_VALID_PALINDROME_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0125_VALID_PALINDROME_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0125_VALID_PALINDROME_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	String data = "a man, a plan, a canal: Panama";
    	Assert.assertTrue( EASY_0125_VALID_PALINDROME.isPalindrome(",") );
    	Assert.assertFalse( EASY_0125_VALID_PALINDROME.isPalindrome("0P") );
    	
    	Assert.assertTrue( EASY_0125_VALID_PALINDROME.isPalindrome(data) );
    	
    	Assert.assertFalse( EASY_0125_VALID_PALINDROME.isPalindrome("race a car") );
    	
    	
    	
    }
    
   
   
}
