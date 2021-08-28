package com.peter12.solution.easy;

import com.peter12.solution.data.TreeNode;

public class EASY_0543_DIAMETER_OF_BINARY_TREE {
	int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        depth( root );
        
        return max;
    }
    
    public int depth( TreeNode root ) {
        if( root == null ) {
            return 0;
        }
        
        int left = depth( root.left );
        int right = depth( root.right);
        
        max = Math.max( max, left + right);
        return Math.max( left, right ) + 1;
    }
}
