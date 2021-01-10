package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.ListNode;
import com.peter12.solution.easy.EASY_0020_VALID_PARENTHESES;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class EASY_0083_REMOVE_DUPLICATES_FROM_SORTED_LIST_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0083_REMOVE_DUPLICATES_FROM_SORTED_LIST_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0083_REMOVE_DUPLICATES_FROM_SORTED_LIST_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	int[] d1 = new int[] {1, 1, 2};
    	int[] answer = new int[] {1, 2};
    	
    	ListNode ld1 = ListNode.getLinkList(d1);
    	ListNode la = ListNode.getLinkList(answer);
    	
    	Assert.assertTrue( ListNode.theSameList(EASY_0083_REMOVE_DUPLICATES_FROM_SORTED_LIST.deleteDuplicates(ld1), la));
    	
    	d1 = new int[] {1, 1, 2, 3, 3};
    	answer = new int[] {1, 2, 3};
    	
    	ld1 = ListNode.getLinkList(d1);
    	la = ListNode.getLinkList(answer);
    	
    	Assert.assertTrue( ListNode.theSameList(EASY_0083_REMOVE_DUPLICATES_FROM_SORTED_LIST.deleteDuplicates(ld1), la));
    	
    	
    
    }
    
   
}
