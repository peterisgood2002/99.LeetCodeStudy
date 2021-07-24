package com.peter12.solution.medium;

import com.peter12.solution.data.TreeNode;

public class MEDIUM_0654_MAXIMUM_BINARY_TREE {
	public TreeNode constructMaximumBinaryTree(int[] nums) {

		return constructMaximumBinaryTree(0, nums.length - 1, nums);
	}

	public TreeNode constructMaximumBinaryTree(int begin, int end, int[] nums) {

		if( begin > end ) {
			return null;
		}

		if( begin == end ) {
			return new TreeNode( nums[begin]);
		}

		int max = 0;
		int mi = 0;
		for( int i = begin; i <= end; i++ ) {
			if( max < nums[i] ) {
				max = nums[i];
				mi = i;
			}
		}

		TreeNode root = new TreeNode(max);
		root.left = constructMaximumBinaryTree(begin, mi - 1, nums);
		root.right = constructMaximumBinaryTree( mi+1, end, nums);

		return root;
	}
}
