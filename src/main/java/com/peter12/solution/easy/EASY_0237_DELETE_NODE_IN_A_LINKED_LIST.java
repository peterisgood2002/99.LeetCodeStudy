package com.peter12.solution.easy;

import com.peter12.solution.data.ListNode;

public class EASY_0237_DELETE_NODE_IN_A_LINKED_LIST {
	public static void deleteNode(ListNode node) {
		
		/*
		 * Solution: https://leetcode.com/problems/delete-node-in-a-linked-list/
		 * */
		ListNode current = node;
		ListNode pre = null;
		while( current != null ) {
			
			ListNode next = current.next;
			if( next != null) {
				//Move value
				current.val = next.val;
				pre = current; 
				
			} else {
				pre.next = null;
			}
			
			current = current.next;
		
		}
	}
}
