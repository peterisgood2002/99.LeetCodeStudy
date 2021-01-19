package com.peter12.solution.easy;

import com.peter12.solution.data.ListNode;

public class EASY_0203_REMOVE_LINKED_LIST_ELEMENTS {
	public static ListNode removeElements(ListNode head, int val) {
		ListNode result = head;
		
		ListNode current = result;
		ListNode pre = null;
		while( current != null ) {
			if( current.val != val) {
				pre = current;
				current = current.next;
				
			} else {
				if( current == head ) {
					result = current.next;
					current = current.next;
					
				} else {
					pre.next = current.next;
					current.next = null;
					current = pre.next;
				}
				
			}
			
			
			
		}
		
		
		return result;
	}
}
