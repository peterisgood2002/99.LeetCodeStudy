package com.peter12.solution.medium;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.TreeNode;

public class MEDIUM_0102_BINARY_TREE_LEVEL_ORDER_TRAVERSAL {
	public static List<List<Integer>> levelOrder(TreeNode root) {
		
		List<List<Integer>> result = new Vector<List<Integer>>();
		
		levelOrder(1, root, result);
		return result;
	}
	
	public static void levelOrder( int level, TreeNode root, List<List<Integer>> result ) {
		
		if( root == null ) {
			return;
		}
		
		List<Integer> r = null;
		if( level > result.size() ) {
			r = new Vector<Integer>();
			result.add(r);
		} else {
			r = result.get(level - 1);
		}
		
		r.add( root.val );
		
		levelOrder(level + 1, root.left, result);
		levelOrder(level + 1, root.right, result);
		
		
	}
	
	
}
