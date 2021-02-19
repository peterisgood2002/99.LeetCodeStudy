package com.peter12.solution.medium;

import java.util.ArrayDeque;
import java.util.Deque;

import com.peter12.solution.data.TreeNode;

public class MEDIUM_0106_CONSTRUCT_BINARY_TREE_FROM_INORDER_AND_POSTORDER_TRAVERSAL {
	public static TreeNode buildTree(int[] inorder, int[] postorder) {

		Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
		
		TreeNode root = null;
		TreeNode mostLeft = null;
		int iIndex = inorder.length - 1;
		for( int i = postorder.length - 1; i >= 0; i-- ) {
			int val = postorder[i];
			
			TreeNode node = new TreeNode(val);
			if( root == null ) {
				root = node;
			}
			
			buildLink( node, mostLeft, stack);
			
			stack.push(node);
			
			if( val == inorder[iIndex] ) {
				//Find mostLeft
				while( !stack.isEmpty() && inorder[iIndex] == stack.peek().val ) {
					mostLeft = stack.poll();
					val = mostLeft.val;
					iIndex--;
				}
				
				if( mostLeft != null ) {
					stack.push(mostLeft);
				} 
			}
			
		}
		
		return root;

	}

	public static void buildLink( TreeNode node, TreeNode mostLeft, Deque<TreeNode> stack) {
		if( !stack.isEmpty() ) {
			TreeNode parent = stack.peek();
			
			if( mostLeft != null && parent.val == mostLeft.val ) {
				parent.left = node;
				stack.poll();
			} else {
				parent.right = node;
				
			}
						
		}
		
	}
	
}
