package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.List;

import com.peter12.solution.data.ListNode;

public class MEDIUM_0138_COPY_LIST_WITH_RANDOM_POINTER {
	public ListNode copyRandomList(ListNode head) {

		if( head == null ) {
			return null;
		}

		ListNode result = new ListNode( head.val );
		ListNode rc = result;

		ListNode current = head.next;

		List<ListNode> old = new ArrayList<ListNode>();
		old.add(head);
		List<ListNode> news = new ArrayList<ListNode>();
		news.add(result);

		while( current != null ) {
			ListNode newListNode = new ListNode( current.val );

			rc.next = newListNode;

			old.add( current );
			news.add( newListNode);

			current = current.next;
			rc = rc.next;

		}


		current = head;
		rc = result;
		while(  current != null ) {
			ListNode random = current.random;

			for(int i = 0; i < old.size(); i++ ) {
				if( random == old.get(i) ) {

					rc.random = news.get(i);    
				}
			}


			current = current.next;
			rc = rc.next;
		}



		return result;

	}
}
