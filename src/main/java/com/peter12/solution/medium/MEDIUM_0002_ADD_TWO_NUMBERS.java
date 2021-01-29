package com.peter12.solution.medium;

import com.peter12.solution.data.ListNode;

public class MEDIUM_0002_ADD_TWO_NUMBERS {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	
		ListNode result = new ListNode();
		
		ListNode current = result;
		//Add l1
		ListNode c = l1;
		while( c != null ) {
			current.val += c.val;
			if( c.next != null ) {
				current.next = new ListNode();
			}
			
			current = current.next;
			c = c.next;
		}
		
		//Add l2
		current = result;
		c = l2;
		while( c != null ) {
			if( current == null ) {
				current = new ListNode(c.val);
				
			} else {
				current.val += c.val;
			}
			
			if( c.next != null && current.next == null) {
				current.next = new ListNode();
			}
			
			current = current.next;
			c = c.next;
		}
		
		
		//Carry
		current = result;
		while( current != null ) {
			if( current.val >= 10 ) {
				current.val %= 10;
				if( current.next != null ) {
					current.next.val += 1;
				} else {
					current.next = new ListNode(1);
				}
			}
			
			current = current.next;
		}
		
		
		return result;
	
		
	}
}
