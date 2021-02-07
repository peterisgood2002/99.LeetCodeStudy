package com.peter12.solution.medium;

import com.peter12.solution.data.ListNode;

public class MEDIUM_0086_PARTITION_LIST {
	public static ListNode partition(ListNode head, int x) {
		
		ListNode current = head;
		ListNode pre = null;
		
		while( current != null ) {
			if( current.val < x) {
				pre = current;
				current = current.next;
			} else {
				ListNode last = getLastNodeGreaterThan(x, current);
				
				
				ListNode next = last.next;
				
				if( next == null ) {
					break;
				}
				if( next != null ) {
					
					last.next = next.next;
					
					if( current == head ) {
						head = next;
						next.next = current;
						
					} else {
						next.next = current;
						
						if( pre != null ) {
							pre.next = next;
						}
								
					}
					
					current = next;
				}
				
			}
			
		}
		
		return head;
	}
	
	public static ListNode getLastNodeGreaterThan(int x, ListNode head) {
		
		while( head.next != null &&  head.next.val >= x ) {
			head = head.next;
			
		}
		
		return head;
	}
}
