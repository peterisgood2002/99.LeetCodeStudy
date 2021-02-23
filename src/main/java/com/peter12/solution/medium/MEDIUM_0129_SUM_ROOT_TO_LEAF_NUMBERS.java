package com.peter12.solution.medium;

import com.peter12.solution.data.TreeNode;

public class MEDIUM_0129_SUM_ROOT_TO_LEAF_NUMBERS {
	public static int sumNumbers(TreeNode root) {

		int result = sumNumbersImpl(0, root);
		
		return result;
		
	}
	
	public static int sumNumbersImpl(int total, TreeNode root) {
		
		if( root == null ) {
			return 0;
		}
		
		if( root.left == null && root.right == null ) {
			return  total * 10 + root.val;
		}
		
		total *= 10;
		total += root.val;
		
			
		int leftValue =  sumNumbersImpl( total, root.left);
		int rightValue = sumNumbersImpl( total, root.right);
		
		return leftValue + rightValue;
		
	}
	
	
}
