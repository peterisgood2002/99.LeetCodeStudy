package com.peter12.solution.data;

public class TreeNode {

	public int val;
	public TreeNode left;
	public TreeNode right;
	public TreeNode() {}
	public TreeNode(int val) { this.val = val; }
	public TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
	public static TreeNode createTreeNode(int[] data ) {
		if( data.length == 1) {
			return new TreeNode(data[0]);
		}
		
		TreeNode result = createNextLevel(0, data );
		
		return result;
	}
	
	public static TreeNode createNextLevel(int level, int[] data ) {
		if( level >= data.length) {
			 return null;
		}
		
		
		TreeNode result = new TreeNode(data[level]);
		
		result.left = createNextLevel(2 * level + 1, data);
		result.right = createNextLevel(2 * level + 2, data);
		
		return result;
	}
	
	
	
	@Override
	public String toString() {
		
		StringBuilder result = new StringBuilder();
		result.append(    "\n[VAL = "+ val +"] ");
		//Left
		result.append(    "\n  L:{"          );
		
		if( left != null ) {
			result.append(left.toString().replace("\n", "\n     ")   );
		}else {
	        result.append("\n     NULL");
		}
		result.append(    "\n    }"            );
		//Right
		result.append(    "\n  R:{"          );
		if( right != null ) {
			result.append(right.toString().replace("\n", "\n     ")   );
		}else {
	        result.append("\n     NULL");
		}
		result.append(    "\n    }"            );
		
		
		return result.toString();
	}
	
	
	
}
