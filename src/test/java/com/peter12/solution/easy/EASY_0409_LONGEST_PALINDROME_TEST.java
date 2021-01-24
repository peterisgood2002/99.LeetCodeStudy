package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.ListNode;
import com.peter12.solution.data.ListNodeData;
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
public class EASY_0409_LONGEST_PALINDROME_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0409_LONGEST_PALINDROME_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0409_LONGEST_PALINDROME_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	Assert.assertEquals(5,  EASY_0409_LONGEST_PALINDROME.longestPalindrome("bananas"));
    	Assert.assertEquals(3,  EASY_0409_LONGEST_PALINDROME.longestPalindrome("ccc"));
    	Assert.assertEquals(7,  EASY_0409_LONGEST_PALINDROME.longestPalindrome("abccccdd"));
    	
    	Assert.assertEquals(1,  EASY_0409_LONGEST_PALINDROME.longestPalindrome("a"));
    	Assert.assertEquals(2,  EASY_0409_LONGEST_PALINDROME.longestPalindrome("bb"));
    	
    }
    
   
   
}
