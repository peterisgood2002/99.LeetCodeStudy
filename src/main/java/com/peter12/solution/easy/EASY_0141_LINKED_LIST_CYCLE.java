package com.peter12.solution.easy;

import com.peter12.solution.data.ListNode;

public class EASY_0141_LINKED_LIST_CYCLE {
	public static boolean hasCycle(ListNode head) {
		ListNode turtle = head;
		ListNode rabbit = head;
		
		do {
			if( turtle == null || rabbit == null || rabbit.next == null) {
				return false;
			}
			
			turtle = turtle.next; // turtle move one step
			
			rabbit = rabbit.next.next; // rabbit move two steps
			
		} while( turtle != rabbit);
		
		return true;
	}
	

}
