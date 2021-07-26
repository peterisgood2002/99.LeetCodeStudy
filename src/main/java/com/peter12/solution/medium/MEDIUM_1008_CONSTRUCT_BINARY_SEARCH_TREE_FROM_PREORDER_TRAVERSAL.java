package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.List;

import com.peter12.solution.data.TreeNode;

public class MEDIUM_1008_CONSTRUCT_BINARY_SEARCH_TREE_FROM_PREORDER_TRAVERSAL {
	public TreeNode bstFromPreorder(int[] preorder) {

		TreeNode root = new TreeNode( preorder[0]);

		for( int i = 1; i < preorder.length; i++ ) {
			insert( root, preorder[i]);
		}

		return root;
	}

	public void insert( TreeNode root, int val) {

		if( root.val < val ) {
			if( root.right == null ) {
				root.right = new TreeNode( val);
			} else {
				insert( root.right, val);
			}

		} else {

			if( root.left == null ) {
				root.left = new TreeNode( val );
			} else {
				insert( root.left, val);
			}
		}

	}
}
