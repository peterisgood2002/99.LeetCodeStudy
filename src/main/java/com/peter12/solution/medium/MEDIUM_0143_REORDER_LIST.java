package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.List;

import com.peter12.solution.data.ListNode;

public class MEDIUM_0143_REORDER_LIST {
	public void reorderList(ListNode head) {
		List<ListNode> list = new ArrayList<ListNode>();

		ListNode current = head;
		while( current != null ) {
			list.add( current);

			current = current.next;
		}

		int i = 0;
		int j = list.size() - 1;

		while( i < j ) {
			current = list.get(i);
			ListNode next = current.next;

			ListNode newNext = list.get(j);

			current.next = newNext;
			newNext.next = next;

			i++;
			j--;
		}

		list.get(i).next = null;
	}
}
