package com.peter12.solution.medium;

import com.peter12.solution.data.ListNode;

public class MEDIUM_0024_SWAP_NODES_IN_PAIRS {
	public static ListNode swapPairs(ListNode head) {
		
		ListNode current = head;
		ListNode preCurrent = null;
		while( current != null && current.next != null ) {
			ListNode next = current.next;
			
			if( preCurrent == null) {
				head = next;
			} else {
				preCurrent.next = next;
			}
			
			current.next = next.next;
			next.next = current;
			
			preCurrent = current;
			current = current.next;
			
		}
		
		
		return head;
	}
}
