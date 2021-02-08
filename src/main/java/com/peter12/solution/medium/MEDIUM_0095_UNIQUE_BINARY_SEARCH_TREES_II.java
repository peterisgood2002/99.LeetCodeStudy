package com.peter12.solution.medium;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.TreeNode;

public class MEDIUM_0095_UNIQUE_BINARY_SEARCH_TREES_II {
	public static List<TreeNode> generateTrees(int n) {
		
		List<TreeNode> result = generateTree(1, n);
		
		return result;
	}
	
	public static List<TreeNode> generateTree(int begin, int end ) {
		List<TreeNode> result = new Vector<TreeNode>();
	
		
		for( int i = begin; i <= end; i++ ) {
		
			List<TreeNode> left = generateTree(begin, i - 1);
			List<TreeNode> right = generateTree(i + 1, end);
			
			List<TreeNode> root = generateRoot(i, left, right);
			
			result.addAll(root);
		}
		
		return result;
	}
	
	public static List<TreeNode> generateRoot( int root, List<TreeNode> lefts, List<TreeNode> rights ) {
		
		List<TreeNode> result = new Vector<TreeNode>();
		
		if( lefts.size() == 0 && rights.size() == 0 ) {
			result.add( new TreeNode(root) );
		}else if( lefts.size() != 0 && rights.size() == 0 ) {
			for( TreeNode left : lefts ) {
				TreeNode r = new TreeNode(root);
				r.left = left;
				
				result.add(r);
			}
		}else if( lefts.size() == 0 && rights.size() != 0 ) {
			for( TreeNode right: rights ) {
				TreeNode r = new TreeNode(root);
				r.right = right;
				result.add(r);
			}
		} else {
			for( TreeNode left : lefts) {
				for( TreeNode right : rights) {
					TreeNode r = new TreeNode(root);
					r.left = left;
					r.right = right;
					
					result.add(r);
				}
			}
		}
		
		
		
		
		return result;
	}
	
}
