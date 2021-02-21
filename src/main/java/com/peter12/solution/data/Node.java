package com.peter12.solution.data;

import java.util.List;
import java.util.Vector;

public class Node extends AbstractTreeNode{

	public Node left;
	public Node right;
	public Node next;

	public Node() {}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, Node _left, Node _right, Node _next) {
		val = _val;
		left = _left;
		right = _right;
		next = _next;
	}

	public static Node createNode(Integer[] data ) {
		AbstractTreeNode result = TreeFactory.createTreeNode(Node.class, data);

		return (Node) result;

	}


	@Override
	public AbstractTreeNode getLeft() {

		return left;
	}

	@Override
	public AbstractTreeNode getRight() {

		return right;
	}

	@Override
	public void setLeft(AbstractTreeNode node) {
		left = (Node) node;

	}

	@Override
	public void setRight(AbstractTreeNode node) {
		right = (Node) node;

	}

	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(    "\n[NEXT = "+ outputNext() +"] ");

		result.append( super.toString() );

		return result.toString();
	}

	private String outputNext() {
		String result = "[val=" + val + "] ->";
		if( next == null) {
			return result + "NULL";
		}

		return result + next.outputNext();
	}


	public static void connectSibling( Node root ) {
		List<List<Node>> levelElements = new Vector<List<Node>>();

		levelOrderTraversal(1, root, levelElements);

		for( List<Node> l : levelElements ) {

			int i = 0;
			while( i < l.size() - 1) {
				Node n1 = l.get(i);
				Node n2 =  l.get(++i) ;

				n1.next = n2;
			}

		}
	}

	public static void levelOrderTraversal( int level, Node root, List<List<Node>> result ) {

		if( root == null  ) {
			return;
		}

		//Check if we have enough lists
		if( level >= result.size() ) {
			//We do not have enough elements in the list
			int addSize = level - result.size();
			while ( addSize-- > 0 ) {
				result.add( new Vector<Node>() );
			}
		}

		//Add Root
		List<Node> data = result.get( level - 1 );
		data.add(root);

		//Add Left and Right
		if(root.left != null  ) {
			levelOrderTraversal( level + 1, root.left, result);
		}

		if(root.right != null  ) {
			levelOrderTraversal( level + 1, root.right, result);
		}


	}

}
