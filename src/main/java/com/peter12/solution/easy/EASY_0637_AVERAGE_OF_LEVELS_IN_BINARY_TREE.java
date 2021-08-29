package com.peter12.solution.easy;

import java.util.ArrayList;
import java.util.List;

import com.peter12.solution.data.TreeNode;

public class EASY_0637_AVERAGE_OF_LEVELS_IN_BINARY_TREE {
	public List<Double> averageOfLevels(TreeNode root) {

		List<List<TreeNode>> levels = new ArrayList<List<TreeNode>>();

		bfs(0, root, levels );

		List<Double> result = new ArrayList<Double>();

		for( List<TreeNode> l : levels ) {
			int size = l.size();
			double r = 0;
			for( TreeNode t : l ) {
				r += t.val;
			}

			result.add( r/size);
		}

		return result;

	}

	public void bfs(int level, TreeNode root, List<List<TreeNode>> levels  ) {

		if( root == null ) {
			return;
		}

		List<TreeNode> l = null;
		if( levels.size() == level ) {
			l = new ArrayList<TreeNode>();
			levels.add(l);
		} else {
			l = levels.get(level);
		}

		l.add(root);

		bfs( level + 1, root.left, levels);
		bfs( level + 1, root.right, levels );

	}
}
