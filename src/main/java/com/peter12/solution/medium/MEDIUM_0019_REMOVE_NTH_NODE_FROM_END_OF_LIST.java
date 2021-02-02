package com.peter12.solution.medium;

import com.peter12.solution.data.ListNode;

public class MEDIUM_0019_REMOVE_NTH_NODE_FROM_END_OF_LIST {
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		
		int i = removeNthFromEndImpl( head, n) + 1;
		
		if( i == n ) {
			ListNode next = head.next;
			if( next != null ) {
				head.next = next.next;
			}
			
			head = next;
		} 
			
		return head;
		
		
	}
	
	public static int removeNthFromEndImpl( ListNode current, int n ) {
		if( current.next == null ) {
			return 0;
		}
		

		int i = removeNthFromEndImpl( current.next, n) + 1;
		
		
		if( i == n ) {
			//Begin to remove
			ListNode next = current.next;
			
			current.next = next.next;
			 next.next = null;
			
		}
		
		return i;
		
	}
}
