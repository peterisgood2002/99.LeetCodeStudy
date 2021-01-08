package com.peter12.solution.easy;

import com.peter12.solution.data.ListNode;

public class EASY_0021_MERGE_TWO_SORTED_LISTS {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		if( l1 == null ) {
			return l2;
			
		}
	
		if( l2 == null ) {
			return l1;
		}
		
		if( l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			
			return l1;
		} else if( l1.val > l2.val){
			l2.next = mergeTwoLists(l1, l2.next);
			
			return l2;
		} else {
			
			l2.next =  mergeTwoLists(l1.next, l2.next);
			
			l1.next = l2;
			ListNode result = l1;
			return result;
		}
	}
	
}
