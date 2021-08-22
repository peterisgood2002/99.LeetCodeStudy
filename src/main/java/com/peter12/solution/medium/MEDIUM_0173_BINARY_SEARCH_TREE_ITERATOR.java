package com.peter12.solution.medium;

import java.util.Stack;

import com.peter12.solution.data.TreeNode;

public class MEDIUM_0173_BINARY_SEARCH_TREE_ITERATOR {
	private Stack<TreeNode> stack = new Stack<TreeNode>();
	private TreeNode current;
	public MEDIUM_0173_BINARY_SEARCH_TREE_ITERATOR(TreeNode root) {
		current = root;
	}

	public int next() {

		while( current != null ) {
			stack.push( current );
			current = current.left;
		}

		current = stack.pop();
		int result = current.val;

		current = current.right;

		return result;

	}

	public boolean hasNext() {
		return (!stack.isEmpty() || current != null );
	}
}
