package com.peter12.solution.medium;

import com.peter12.solution.data.TreeNode;

public class MEDIUM_1302_DEEPEST_LEAVES_SUM {
	public int deepestLeavesSum(TreeNode root) {

		int depth = getDepth( root);

		System.out.println("Depth = " + depth);
		return deepestLeavesSum(0, depth, root);

	}

	public int getDepth( TreeNode root ) {
		if( root == null ) {
			return 0;
		}

		int left = getDepth( root.left);
		int right = getDepth( root.right );

		return Math.max(left, right) + 1;

	}

	public int deepestLeavesSum( int level, int depth, TreeNode root ) {
		if( root == null ) {
			return 0;
		}

		if( level == depth - 1) {
			return root.val;
		}

		int left = deepestLeavesSum(level + 1, depth, root.left);
		int right = deepestLeavesSum( level + 1, depth, root.right);

		return left + right;
	}
}
