package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.peter12.solution.data.TreeNode;

public class MEDIUM_1339_MAXIMUM_PRODUCT_OF_SPLITTED_BINARY_TREE {

	long max = 0;
	long total = 0;
	public int maxProduct(TreeNode root) {

		/*
          Solution: https://www.cnblogs.com/cnoodle/p/15165546.html
		 */
		total = total( root );
		total( root );        
		return (int)(max % 1000000007);
	}

	public int total( TreeNode root) {
		if( root == null ) {
			return 0 ;
		}

		int current = total(root.left) + total( root.right ) + root.val;

		max =  Math.max( max,  (total - current) * current );

		return current;

	}
}
