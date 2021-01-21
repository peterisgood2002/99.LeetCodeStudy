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
public class EASY_0234_PALINDROME_LINKED_LIST_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0234_PALINDROME_LINKED_LIST_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0234_PALINDROME_LINKED_LIST_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	int[] nums = new int[] {1, 2, 5, 2 ,1 };
    	ListNode data = ListNode.getLinkList( nums);
    	Assert.assertTrue( EASY_0234_PALINDROME_LINKED_LIST.isPalindrome(data) );
    	
    	nums = new int[] {1, 0 , 1 };
    	data = ListNode.getLinkList( nums);
    	Assert.assertTrue( EASY_0234_PALINDROME_LINKED_LIST.isPalindrome(data) );
    	
    	
    	
    	nums = new int[] {1 };
    	data = ListNode.getLinkList( nums);
    	Assert.assertTrue( EASY_0234_PALINDROME_LINKED_LIST.isPalindrome(data) );
    	
    	nums = new int[] {1, 2, 2 ,1 };
    	data = ListNode.getLinkList( nums);
    	Assert.assertTrue( EASY_0234_PALINDROME_LINKED_LIST.isPalindrome(data) );
    	
    	nums = new int[] {1, 2 };
    	data = ListNode.getLinkList( nums);
    	
    	Assert.assertFalse( EASY_0234_PALINDROME_LINKED_LIST.isPalindrome(data) );
     	
    }
    
   
   
}
