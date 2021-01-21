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
public class EASY_0232_IMPLEMENT_QUEUE_USING_STACKS_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0232_IMPLEMENT_QUEUE_USING_STACKS_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0232_IMPLEMENT_QUEUE_USING_STACKS_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	EASY_0232_IMPLEMENT_QUEUE_USING_STACKS myQueue = new EASY_0232_IMPLEMENT_QUEUE_USING_STACKS();
    	myQueue.push(1); // queue is: [1]
    	myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
    	Assert.assertEquals(1, myQueue.peek() ); // return 1
    	Assert.assertEquals(1, myQueue.pop() ); // return 1, queue is [2]
    	Assert.assertFalse(myQueue.empty());// return false
    	
     	
    }
    
   
   
}
