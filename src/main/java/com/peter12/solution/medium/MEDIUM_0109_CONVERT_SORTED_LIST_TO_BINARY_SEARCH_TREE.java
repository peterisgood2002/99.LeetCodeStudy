package com.peter12.solution.medium;

import com.peter12.solution.data.ListNode;
import com.peter12.solution.data.TreeNode;

public class MEDIUM_0109_CONVERT_SORTED_LIST_TO_BINARY_SEARCH_TREE {
	public static TreeNode sortedListToBST(ListNode head) {
		
		TreeNode root = sortedListToBST(head, null);
		
		return root;
		
	}
	
	public static TreeNode sortedListToBST(ListNode head, ListNode end) {
				
		if( head == end ) {
			return null;
		}
		if(  head.next == end ) {
			return new TreeNode( head.val );
		}
		
		ListNode middle = findMiddle( head, end);
		
		TreeNode root = new TreeNode( middle.val);
		
		root.left = sortedListToBST(head, middle);
		root.right = sortedListToBST(middle.next, end);
		
		return root;
		
	}
	
	public static ListNode findMiddle( ListNode begin,  ListNode end) {
			
		ListNode slow = begin;
		ListNode fast = begin;
		
		while( fast != end && fast.next != end ) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}
}
