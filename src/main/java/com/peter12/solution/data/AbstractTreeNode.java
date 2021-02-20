package com.peter12.solution.data;

public abstract class AbstractTreeNode {
	public int val;
	
	public String toString() {
		
		StringBuilder result = new StringBuilder();
		result.append(    "\n[VAL = "+ val +"] ");
		//Left
		result.append(    "\n  L:{"          );
		toString( result,  getLeft() );
		
		//Right
		result.append(    "\n  R:{"          );
		toString( result,  getRight() );
	
		return result.toString();
	}
	
	private void toString( StringBuilder result, AbstractTreeNode node) {
				
		if( node != null ) {
			result.append(node.toString().replace("\n", "\n     ")   );
		}else {
	        result.append("\n     NULL");
		}
		result.append(    "\n    }"            );
	}
	
	/*Abstract method*/
	
	public abstract AbstractTreeNode getLeft();
	public abstract AbstractTreeNode getRight();
	
	public abstract void setLeft(AbstractTreeNode node);
	public abstract void setRight(AbstractTreeNode node);
	
}
