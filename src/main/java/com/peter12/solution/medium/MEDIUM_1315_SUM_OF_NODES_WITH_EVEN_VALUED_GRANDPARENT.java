package com.peter12.solution.medium;

import com.peter12.solution.data.TreeNode;

public class MEDIUM_1315_SUM_OF_NODES_WITH_EVEN_VALUED_GRANDPARENT {
	 public int sumEvenGrandparent(TreeNode root) {
         
	        if( root == null ) {
	            return 0;
	        }
	        //System.out.println("sumEvenGrandparent ROOT = " + root.val);  
	        int result = 0;
	        result += sumEvenGrandparent(root.left);
	        result += sumEvenGrandparent(root.right);
	        
	        if( root.val % 2 == 0 ) {
	            
	            int left = sumChild( root.left);
	            int right = sumChild( root.right);
	            
	            result += left + right;
	            
	            return result;
	            
	        } else {
	            return result;
	        }
	    }
	    
	    public int sumChild( TreeNode root ) {
	         
	        if( root == null ) {
	            return 0;
	        }
	        
	        //System.out.println("sumChild ROOT = " + root.val);
	        int result = 0;
	        
	        if( root.left != null) {
	            result += root.left.val;
	        }
	        
	        if( root.right != null ) {
	            result += root.right.val;
	        }
	        
	        return result;
	    }
}
