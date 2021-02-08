package com.peter12.solution.medium;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.TreeNode;

public class MEDIUM_0094_BINARY_TREE_INORDER_TRAVERSAL {
	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new Vector<Integer>();
		
		inorderTraversal(root, result);
		return result;
	}
	
	public static void inorderTraversal(TreeNode root, List<Integer> result) {
		if( root == null ) {
			return;
		}
		
		inorderTraversal(root.left, result);
		
		result.add(root.val);
		
		inorderTraversal(root.right, result);
		
	}
}
