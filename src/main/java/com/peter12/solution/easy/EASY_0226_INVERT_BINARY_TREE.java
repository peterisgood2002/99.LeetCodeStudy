package com.peter12.solution.easy;

import com.peter12.solution.data.TreeNode;

public class EASY_0226_INVERT_BINARY_TREE {
	public static TreeNode invertTree(TreeNode root) {
        if( root == null ) {
        	return null;
        }
        
        if( root.left == null && root.right == null ) {
        	return root;
        }
        
        TreeNode left = invertTree(root.right);
        TreeNode right = invertTree(root.left);
        
        root.left = left;
        root.right = right;
        
        return root;
    }
}
