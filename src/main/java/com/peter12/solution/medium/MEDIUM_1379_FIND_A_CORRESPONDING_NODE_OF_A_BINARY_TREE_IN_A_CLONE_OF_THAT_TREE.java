package com.peter12.solution.medium;

import com.peter12.solution.data.TreeNode;

public class MEDIUM_1379_FIND_A_CORRESPONDING_NODE_OF_A_BINARY_TREE_IN_A_CLONE_OF_THAT_TREE {
	public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if( original == null ) {
            return null;
        }
        
        if( original == target ) {
            return cloned;
        }
        
        TreeNode left = getTargetCopy( original.left, cloned.left, target);
        TreeNode right = getTargetCopy( original.right, cloned.right, target);
        
        if( left == null ) {
            return right;
        } else {
            return left;
        }
        
    }
}
