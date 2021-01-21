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
public class EASY_0225_IMPLEMENT_STACK_USING_QUEUES_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0225_IMPLEMENT_STACK_USING_QUEUES_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0225_IMPLEMENT_STACK_USING_QUEUES_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	EASY_0225_IMPLEMENT_STACK_USING_QUEUES myStack = new EASY_0225_IMPLEMENT_STACK_USING_QUEUES();
    	myStack.push(1);
    	myStack.push(2);
    	Assert.assertEquals(2, myStack.top()); // return 2
    	Assert.assertEquals(2, myStack.pop()); // return 2
    	myStack.empty(); // return False
    	
    	
    	
    	
    }
    
   
   
}
