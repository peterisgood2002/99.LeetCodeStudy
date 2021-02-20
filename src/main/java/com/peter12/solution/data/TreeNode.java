package com.peter12.solution.data;

public class TreeNode extends AbstractTreeNode{

	
	public TreeNode left;
	public TreeNode right;
	public TreeNode() {}
	public TreeNode(int val) { this.val = val; }
	public TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
	public static TreeNode createSkewTree(Integer[] data) {
		AbstractTreeNode result = TreeFactory.createSkewTree(TreeNode.class, data);

		return (TreeNode) result;
		
	}
		
	public static TreeNode createTreeNode(Integer[] data ) {
		AbstractTreeNode result = TreeFactory.createTreeNode(TreeNode.class, data);

		return (TreeNode) result;
		
	}
	
	
	public static TreeNode createTreeNode(int[] data ) {
		AbstractTreeNode result = TreeFactory.createTreeNode(TreeNode.class, data);

		return (TreeNode) result;
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
		left = (TreeNode)node;
		
	}
	@Override
	public void setRight(AbstractTreeNode node) {
		right = (TreeNode)node;
		
	}
	
	
	
}
