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
public class EASY_0203_REMOVE_LINKED_LIST_ELEMENTS_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0203_REMOVE_LINKED_LIST_ELEMENTS_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0203_REMOVE_LINKED_LIST_ELEMENTS_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	int[] nums = new int[] {1,1};
    	int[] ans = new int[] {1, 2, 3, 4, 5};
    	ListNode ld = ListNode.getLinkList(nums);
    	ListNode la = ListNode.getLinkList(ans);
    	
    	ListNode.theSameList(la, EASY_0203_REMOVE_LINKED_LIST_ELEMENTS.removeElements(ld, 1) );
    	
    	nums = new int[] {1, 2, 6, 3, 4, 5, 6};
    	ans = new int[] {1, 2, 3, 4, 5};
    	ld = ListNode.getLinkList(nums);
    	la = ListNode.getLinkList(ans);
    	
    	ListNode.theSameList(la, EASY_0203_REMOVE_LINKED_LIST_ELEMENTS.removeElements(ld, 6) );
    	
    	
    	
    }
    
   
   
}
