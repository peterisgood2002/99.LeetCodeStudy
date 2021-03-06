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
public class EASY_0206_REVERSE_LINKED_LIST_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0206_REVERSE_LINKED_LIST_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0206_REVERSE_LINKED_LIST_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	int[] nums1 = new int[] { 1, 2, 3, 4, 5 };
    	int[] ans = new int[] {5, 4, 3, 2, 1};
    	
    	ListNode ld = ListNode.getLinkList(nums1);
    	ListNode la = ListNode.getLinkList(ans);
    	
    	ListNode.theSameList( la, EASY_0206_REVERSE_LINKED_LIST.reverseList(ld) );
    	
    	
    	
    }
    
   
   
}
