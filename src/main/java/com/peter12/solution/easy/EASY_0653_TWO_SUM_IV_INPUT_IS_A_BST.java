package com.peter12.solution.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.peter12.solution.data.TreeNode;

public class EASY_0653_TWO_SUM_IV_INPUT_IS_A_BST {
	public boolean findTarget(TreeNode root, int k) {

		List<Integer> node = new ArrayList<Integer>();

		dfs( root, node);

		/*
          A + B = k
          B = k - A
		 */
		HashMap<Integer, Integer> bToi = new HashMap<Integer, Integer>();
		for( int i = 0; i < node.size(); i++ ) {
			int a = node.get(i);
			Integer index = bToi.get( k - a );
			if( index != null) {
				return true;
			}

			bToi.put(a, i);

		}


		return false;
	}

	public void dfs( TreeNode root, List<Integer> node) {

		if( root == null ) {
			return;
		}

		node.add( root.val);

		dfs( root.left, node);
		dfs( root.right, node);

	}
}
