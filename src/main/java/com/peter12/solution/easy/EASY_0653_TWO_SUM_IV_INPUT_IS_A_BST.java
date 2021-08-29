package com.peter12.solution.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import com.peter12.solution.data.TreeNode;

public class EASY_0653_TWO_SUM_IV_INPUT_IS_A_BST {
	public boolean findTarget(TreeNode root, int k) {

		/*
          Solution: https://www.cnblogs.com/cnoodle/p/15183042.html
		 */
		HashSet<Integer> node = new HashSet<Integer>();

		return dfs( root, k, node);

	}

	public boolean dfs( TreeNode root, int k, HashSet<Integer> node) {

		if( root == null ) {
			return false;
		}

		if( node.contains( k - root.val ) ) {
			return true;
		}

		node.add( root.val );

		return dfs( root.left, k, node) || dfs( root.right, k, node);

	}
}
