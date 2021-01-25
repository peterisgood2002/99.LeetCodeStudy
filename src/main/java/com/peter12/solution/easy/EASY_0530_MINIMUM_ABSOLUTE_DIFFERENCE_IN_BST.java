package com.peter12.solution.easy;

import com.peter12.solution.data.TreeNode;

public class EASY_0530_MINIMUM_ABSOLUTE_DIFFERENCE_IN_BST {
	public static int getMinimumDifference(TreeNode root) {
		if( root == null ) {
			return Integer.MAX_VALUE;
		}
		if( root.left == null && root.right == null ) {
			return Integer.MAX_VALUE;
		}
		
		int[] min = new int[4];
		for( int i = 0 ; i < min.length; i++ ) {
			min[i] = Integer.MAX_VALUE;
		}
		//Find Sub Tree
		min[0] = getMinimumDifference( root.left);
		min[1] = getMinimumDifference( root.right);
		
		//Find root
		if( root.left != null ) {
			
			min[2] = root.val - findTheValueOfTheLeaf( false, root.left);
		}
		
		if( root.right != null ) {
			
			min[3] = findTheValueOfTheLeaf(true, root.right) - root.val;
		}
		
		int result = Integer.MAX_VALUE;
		for( int i = 0; i < min.length; i++ ) {
			if( min[i] < result) {
				result = min[i];
			}
		}
		
		return result;
	}
	
	public static int findTheValueOfTheLeaf(boolean isLeftDirection, TreeNode root) {
		
		TreeNode current = root;
		TreeNode next = (isLeftDirection) ? current.left : current.right;
		
		while( next != null ) {
			current = next;
			next = (isLeftDirection) ? current.left : current.right;
		}
		
		return current.val;
	}
	
	
}
