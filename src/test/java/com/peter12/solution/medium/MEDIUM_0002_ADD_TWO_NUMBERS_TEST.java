package com.peter12.solution.medium;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.ListNode;
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
public class MEDIUM_0002_ADD_TWO_NUMBERS_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MEDIUM_0002_ADD_TWO_NUMBERS_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( MEDIUM_0002_ADD_TWO_NUMBERS_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	int[] num1 = new int[] {2, 4 ,9};
    	int[] num2 = new int[] {5, 6, 4, 9};
    	int[] ans = new int[] {7, 0, 4, 0, 1 };
    	ListNode ln1 = ListNode.getLinkList(num1);
    	ListNode ln2 = ListNode.getLinkList(num2);
    	ListNode la = ListNode.getLinkList(ans);
    	ListNode result = MEDIUM_0002_ADD_TWO_NUMBERS.addTwoNumbers(ln1, ln2);
    	
    	ListNode.theSameList(la, result);
    	
    	
    	num1 = new int[] {2, 4, 3};
    	num2 = new int[] {5, 6, 4};
    	ans = new int[] {7, 0, 8 };
    	ln1 = ListNode.getLinkList(num1);
    	ln2 = ListNode.getLinkList(num2);
    	la = ListNode.getLinkList(ans);
    	result = MEDIUM_0002_ADD_TWO_NUMBERS.addTwoNumbers(ln1, ln2);
    	
    	ListNode.theSameList(la, result);
    	
    	
    	num1 = new int[] {9, 9, 9, 9, 9, 9, 9};
    	num2 = new int[] {9, 9, 9, 9};
    	ans = new int[] { 8, 9, 9, 9, 0, 0, 0, 1 };
    	ln1 = ListNode.getLinkList(num1);
    	ln2 = ListNode.getLinkList(num2);
    	la = ListNode.getLinkList(ans);
    	result = MEDIUM_0002_ADD_TWO_NUMBERS.addTwoNumbers(ln1, ln2);
    	
    	ListNode.theSameList(la, result);
    	
    	
    	
    }
  
   
    
   
}
