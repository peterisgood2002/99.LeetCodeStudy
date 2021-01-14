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
public class EASY_0155_MIN_STACK_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0155_MIN_STACK_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0155_MIN_STACK_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	EASY_0155_MIN_STACK minStack  = new EASY_0155_MIN_STACK();
    	
    	minStack.push(-2);
    	minStack.push(0);
    	minStack.push(-3);
    	
    	Assert.assertEquals(-3,  minStack.getMin() ); // return -3
    	minStack.pop();
    	Assert.assertEquals(0, minStack.top()) ;    // return 0
    	
    	Assert.assertEquals(-2,  minStack.getMin() ); // return -3
    	 // return -2
    	
    }
    
   
   
}
