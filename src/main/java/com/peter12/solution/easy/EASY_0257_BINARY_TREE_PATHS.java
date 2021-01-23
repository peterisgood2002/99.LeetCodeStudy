package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.TreeNode;

public class EASY_0257_BINARY_TREE_PATHS {
	public static List<String> binaryTreePaths(TreeNode root) {
		
		List<String>  result = new Vector<String>();
		
		searchPathsString( "", root, result);
			
		
		return result;
		
	}
	
	public static void searchPathsString(String data, TreeNode root, List<String>  result) {
		
		if(root == null ) {
			return;
		}
		
		if( root.left == null && root.right == null ) {
			//This is leaf so we get our result
			data += root.val;
			
			result.add( data.toString() );
			
			return;
		}
		
		data += getPathString(root);
		
		searchPathsString( data, root.left, result);
		searchPathsString( data, root.right, result);
		
	}
	
	public static String getPathString( TreeNode node) {
		return node.val + "->";
	}
}
