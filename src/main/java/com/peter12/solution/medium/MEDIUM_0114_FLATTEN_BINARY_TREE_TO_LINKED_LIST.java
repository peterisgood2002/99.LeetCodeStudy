package com.peter12.solution.medium;

import com.peter12.solution.data.TreeNode;

public class MEDIUM_0114_FLATTEN_BINARY_TREE_TO_LINKED_LIST {
	public static void flatten(TreeNode root) {

		if( root == null ) {
			return;
		}
		
		
		TreeNode left = root.left;
		TreeNode right = root.right;
		root.left = null;
		root.right = addToRight( left, right);
		
		flatten(left);
		flatten(right);
		
		
	}
	
	public static TreeNode addToRight(TreeNode left, TreeNode right) {
		if( left == null ) {
			return right;
		}
		
		TreeNode current = left;
		while( current.right != null ) {
			current = current.right;
		}
		
		current.right = right;
		return left;
	}
}
