package com.peter12.solution.easy;

import com.peter12.solution.data.TreeNode;

public class EASY_0404_SUM_OF_LEFT_LEAVES {
	public static int sumOfLeftLeaves(TreeNode root) {
		
		if( root == null ) {
			return 0;
		}
		
		int total = 0;
		if( root.left != null ) {
			TreeNode left = root.left;
			if( left.left == null && left.right == null ) {
				total += left.val;
			} else {
				total += sumOfLeftLeaves( left );
			}
		}
		
		total += sumOfLeftLeaves( root.right);
		
		return total;
	}
}
