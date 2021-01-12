package com.peter12.solution.easy;

import com.peter12.solution.data.TreeNode;

public class EASY_0111_MINIMUM_DEPTH_OF_BINARY_TREE {
	public static int minDepth(TreeNode root) {
		if( root == null ) {
			return 0;
		}
		
		if( root.left == null ) {
			return minDepth(root.right) + 1;
			
		}
		
		if( root.right == null ) {
			return minDepth(root.left) + 1;
		}
		
		int leftMinDepth = minDepth(root.left);
		int rightMinDepth = minDepth( root.right);
	
		
		
		if( leftMinDepth < rightMinDepth ) {
			return leftMinDepth + 1;
		} else {
			return rightMinDepth + 1;
		}
	}
	
	
}
