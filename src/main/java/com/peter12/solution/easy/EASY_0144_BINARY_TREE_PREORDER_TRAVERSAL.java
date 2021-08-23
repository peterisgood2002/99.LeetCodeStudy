package com.peter12.solution.easy;

import java.util.ArrayList;
import java.util.List;

import com.peter12.solution.data.TreeNode;

public class EASY_0144_BINARY_TREE_PREORDER_TRAVERSAL {
	public List<Integer> preorderTraversal(TreeNode root) {

		List<Integer> result = new ArrayList<Integer>();

		preorder(root, result);
		return result;
	}

	public void preorder( TreeNode root, List<Integer> result ) {

		if( root == null ) {
			return;
		}

		result.add( root.val);

		preorder( root.left, result);
		preorder( root.right, result);
	}
}
