package com.peter12.solution.medium;

import com.peter12.solution.data.TreeNode;

public class MEDIUM_0098_VALIDATE_BINARY_SEARCH_TREE {
	public static boolean isValidBST(TreeNode root) {
		if( root == null ) {
			return true;
		}
		
		
		boolean result = true;
		
		if( root.left != null ) {
			int max = findValue( true, root.left);
			
			result &= max < root.val && isValidBST(root.left);
		}
		
		if( root.right != null ) {
			int min = findValue(false, root.right);
			
			result &= root.val < min && isValidBST(root.right);
		}
		
		
		return result;
		
		
	}
	
	public static int findValue( boolean isMax, TreeNode tree) {
		
		if( isMax ) {
			if( tree.right != null ) {
				return findValue( isMax, tree.right);
			} else {
				return tree.val;
			}
		} else {
			if( tree.left != null ) {
				return findValue( isMax, tree.left);
			} else {
				return tree.val;
			}
		}
	}
 }
