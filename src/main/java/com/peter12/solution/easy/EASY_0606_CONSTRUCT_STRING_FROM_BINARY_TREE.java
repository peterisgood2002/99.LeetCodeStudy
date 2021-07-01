package com.peter12.solution.easy;

import com.peter12.solution.data.TreeNode;

public class EASY_0606_CONSTRUCT_STRING_FROM_BINARY_TREE {
	public String tree2str(TreeNode root) {

		if( root == null )  {
			return "";    
		}

		String result = String.valueOf(root.val);

		if( root.left == null && root.right == null ) {
			return result;
		}



		result += "(";

		result += tree2str( root.left);

		result += ")";



		if( root.right != null ) {
			result += "(";

			result += tree2str( root.right);

			result += ")";
		}

		return result;
	}
}
