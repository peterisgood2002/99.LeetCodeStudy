package com.peter12.solution.medium;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

import com.peter12.solution.data.TreeNode;
import com.peter12.solution.util.Util;

public class MEDIUM_0105_CONSTRUCT_BINARY_TREE_FROM_PREORDER_AND_INORDER_TRAVERSAL {

	public static TreeNode buildTree(int[] preorder, int[] inorder) {

		/*
		 * Solution: https://www.geeksforgeeks.org/construct-tree-from-given-inorder-and-preorder-traversal/
		 * InOrder traversal is Left-Root-Right and PreOrder traversal is Root-Left-Right. Also, 
		 * first node in the PreOrder traversal is always the root node and 
		 * the first node in the InOrder traversal is the leftmost node in the tree.

           Maintain two data-structures : 
           1. Stack: store the path we visited while traversing PreOrder array) 
           2. Set: maintain the node in which the next right subtree is expected).
		 * */

		/*
		 *            3 
		 *      9         20       
		 *    8   10    15   7         
		 * Preorder = [3, 9, 8, 10, 20 ,15, 7]
		 * Inorder  = [8, 9, 10, 3, 15, 20, 7]
		 *  node = 8
		 * Stack = [3 9 8]  ==> [3 9]
		 * mostRight= []       ==> [9]
		 *  node = 10
		 * Stack = [3 9]
		 * topLeft= [9]
		 * 
		 * 
		 * */

		TreeNode root = null;
		TreeNode mostRight = null;
		Deque<TreeNode> stack = new ArrayDeque<TreeNode>();

		int iIndex = 0;

		for( int i = 0; i < preorder.length; i++ ) {

			int val = preorder[i];
			//Add node until we find out inorder[index] == value
			TreeNode node = new TreeNode(val);
			if( root == null ) {
				root = node;
			}


			buildLink(node, mostRight, stack);

			stack.push(node);

			if( iIndex < inorder.length && inorder[iIndex] == val ) {
				
				while( iIndex < inorder.length && stack.size() > 0 && /*sneak the stack first*/stack.peek().val == inorder[iIndex] ) {
					mostRight = stack.pop();
					val = mostRight.val;
					iIndex++;
				}


				if( mostRight != null  ) {
					stack.push(mostRight);
				} 
			}
			
		}

		return root;
	}

	public static void buildLink(TreeNode node, TreeNode mostRight, Deque<TreeNode> stack) {
		if( stack.isEmpty() == false) {
			TreeNode parent = stack.peek();

			if( mostRight != null && mostRight.val == parent.val ) {
				parent.right = node;
				stack.pop(); // Remove the stack because the parent has no child to add 
			} else {
				parent.left = node;

			}
		}
	}

}
