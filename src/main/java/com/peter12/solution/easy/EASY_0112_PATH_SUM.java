package com.peter12.solution.easy;

import com.peter12.solution.data.TreeNode;

public class EASY_0112_PATH_SUM {
	public static boolean hasPathSum(TreeNode root, int sum) {
		if( root == null ) {
			return false;
			
		}
		
		int diff = sum - root.val;
		if( root.left == null && root.right == null ) {
			return diff == 0;
		}
		
		
		
		boolean inLeft = hasPathSum(root.left, diff);
		
		boolean inRight = hasPathSum(root.right, diff);
		
		return  inLeft || inRight;
	}
}
