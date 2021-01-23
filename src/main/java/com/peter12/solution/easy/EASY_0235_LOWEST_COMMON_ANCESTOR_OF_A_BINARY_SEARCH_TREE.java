package com.peter12.solution.easy;

import com.peter12.solution.data.TreeNode;

public class EASY_0235_LOWEST_COMMON_ANCESTOR_OF_A_BINARY_SEARCH_TREE {
	public static TreeNode  lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if( root == null ) {
			 return root;
		}
		
		if( p.val > q.val ) {
			
			return lowestCommonAncestor( root, q, p);
		}
		
		// P is always smaller than q
		if( p.val <= root.val && root.val <= q.val) {
			//P -- ROOT -- Q
			return root;
		}
		
		if( root.val < p.val ) {
			//ROOT -- P -- Q
			//Search right because root is the smallest value
			return lowestCommonAncestor(root.right, p, q);
		}
		
		
		//P -- Q -- ROOT
		return lowestCommonAncestor(root.left, p, q);

	}
	
	
}
