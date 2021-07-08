package com.peter12.solution.medium;

import com.peter12.solution.data.ListNode;

public class MEDIUM_0142_LINKED_LIST_CYCLE_II {
	public ListNode detectCycle(ListNode head) {

		ListNode rabbit = head;
		ListNode turtle = head;

		ListNode circle = null;
		while( rabbit != null && turtle != null ) {

			turtle = turtle.next;
			if( rabbit.next != null ) {
				rabbit = rabbit.next.next;
			} else {
				rabbit = null;
			}

			if( turtle == rabbit ) {
				circle = rabbit;
				break;
			}

		}


		if( circle == null ) {
			return null;
		} else {


			ListNode current = head;
			while( current != circle ) {
				current = current.next;
				circle = circle.next;
			}

			return current;

		}

	}
}
