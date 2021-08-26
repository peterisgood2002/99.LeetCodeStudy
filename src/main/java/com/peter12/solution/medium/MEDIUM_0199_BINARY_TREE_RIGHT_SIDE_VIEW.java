package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.List;

import com.peter12.solution.data.TreeNode;

public class MEDIUM_0199_BINARY_TREE_RIGHT_SIDE_VIEW {
	public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer> > lNode = new ArrayList<List<Integer>>();
        
        rightSideView(0, root, lNode );
        
        List<Integer> result = new ArrayList<Integer>();
        
        for( List<Integer> n : lNode ) {
            result.add( n.get( n.size() - 1) );
        }
        
        return result;
    }
    
    public void rightSideView(int level, TreeNode root,  List<List<Integer>> lNode ) {
        
        if( root == null ) {
            return;
        }
        
        List<Integer> node = null;
        if( level == lNode.size() ) {
            node = new ArrayList<Integer>();
            lNode.add(node);
        } else {
            node = lNode.get(level);
        }
        
        
        node.add( root.val);
        
        rightSideView( level + 1, root.left, lNode);
        rightSideView( level + 1, root.right, lNode);
    }
}
