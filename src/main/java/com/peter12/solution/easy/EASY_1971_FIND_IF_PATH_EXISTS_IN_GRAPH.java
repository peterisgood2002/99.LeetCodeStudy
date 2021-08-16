package com.peter12.solution.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class EASY_1971_FIND_IF_PATH_EXISTS_IN_GRAPH {
	public boolean validPath(int n, int[][] edges, int start, int end) {
	      
        boolean[] visited = new boolean[n];
        
        HashMap<Integer, HashSet<Integer>> graph = new HashMap<Integer, HashSet<Integer>>();
        for( int[] e : edges ) {
            //Bi-drectional
            // u --> v
            HashSet<Integer> he = graph.get(e[0]);
            
            if( he == null ) {
                he = new HashSet<Integer>();
                graph.put( e[0], he);
            }
            
            he.add( e[1] );
            
            // v --> u
            he = graph.get(e[1] ); 
            if( he == null ) {
                he = new HashSet<Integer>();
                graph.put( e[1], he);
            }
            
            he.add(e[0]);
        }
        
        
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(start);
        visited[start] = true;
    
        while( !queue.isEmpty() ) {
            int current = queue.poll();
            
            if( current == end ) {
                return true;
            }
            
            HashSet<Integer> e = graph.get(current);
            if( e != null ) {
                //System.out.print( " current = " + current  + " neighbor = [");
                for( int v : e ) {
                    //System.out.print(v + " ");
                    if( !visited[v] ) {
                        queue.offer(v);
                        visited[v] = true;
                    }      
                } 
                //System.out.println("]");
            }
                     
        } 
        
        return false;
    }
}
