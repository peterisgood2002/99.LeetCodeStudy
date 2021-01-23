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
public class EASY_0374_GUESS_NUMBER_HIGHER_OR_LOWER_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0374_GUESS_NUMBER_HIGHER_OR_LOWER_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0374_GUESS_NUMBER_HIGHER_OR_LOWER_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	EASY_0374_GUESS_NUMBER_HIGHER_OR_LOWER.pick = 1;
    	Assert.assertEquals(EASY_0374_GUESS_NUMBER_HIGHER_OR_LOWER.pick,  
    			EASY_0374_GUESS_NUMBER_HIGHER_OR_LOWER.guessNumber(1));
    	
    	EASY_0374_GUESS_NUMBER_HIGHER_OR_LOWER.pick = 6;
    	Assert.assertEquals(EASY_0374_GUESS_NUMBER_HIGHER_OR_LOWER.pick,  
    			EASY_0374_GUESS_NUMBER_HIGHER_OR_LOWER.guessNumber(10));
    	
    	
    	
    	EASY_0374_GUESS_NUMBER_HIGHER_OR_LOWER.pick = 1;
    	Assert.assertEquals(EASY_0374_GUESS_NUMBER_HIGHER_OR_LOWER.pick,  
    			EASY_0374_GUESS_NUMBER_HIGHER_OR_LOWER.guessNumber(2));
    	
    	EASY_0374_GUESS_NUMBER_HIGHER_OR_LOWER.pick = 2;
    	Assert.assertEquals(EASY_0374_GUESS_NUMBER_HIGHER_OR_LOWER.pick,  
    			EASY_0374_GUESS_NUMBER_HIGHER_OR_LOWER.guessNumber(2));
    }
    
   
   
}
