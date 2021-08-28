package com.peter12.solution.easy;

import com.peter12.solution.data.TreeNode;

public class EASY_0572_SUBTREE_OF_ANOTHER_TREE {
	public boolean isSubtree(TreeNode s, TreeNode t) {

		if( s == null ) {
			return false;
		}

		if( isTheSame(s, t ) ) {
			return true;
		}

		return isSubtree(s.left, t) || isSubtree( s.right, t);
	}

	public boolean isTheSame( TreeNode s, TreeNode t ) {
		if( s == null && t == null ) {
			return true;
		} else if( s == null || t == null ) {
			return false;
		} 

		if( s.val != t.val ) {
			return false;
		}

		boolean left = isTheSame( s.left, t.left);
		boolean right = isTheSame( s.right, t.right);

		return left & right;
	}
}
