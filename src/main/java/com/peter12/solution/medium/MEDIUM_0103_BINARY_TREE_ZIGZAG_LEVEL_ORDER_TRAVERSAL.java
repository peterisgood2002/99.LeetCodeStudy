package com.peter12.solution.medium;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.TreeNode;

public class MEDIUM_0103_BINARY_TREE_ZIGZAG_LEVEL_ORDER_TRAVERSAL {
	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {

		List<List<TreeNode>> nodes = new Vector<List<TreeNode>>();
		levelOrder(1, root, nodes);
		List<List<Integer>> result = new Vector<List<Integer>>();

		for( int i = 0; i < nodes.size(); i++ ) {
			List<TreeNode> node = nodes.get(i);
			
			List<Integer> r = new Vector<Integer>();
			if( i % 2 == 1 ) {
				for( int j = node.size() - 1; j>= 0; j-- ) {
					TreeNode n = node.get(j);
					r.add( n.val );
				}
			} else {
				for( int j = 0; j < node.size(); j++ ) {
					TreeNode n = node.get(j);
					r.add( n.val );
				}
			}
			
			result.add(r);
		}
		
		return result;
	}

	public static void levelOrder( int level, TreeNode root, List<List<TreeNode>> result ) {

		if( root == null ) {
			return;
		}

		List<TreeNode> r = null;
		if( level > result.size() ) {
			r = new Vector<TreeNode>();
			result.add(r);
		} else {
			r = result.get(level - 1);
		}

		r.add( root );

		levelOrder(level + 1, root.left, result);
		levelOrder(level + 1, root.right, result);

	}
}
