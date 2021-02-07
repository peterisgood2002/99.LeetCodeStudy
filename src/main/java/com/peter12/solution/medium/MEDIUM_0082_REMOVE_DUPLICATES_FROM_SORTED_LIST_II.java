package com.peter12.solution.medium;

import com.peter12.solution.data.ListNode;

public class MEDIUM_0082_REMOVE_DUPLICATES_FROM_SORTED_LIST_II {
	public static ListNode deleteDuplicates(ListNode head) {
		ListNode current = head;
		ListNode pre = null;

		while( current != null ) {
			//Find the last duplicate Node
			ListNode last = findTheLastDeplicateNode(current.val, current);

			if( current != last ) {
				if( current == head ) {
					head = last.next;
					current = head;
					
					
				} else {
					pre.next = last.next;
					current = last.next;
				}
				
				last.next = null; // Remove the link for memory released
			} else {
				//Move to the next node
				pre = current;
				current = current.next;
			}
		}


		return head;
	}

	public static ListNode findTheLastDeplicateNode(int val, ListNode head) {
		ListNode current = head;

		while( current != null && current.val == val ) {
			current = current.next;

		}

		ListNode result = head;
		while( result.next != current ) {
			result = result.next;
		}
		return result;

	}
	
	
}
