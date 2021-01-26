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
public class EASY_0459_REPEATED_SUBSTRING_PATTERN_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0459_REPEATED_SUBSTRING_PATTERN_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0459_REPEATED_SUBSTRING_PATTERN_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	Assert.assertTrue( EASY_0459_REPEATED_SUBSTRING_PATTERN.repeatedSubstringPattern("aaa"));
    	Assert.assertFalse( EASY_0459_REPEATED_SUBSTRING_PATTERN.repeatedSubstringPattern("aba"));
    	Assert.assertTrue( EASY_0459_REPEATED_SUBSTRING_PATTERN.repeatedSubstringPattern("abaababaab"));
    	
    	
    	Assert.assertTrue( EASY_0459_REPEATED_SUBSTRING_PATTERN.repeatedSubstringPattern("abab"));
    	
    	Assert.assertTrue( EASY_0459_REPEATED_SUBSTRING_PATTERN.repeatedSubstringPattern("abcabcabcabc"));
    	
    }
    
   
   
}
