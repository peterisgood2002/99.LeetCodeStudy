package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.List;

import com.peter12.solution.data.GraphNode;

public class MEDIUM_0133_CLONE_GRAPH {
	public static GraphNode cloneGraph(GraphNode GraphNode) {

		List<GraphNode> done = new ArrayList<GraphNode>();
		return cloneGraph( GraphNode, done );

	}

	public static GraphNode cloneGraph(GraphNode GraphNode, List<GraphNode> done ) {

		if( GraphNode == null ) {
			return null;
		}

		GraphNode newGraphNode = new GraphNode( GraphNode.val );
		done.add( newGraphNode );

		for( GraphNode n : GraphNode.neighbors ) {

			GraphNode nn = null;
			for( GraphNode d : done ) {
				if( d.val == n.val ) {
					nn = d;
				}
			}

			if( nn == null ) {
				nn = cloneGraph( n, done);
			}

			newGraphNode.neighbors.add(nn);

		}

		return newGraphNode;

	}
}
