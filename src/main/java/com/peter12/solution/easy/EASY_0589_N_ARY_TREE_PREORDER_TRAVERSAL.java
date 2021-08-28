package com.peter12.solution.easy;

import java.util.ArrayList;
import java.util.List;

import com.peter12.solution.data.NTreeNode;

public class EASY_0589_N_ARY_TREE_PREORDER_TRAVERSAL {
	public List<Integer> preorder(NTreeNode root) {

		List<Integer> result = new ArrayList<Integer>();

		preorder( root, result);
		return result;
	}

	public void preorder( NTreeNode root, List<Integer> result ) {

		if( root == null ) {
			return;
		}

		result.add( root.val );
		for( NTreeNode n : root.children ) {
			preorder(n, result);
		}


	}
}
