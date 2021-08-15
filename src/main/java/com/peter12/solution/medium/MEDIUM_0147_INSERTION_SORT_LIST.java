package com.peter12.solution.medium;

import com.peter12.solution.data.ListNode;

public class MEDIUM_0147_INSERTION_SORT_LIST {
	public ListNode insertionSortList(ListNode head) {
        /*
          Solution: https://leetcode.com/problems/insertion-sort-list/solution/
        */
        ListNode result = new ListNode();
        
        ListNode current = head;
        
        while( current != null ) {
            ListNode pre = result;
            
            while( pre.next != null && pre.next.val < current.val ) {
                pre = pre.next;
            }
            
            ListNode cNext = current.next;
            
            current.next = pre.next;
            pre.next = current;
            
            
            current = cNext;
            
        }
        
        return result.next;
        
    }
}
