package com.peter12.solution.easy;

import com.peter12.solution.data.NTreeNode;

public class EASY_0559_MAXIMUM_DEPTH_OF_N_ARY_TREE {
	public int maxDepth(NTreeNode root) {
        if( root == null ) {
            return 0;
        }
        
        
        int max = 0;
        for( NTreeNode n : root.children ) {
            max = Math.max( max, maxDepth(n) );
            
        }
        
        return max + 1;
    }
}
