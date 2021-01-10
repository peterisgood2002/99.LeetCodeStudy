package com.peter12.solution.easy;

import com.peter12.solution.data.TreeNode;

public class EASY_0108_CONVERT_SORTED_ARRAY_TO_BINARY_SEARCH_TREE {
	public static TreeNode sortedArrayToBST(int[] nums) {
		/*
		 * Because the array is sorted, we divide and conquer.
		 * See the Link: https://zxi.mytechroad.com/blog/tree/leetcode-108-convert-sorted-array-to-binary-search-tree/
		 * 
		 * */
		
		TreeNode result = buildBST(0, nums.length - 1, nums);
		
		return result;
		
	}
	
	public static TreeNode buildBST(int begin, int end, int[] data) {
		
		if( begin > end ) {
			return null;
		}
		//Find the middle of the array as the root
		int middle = ( begin + end ) / 2;
		
		TreeNode root = new TreeNode(data[middle]);
		
		root.left = buildBST(begin, middle - 1, data);
		root.right = buildBST(middle + 1, end, data);
		
		return root;
		
	}
	
	
}
