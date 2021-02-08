package com.peter12.solution.medium;

import com.peter12.solution.data.ListNode;

public class MEDIUM_0092_REVERSE_LINKED_LIST_II {
	public static ListNode reverseBetween(ListNode head, int m, int n) {
		
		if( head == null || head.next == null ) {
			return head;
		}
			
		/**
		 * m = 2 n = 4
		 *   S  
		 * 1 2 3 4 5
		 * 
		 */
		ListNode current = head;
		ListNode pre = null;
		ListNode start = null;
		
		int i = 1;
		while( i < n ) {
			
			if( i < m ) {
				pre = current;
				current = current.next;
			} else if( i == m ) {
				start = current;
			}
			
			if( m <= i  ) {
				/**
				 * 
				 * P S C N  
		         * 1 2 3 4 5
				 */
				ListNode next = current.next;
				
				if( next != null ) {
					if( start == head ) {
						head = current.next;
						
					}
				
					//SWAP
					current.next = next.next;
					next.next = start;
					
					if( pre != null ) {
						pre.next = next;
					}
					
					start = next;
					
					
				}
			}
		
			i++;
		}
		
		return head;
		
	}
}
