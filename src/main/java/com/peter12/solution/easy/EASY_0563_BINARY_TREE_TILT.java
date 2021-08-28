package com.peter12.solution.easy;

import com.peter12.solution.data.TreeNode;

public class EASY_0563_BINARY_TREE_TILT {
	int result = 0;
    public int findTilt(TreeNode root) {
        sum( root );
        
        return result;
    }
    
    public int sum( TreeNode root ) {
        if( root == null ) {
            return 0;
        }
        
        int left = sum( root.left );
        int right = sum( root.right );
        
        result += Math.abs( left - right);
        
        return left + right + root.val;
        
    }
}
