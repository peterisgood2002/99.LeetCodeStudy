package com.peter12.solution.easy;

import com.peter12.solution.data.TreeNode;

public class EASY_0110_BALANCED_BINARY_TREE {
	public static boolean isBalanced(TreeNode root) {
		
		if( root == null ) {
			return true;
		}
		

		int leftLevel = level(root.left);
		int rightLevel = level( root.right);
		
		if( Math.abs(leftLevel - rightLevel )  > 1) {
			return false;
		} else {
			return true;
		}
		
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
