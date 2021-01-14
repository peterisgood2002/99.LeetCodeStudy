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
public class EASY_0160_INTERSECTION_OF_TWO_LINKED_LISTS_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0160_INTERSECTION_OF_TWO_LINKED_LISTS_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0160_INTERSECTION_OF_TWO_LINKED_LISTS_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	ListNode a = new ListNode(4);
    	a.next = new ListNode(1);
    	a.next.next = new ListNode(8);
    	ListNode current = a.next.next;
    	
    	ListNode b = new ListNode(5);
    	b.next = new ListNode(6);
    	b.next.next = new ListNode(1);
    	b.next.next.next = current;
    	
    	current.next = new ListNode(4);
    	current.next.next = new ListNode(5);
    	
    	Assert.assertEquals( current, EASY_0160_INTERSECTION_OF_TWO_LINKED_LISTS.getIntersectionNode(a, b) );
    	
    }
    
   
   
}
