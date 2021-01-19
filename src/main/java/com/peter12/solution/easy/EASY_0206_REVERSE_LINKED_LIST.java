package com.peter12.solution.easy;

import com.peter12.solution.data.ListNode;

public class EASY_0206_REVERSE_LINKED_LIST {
	
	public static ListNode reverseList(ListNode head) {
		ListNode current = head;
		ListNode pre = null;
		
		while( current != null ) {
			ListNode next = current.next;
			
			current.next = pre;
			
			pre = current;
			current = next;
		}
		
		
		return pre;
	}
}
