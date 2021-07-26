package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.List;

import com.peter12.solution.data.TreeNode;

public class MEDIUM_1008_CONSTRUCT_BINARY_SEARCH_TREE_FROM_PREORDER_TRAVERSAL {
	public TreeNode bstFromPreorder(int[] preorder) {

		List<Integer> data = new ArrayList<Integer>();
		for( int v : preorder ) {
			data.add(v);
		}

		return getBinarySearchTree(data);
	}

	public TreeNode getBinarySearchTree( List<Integer> data ) {

		if( data.size() == 0 ) {
			return null;
		}

		int val = data.get(0);
		TreeNode root = new TreeNode( val );

		List<Integer> ll = new ArrayList<Integer>();
		List<Integer> lr = new ArrayList<Integer>();

		for( int i = 1; i < data.size(); i++ ) {
			int v = data.get(i);

			if( v < val ) {
				ll.add(v);
			} else {
				lr.add(v);
			}
		}

		root.left = getBinarySearchTree( ll );
		root.right = getBinarySearchTree( lr );

		return root;
	}
}
