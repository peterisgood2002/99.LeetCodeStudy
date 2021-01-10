package com.peter12.solution.easy;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.TreeNode;

public class EASY_0107_BINARY_TREE_LEVEL_ORDER_TRAVERSAL_II {
	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
		
		List<List<Integer>> result = new Vector<List<Integer>>();
		if( root == null ) {
			return result;
		}
		
		levelOrderBottom(1, root, result);
		
		Collections.reverse(result);
		
		return result;
	}
	
	
	public static void levelOrderBottom(int level, TreeNode root, List<List<Integer>> result) {
		if( root == null  ) {
			return;
		}
		
		//Check if we have enough lists
		if( level >= result.size() ) {
			//We do not have enough elements in the list
			int addSize = level - result.size();
			while ( addSize-- > 0 ) {
				result.add( new Vector<Integer>() );
			}
		}
		
		//Add Root
		List<Integer> data = result.get( level - 1 );
		data.add(root.val);
		
		//Add Left and Right
		if(root.left != null  ) {
			levelOrderBottom( level + 1, root.left, result);
		}
		
		if(root.right != null  ) {
			levelOrderBottom( level + 1, root.right, result);
		}
	}
	
}
