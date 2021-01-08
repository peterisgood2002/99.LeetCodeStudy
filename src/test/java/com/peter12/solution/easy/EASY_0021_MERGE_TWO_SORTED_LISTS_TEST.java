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
public class EASY_0021_MERGE_TWO_SORTED_LISTS_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0021_MERGE_TWO_SORTED_LISTS_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0021_MERGE_TWO_SORTED_LISTS_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	int[] d1 = new int[] {1, 2, 4};
    	int[] d2 = new int[] {1, 3, 4};
    	int[] answer = new int[] {1,1,2,3,4,4};
    	
    	testResult(d1, d2, answer);
    	
    	d1 = null;
    	d2 = new int[] {0};
    	answer = new int[] {0};
    	
    	testResult(d1, d2, answer);
    	
    	
    	
    }
    
    
    public static void testResult(int[] d1, int[] d2, int[] answer) {
    	ListNode lista = getLinkList(answer);
    	ListNode list1 = getLinkList(d1);
    	ListNode list2 = getLinkList(d2);
    	
    	
    	ListNode result = EASY_0021_MERGE_TWO_SORTED_LISTS.mergeTwoLists(list1, list2);
    	
    	Assert.assertTrue( theSameList(result, lista) );
    }
    public static ListNode getLinkList(int[] data) {
    	ListNode result = null;
    	
    	if( data == null ) {
    		return result;
    	}
    	
    	for( int i = data.length - 1; i >= 0; i-- ) {
    		ListNode pre = new ListNode(data[i], result);
    		
    		result = pre;
    		
    	}
    	
    	return result;
    }
    
    public static boolean theSameList(ListNode l1, ListNode l2) {
    	int size1 = getListSize(l1);
    	int size2 = getListSize(l1);
    	
    	if( size1 != size2 ) {
    		return false;
    	} else {
    		
    		ListNode point1 = l1;
    		ListNode point2 = l2;
    		while ( point1 != null ) {
    			if( point1.val != point2.val ) {
    				return false;
    			} else {
    				point1 = point1.next;
    				point2 = point2.next;
    			}
    		}
    		
    		return true;
    	}
    	
    }
    
    public static int getListSize(ListNode data) {
		int result = 0;
		
		while ( data != null ) {
			result++;
			
			data = data.next;
		}
		
		return result;
	}
    
}
