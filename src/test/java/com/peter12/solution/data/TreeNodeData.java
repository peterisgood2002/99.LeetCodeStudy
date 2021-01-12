package com.peter12.solution.data;

public class TreeNodeData {
	public static TreeNode createTree() {
    	TreeNode result = new TreeNode(3);
    	result.left = new TreeNode(9);
    	
    	result.right = new TreeNode(20);
    	result.right.left = new TreeNode(15);
    	result.right.right = new TreeNode(7);
    	
    	return result;
    }
	
	public static TreeNode createTree2() {
		TreeNode result = new TreeNode(1);
		result.right = new TreeNode(2);
		
		result.left = new TreeNode(2);
		result.left.right = new TreeNode(3);
		result.left.left = new TreeNode(3);
		
		result.left.left.left = new TreeNode(4);
		result.left.left.right = new TreeNode(4);
		
		return result;
	}
	
	public static TreeNode createTree3() {
		TreeNode result = new TreeNode(2);
		result.right = new TreeNode(3);
		
		
		result.right.right = new TreeNode(4);
		result.right.right.right = new TreeNode(5);
		result.right.right.right.right = new TreeNode(6);
		
		return result;
	}
	
	public static TreeNode createTree4() {
		TreeNode result = new TreeNode(5);
		result.left = new TreeNode(4);
		result.right = new TreeNode(8);
		
		result.left.left = new TreeNode(11);
		result.left.left.left = new TreeNode(7);
		result.left.left.right = new TreeNode(2);
		
		result.right.left = new TreeNode(13);
		result.right.right = new TreeNode(4);
		result.right.right.right = new TreeNode(1);
		
		
		
		return result;
	}
}
