package com.peter12.solution.easy;

import com.peter12.solution.data.ListNode;

public class EASY_0083_REMOVE_DUPLICATES_FROM_SORTED_LIST {
	public static ListNode deleteDuplicates(ListNode head) {
		if( head == null ) {
			return head;
		}
		
		ListNode current = head;
		while( current != null  ) {
			
			ListNode next = current.next;
			if( next != null ) {
				if( next.val == current.val ) {
					current.next = next.next;
					
					next.next = null;// disconnect the link
				} else {
					//move current because value is different.
					current = current.next;
				}
			} else {
				break;
			}
		
		}
		
		return head;
	}
}
