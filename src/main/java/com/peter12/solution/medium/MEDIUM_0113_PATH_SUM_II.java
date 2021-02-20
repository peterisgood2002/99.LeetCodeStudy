package com.peter12.solution.medium;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.TreeNode;
import com.peter12.solution.util.Util;

public class MEDIUM_0113_PATH_SUM_II {
	public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {

		List<List<Integer>> result = new Vector<List<Integer>>();
		
		pathSum(root, targetSum, null, result);
		return result;
		
	}
	
	public static void pathSum(TreeNode root, int targetSum, List<Integer> r, List<List<Integer>> result ) {
		
		if( root == null ) {
			
			return;
		}
		
		if( r == null ) {
			r = new Vector<Integer>();
		}
		
		int remain = targetSum - root.val;
		
		if(root.left == null && root.right == null) {
			if( remain == 0 ) {
				r.add(root.val);
				Util.outputResult(true, r, result);
				r.remove( r.size() - 1);
			}
			
			return;
		}
		
		r.add(root.val);
		
		pathSum(root.left, remain, r, result);
		
		pathSum(root.right, remain, r, result);
		
		r.remove( r.size() - 1);
		
	}
}
