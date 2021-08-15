package com.peter12.solution.medium;

import com.peter12.solution.data.ListNode;
import com.peter12.solution.easy.EASY_0021_MERGE_TWO_SORTED_LISTS;

public class MEDIUM_0148_SORT_LIST {
	public ListNode sortList(ListNode head) {

		return topDown(head);
	}

	/*Time: O(nlogn) and Space: O(logn)*/
	public ListNode topDown(ListNode head) {
		if( head == null || head.next == null ) {
			return head;
		}

		//Find half
		ListNode half = findHalf( head );

		ListNode second =  sortList( half.next);
		half.next = null;
		ListNode first = sortList( head);


		ListNode result = mergeTwoSort( first, second);
		return result;
	}

	public ListNode findHalf( ListNode head) {
		ListNode half = head;
		ListNode next = head.next.next;
		while( next != null && next.next != null) {

			half = half.next;
			next = next.next.next;
		}

		return half;
	}
	public ListNode mergeTwoSort( ListNode first, ListNode second ) {


		if( first == null) {
			return second;
		}

		if( second == null ) {
			return first;
		}

		if( first.val < second.val ) {
			first.next = mergeTwoSort( first.next, second);
			return first;
		} else if ( first.val > second.val ) {
			second.next = mergeTwoSort(first, second.next);
			return second;
		} else {
			ListNode other = mergeTwoSort( first.next, second.next);
			first.next = second;
			second.next = other;
			return first;
		}
	}
}
