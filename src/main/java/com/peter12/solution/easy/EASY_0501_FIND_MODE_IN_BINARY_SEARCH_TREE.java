package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.TreeNode;

public class EASY_0501_FIND_MODE_IN_BINARY_SEARCH_TREE {
	public int[] findMode(TreeNode root) {
		
		/**
		 * Solution: https://evelynn.gitbooks.io/google-interview/content/find-mode-in-binary-search-tree.html
		 */
		List<Integer> result = new Vector<Integer>();
		findMode( root, result);
		
		
		int[] r = new int[result.size()];
		for( int i = 0; i < r.length; i++ ) {
			r[i] = result.get(i);
		}
		
		return r;
	}
	
	public int count = 1;
	public int maxCount = 0;
	public TreeNode preNode = null;
	
	public void findMode( TreeNode root, List<Integer> result) {
		if( root == null ) {
			return ;
		}
		
		
		findMode( root.left, result);
		
		if( preNode != null ) {
			if( preNode.val == root.val) {
				count++;
			} else {
				count = 1;
			}
		}
		 
		preNode = root;
		
		if( count > maxCount ) {
			maxCount = count;
			result.clear();
			result.add(root.val);
		} 
		
		if( count == maxCount) {
			if( !result.contains(root.val)) {
				result.add(root.val);
			}
			
		}
		 findMode( root.right, result);
		
		
		
	}
	
	
	
}
