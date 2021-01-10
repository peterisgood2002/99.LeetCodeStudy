package com.peter12.solution.easy;

import com.peter12.solution.data.TreeNode;

public class EASY_0104_MAXIMUM_DEPTH_OF_BINARY_TREE {
	public static int maxDepth(TreeNode root) {
		if( root == null ) {
			return 0;
		} 
		
		
		int left = maxDepth( root.left );
		int right = maxDepth(root.right );
		
		if( left < right ) {
			return right + 1;
		} else {
			return left + 1;
		}
	}
}
