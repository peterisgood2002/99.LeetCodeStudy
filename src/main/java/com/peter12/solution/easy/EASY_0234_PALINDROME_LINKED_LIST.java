package com.peter12.solution.easy;

import com.peter12.solution.data.ListNode;

public class EASY_0234_PALINDROME_LINKED_LIST {
	public static boolean isPalindrome(ListNode head) {
		ListNode current = head;
		ListNode pre = null;
		ListNode next = current.next;
		/*
		 * 1. Based on 1 -> 2 -> 2 -> 1
		 *    Create two list
		 *    current -> 2 -> 1
		 *    next    -> 2 -> 1
		 */
		while( current != null && next != null  ) {
			
			if( current.val != next.val ) {
				//Revert Current
				current.next = pre;
				pre = current;
				current = next;
			} else {
				current.next = pre;
				break;
			}
			
			
			//Move next
			next = next.next;
		}
		
		/*
		 * 2. Compare current and next also revert current link list 
		 *
		 * */
		boolean result = ( current != null && next != null);
		ListNode preNext = next;
		if( result == true) {
			
			while( current != null && next != null ) {
				if( current.val == next.val ) {
					//Revert current linklist
					pre = current.next;
					current.next = preNext;
					preNext = current;
					current = pre;
					
					next = next.next;
				} else {
					result = false;// We got the result
					break;
					
				}
			}

		}
				
		// 3. Revert the rest of current list
		while( pre != null ) {
			//Construct pre and current
			preNext = pre.next;
			
			pre.next = current;
			current = pre;
			//Move pre
			pre = preNext;
		}
		
		return result;
	}
	
}
