package com.peter12.solution.easy;

import com.peter12.solution.data.TreeNode;

public class EASY_0112_PATH_SUM {
	public static boolean hasPathSum(TreeNode root, int sum) {
		if( root == null ) {
			if( sum == 0 ) {
				return true;
			} else {
				return false;
			}
			
		}
		
		int diff = sum - root.val;
		
		boolean inLeft = hasPathSum(root.left, diff);
		
		boolean inRight = hasPathSum(root.right, diff);;
		
		
		if( inLeft || inRight ) {
			return true;
		} else {
			return false;
		}
	}
}
