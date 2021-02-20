package com.peter12.solution.data;

public class TreeFactory {

	public static  AbstractTreeNode initialize(Class c, int val) {
		AbstractTreeNode result = new TreeNode(val);
		if( c == Node.class ) {
			result = new Node(val);
		}

		return result;
	}

	public static AbstractTreeNode createSkewTree(Class c, Integer[] data) {

		AbstractTreeNode result = null;
		AbstractTreeNode pre = result;

		for( int val : data) {
			AbstractTreeNode current = new TreeNode(val);

			if( pre == null) {
				result = current;
			} else {
				pre.setRight(current);
			}

			pre = current;

		}


		return result;

	}

	public static AbstractTreeNode createTreeNode(Class c, int[] data ) {

		Integer[] d = new Integer[ data.length];

		for( int i = 0; i < data.length; i++ ) {
			d[i] = data[i];
		}

		return createTreeNode(c, d);
	}

	public static AbstractTreeNode createTreeNode(Class c, Integer[] data ) {
		if( data.length == 1 ) {
			return initialize(c, data[0]); 
		}

		AbstractTreeNode result = createNextLevel(c, 0, data);

		return result;

	}

	private static AbstractTreeNode createNextLevel(Class c, int level, Integer[] data ) {
		if( level >= data.length ) {
			return null;
		}

		if(data[level] == null ) {
			return null;
		}

		AbstractTreeNode result = initialize( c, data[level]);

		result.setLeft ( createNextLevel(c, 2 * level + 1, data) );
		result.setRight( createNextLevel(c, 2 * level + 2, data) );

		return result;
	}


}
