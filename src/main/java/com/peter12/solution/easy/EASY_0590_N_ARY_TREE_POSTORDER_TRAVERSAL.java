package com.peter12.solution.easy;

import java.util.ArrayList;
import java.util.List;

import com.peter12.solution.data.NTreeNode;

public class EASY_0590_N_ARY_TREE_POSTORDER_TRAVERSAL {
	public List<Integer> postorder(NTreeNode root) {

		List<Integer> result = new ArrayList<Integer>();

		postorder( root, result);

		return result;
	}

	public void postorder( NTreeNode root, List<Integer> result ) {
		if( root == null ) {
			return;
		}

		for( NTreeNode n : root.children ) {
			postorder(n, result);
		}

		result.add(root.val);

	}
}
