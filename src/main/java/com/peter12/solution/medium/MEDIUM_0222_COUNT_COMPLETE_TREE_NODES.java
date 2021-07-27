package com.peter12.solution.medium;

import com.peter12.solution.data.TreeNode;

public class MEDIUM_0222_COUNT_COMPLETE_TREE_NODES {
	public int countNodes(TreeNode root) {
        if( root == null ) {
            return 0;
        }
        
        int left = countNodes( root.left);
        int right = countNodes( root.right );
        
        return left + right + 1;
    }
}
