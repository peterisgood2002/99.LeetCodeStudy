package com.peter12.solution.easy;

import com.peter12.solution.data.TreeNode;

public class EASY_0108_CONVERT_SORTED_ARRAY_TO_BINARY_SEARCH_TREE {
	public static TreeNode sortedArrayToBST(int[] nums) {
		
		if( nums.length == 0 ) {
			return null;
		}
		
		TreeNode root = new TreeNode( nums[0] );
	
		int i = 1;
		while( i < nums.length ) {
			TreeNode newNode = new TreeNode( nums[i] );
			
			//1. Add node
			
			root = insertNode(root, newNode);
			
	
			
			i++;
		}
		
		return root;
	}
	
	public static TreeNode insertNode(TreeNode root, TreeNode node) {
		
		
		boolean moveRight = root.val < node.val;
		
		TreeNode current = root;
		TreeNode next = moveRight? current.right: current.left;
		
		while ( next != null ) {
			current = next; 
			next = moveRight? current.right: current.left;
		}
		
		if ( moveRight) {
			current.right = node;
		} else {
			current.left = node;
		}
		
		root = balance(root);
		return root;
		
	}
	
	public static TreeNode balance( TreeNode root ) {
		int balance = isBlanace(root);
		if( -1 <= balance && balance <= 1 ) {
			return root;//Balance
		}
		
		//Does not balance at all
		TreeNode moveNode = root;
		
		if(balance > 1) {
			//The depth of Left Tree is bigger than Right Tree
			root = root.left;
			moveNode.left = null;
			insertNode(root, moveNode);
						
		} else {
			root = root.right;
			moveNode.right = null;
			insertNode(root, moveNode);
			
					
		}
		
		return root;
	}
	
	public static int isBlanace( TreeNode root ) {
		
		int leftLevel = level(root.left);
		int rightLevel = level( root.right);
		
		return leftLevel - rightLevel;
	
	}
	
	public static int level( TreeNode root) {
		if( root == null ) {
			return 0;
		}
		
		int leftLevel = level( root.left );
		int rightLevel = level( root.right );
		
		if( leftLevel < rightLevel ) {
			return rightLevel + 1;
		} else {
			return leftLevel + 1;
		}
	}
}
