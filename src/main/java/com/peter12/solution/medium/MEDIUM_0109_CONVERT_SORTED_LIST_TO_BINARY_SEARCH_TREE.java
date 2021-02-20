package com.peter12.solution.medium;

import com.peter12.solution.data.ListNode;
import com.peter12.solution.data.TreeNode;

public class MEDIUM_0109_CONVERT_SORTED_LIST_TO_BINARY_SEARCH_TREE {
	public static TreeNode sortedListToBST(ListNode head) {
		
		if( head == null ) {
			return null;
		}
		

		int size = 0;
		ListNode current = head;
		while( current != null ) {
			size++;
			
			current = current.next;
		}
		
		TreeNode root = sortedListToBST(size, head);
		
		return root;
		
	}
	
	public static TreeNode sortedListToBST(int size, ListNode head) {
		if( size == 1 ) {
			return new TreeNode( head.val );
		}
		
		if( size == 2 ) {
			TreeNode root = new TreeNode( head.next.val );
			root.left = new TreeNode( head.val );
			
			return root;
		}
		
		ListNode current = head;
		for( int i = 0; i < size / 2; i++ ) {
			current = current.next;
		}
		
		TreeNode root = new TreeNode( current.val );
		
		root.left = sortedListToBST( size / 2, head);
		
		int rightSize = ( size % 2 == 0 )? size / 2 - 1 : size / 2;
		root.right = sortedListToBST( rightSize, current.next);
		
		return root;
	}
	
	
}
