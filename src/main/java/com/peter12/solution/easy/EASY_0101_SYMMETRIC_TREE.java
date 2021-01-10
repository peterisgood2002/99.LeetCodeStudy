package com.peter12.solution.easy;

import com.peter12.solution.data.TreeNode;

public class EASY_0101_SYMMETRIC_TREE {
	public static boolean isSymmetric(TreeNode root) {
		if( root == null ) {
			return true;
		}
		
        if( root.left == null && root.right == null ) {
        	return true;
        }
        
        if( root.left != null && root.right != null ) {
        	return isSymmetric(root.left, root.right);
        }
        
        return false;
    }
	
	public static boolean isSymmetric(TreeNode left, TreeNode right) {
		if( left == null && right == null ) {
			return true;
		}
		
		if( left != null && right != null ) {
			if( left.val != right.val ) {
				return false;
			}
			
			return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
		}
		
		return false;
		
	}
}
