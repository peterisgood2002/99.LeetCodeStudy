package com.peter12.solution.easy;

import com.peter12.solution.data.ListNode;

public class EASY_0160_INTERSECTION_OF_TWO_LINKED_LISTS {
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode currentA = headA;
		
		while( currentA != null ) {
			ListNode currentB  = headB;
			
			while ( currentB != currentA && currentB != null ) {
				currentB = currentB.next;
			}
			
			if( currentB != null ) {
				return currentB;
			}
			
			currentA = currentA.next;
		}
		
		return currentA;
	}
}
