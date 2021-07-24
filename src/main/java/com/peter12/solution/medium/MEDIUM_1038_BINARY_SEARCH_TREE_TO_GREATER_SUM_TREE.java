package com.peter12.solution.medium;

import com.peter12.solution.data.TreeNode;

public class MEDIUM_1038_BINARY_SEARCH_TREE_TO_GREATER_SUM_TREE {
	public TreeNode bstToGst(TreeNode root) {
        if( root == null ) {
            return null;
        }   
        
        addRightSum( 0, root );
        return root;
        
    }
    
    public int addRightSum( int sumRight, TreeNode root) {
        if( root == null ) {
            return sumRight;
        }
        
        sumRight = addRightSum( sumRight, root.right);
        
        int val = root.val;
        root.val += sumRight;
        
        sumRight = addRightSum( root.val, root.left);
        
        return sumRight;
    }

}
