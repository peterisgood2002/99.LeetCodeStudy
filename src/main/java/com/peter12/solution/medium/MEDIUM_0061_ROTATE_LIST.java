package com.peter12.solution.medium;

import com.peter12.solution.data.ListNode;

public class MEDIUM_0061_ROTATE_LIST {
	public static ListNode rotateRight(ListNode head, int k) {
		
		if( head == null ) {
			return head;
		}
		
		
		int size = 0;
		ListNode current = head;
		
		while( current != null ) {
			size++;
			current = current.next;
		}
		
		int rotate = k % size;
		
		if( rotate == 0 ) {
			return head;
			
		}
		
		// Find node
		ListNode newLastElement = head;
		for( int i = 0; i < (size - 1 ) - rotate; i++) {
			
			newLastElement = newLastElement.next;
		}
		
		ListNode newHead = (newLastElement.next != null)? newLastElement.next : head;
		
		ListNode lastElement = newHead;
		while ( lastElement.next != null ) {
			lastElement = lastElement.next;
		}
		
		//Connect node
		lastElement.next = head;
		newLastElement.next = null;
		head = newHead;
		
		
		
		return head;
		
	}
}
