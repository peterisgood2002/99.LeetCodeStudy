package com.peter12.solution.easy;

import com.peter12.solution.data.ListNode;

public class EASY_0083_REMOVE_DUPLICATES_FROM_SORTED_LIST {
	public static ListNode deleteDuplicates(ListNode head) {
		ListNode point = head;
		
		int value = point.val;
		
		while( point.next != null ) {
			
			ListNode next = point.next;
			
			if( next.val == value ) {
				point.next = next.next;
				point = next.next;
				
			} else {
				value = next.val;
				point.next = next;
			}
		}
		
		return head;
	}
}
