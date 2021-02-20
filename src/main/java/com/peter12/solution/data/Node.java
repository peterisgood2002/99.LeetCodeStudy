package com.peter12.solution.data;

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
}
