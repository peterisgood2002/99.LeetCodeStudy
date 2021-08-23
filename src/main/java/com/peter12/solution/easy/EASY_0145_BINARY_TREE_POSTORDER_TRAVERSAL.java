package com.peter12.solution.easy;

import java.util.ArrayList;
import java.util.List;

import com.peter12.solution.data.TreeNode;

public class EASY_0145_BINARY_TREE_POSTORDER_TRAVERSAL {
	public List<Integer> postorderTraversal(TreeNode root) {

		List<Integer> result = new ArrayList<Integer>();

		postOrder( root, result);

		return result;

	}

	public void postOrder( TreeNode root, List<Integer> result ) {
		if( root == null ) {
			return;
		}

		postOrder( root.left, result);
		postOrder( root.right, result);

		result.add( root.val);

	}
}
