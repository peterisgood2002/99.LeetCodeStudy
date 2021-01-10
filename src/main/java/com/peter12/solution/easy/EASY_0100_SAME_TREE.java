package com.peter12.solution.easy;

import com.peter12.solution.data.TreeNode;

public class EASY_0100_SAME_TREE {
	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if( p == null && q == null ) {
			return true;
		} 
		
		if( p != null && q != null ) {
			if( p.val != q.val ) {
				 return false;
			}
			
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		}
		
		
		return false;
	}
}
