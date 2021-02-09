package com.peter12.solution.medium;

import com.peter12.solution.data.TreeNode;
import com.peter12.solution.util.Util;

public class MEDIUM_0105_CONSTRUCT_BINARY_TREE_FROM_PREORDER_AND_INORDER_TRAVERSAL {

	public static TreeNode buildTree(int[] preorder, int[] inorder) {
		
		if( preorder.length == 0 && inorder.length == 0 ) {
			return null;
		}
		
		TreeNode result = buildTreeBasedOnPreOrder(0, preorder.length - 1, preorder, 0, inorder.length - 1, inorder);
		return result;
	}
	
	
	public static TreeNode buildTreeBasedOnPreOrder( int pbegin, int pend, int[] preorder, 
			                                         int ibegin, int iend, int[] inorder) {
		
		if( pbegin > pend ) {
			return null;
		}
		
		int value = preorder[pbegin];
		
		TreeNode result = new TreeNode(value);
				
		int index = search(value, inorder);// Find the index of the value
		
		result.left = buildTreeBasedOnInOrder(ibegin, index - 1, inorder, pbegin + 1, pend, preorder);
		result.right = buildTreeBasedOnInOrder( index + 1, iend, inorder, pbegin + 1, pend, preorder);
		
		return result;
			
	}
	
	public static TreeNode buildTreeBasedOnInOrder( int ibegin, int iend, int[] inorder, 
			                                        int pbebin, int pend, int[]  preorder) {
		if( ibegin > iend ) {
			return null;
		}
		
		int preBegin = Integer.MAX_VALUE;
		int preEnd = Integer.MIN_VALUE;
		
		for( int i = ibegin; i <= iend; i++ ) {
			int index = search( inorder[i], preorder );
			
			if( index < preBegin ) {
				preBegin = index;
			}
			
			if( index > preEnd ) {
				preEnd = index;
			}
		}
		
		if( preBegin == preEnd ) {
			return new TreeNode( preorder[preBegin] );
		} else {
			return buildTreeBasedOnPreOrder(preBegin, preEnd, preorder, ibegin, iend, inorder);
		}
		
	}
	
	public static int search( int target, int[] nums) {
		
		for( int i = 0; i < nums.length; i++ ) {
			if( nums[i] == target) {
				return i;
			}
		}
		
		return -1;
	}
}
