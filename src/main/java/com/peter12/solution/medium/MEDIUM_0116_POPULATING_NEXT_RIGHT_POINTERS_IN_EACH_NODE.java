package com.peter12.solution.medium;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.Node;

public class MEDIUM_0116_POPULATING_NEXT_RIGHT_POINTERS_IN_EACH_NODE {
	public static Node connect(Node root) {
		
		if( root == null ) {
			return root;
		}
		Node.connectSibling(root);
		
		return root;
	}
	
}
