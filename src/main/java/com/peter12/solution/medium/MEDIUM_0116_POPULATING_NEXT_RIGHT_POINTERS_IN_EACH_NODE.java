package com.peter12.solution.medium;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.Node;

public class MEDIUM_0116_POPULATING_NEXT_RIGHT_POINTERS_IN_EACH_NODE {
	public static Node connect(Node root) {
		
		if( root == null ) {
			return root;
		}
		
		connectInternal(root);
		connectSibling(root);
		
		return root;
	}
	
	public static void connectInternal( Node root ) {
		if( root == null ) {
			return;
		}
		
		if( root.left != null && root.right != null ) {
			root.left.next = root.right;
		} 
		
		connectInternal( root.left );
		connectInternal( root.right );
	}
	
	public static void connectSibling( Node root ) {
		connectSibling(root.left, root.right);
	}
	
	public static void connectSibling(  Node left, Node right) {
		
		if( left == null || right == null ) {
			return;
		}
		
		Node mostRight = left.right;
		Node mostLeft = right.left;
		
		while( mostRight != null && mostLeft != null ) {
			mostRight.next = mostLeft;
			
			mostRight = mostRight.right;
			mostLeft = mostLeft.left;
			
		}
		
		connectSibling(left);
		connectSibling(right);
	}
	
}
