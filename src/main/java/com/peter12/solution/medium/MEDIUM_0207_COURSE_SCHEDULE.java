package com.peter12.solution.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MEDIUM_0207_COURSE_SCHEDULE {
public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        /*
            Solution: https://zxi.mytechroad.com/blog/graph/leetcode-207-course-schedule/
        */
        
        HashMap<Integer, List<Integer> > map = new HashMap<Integer, List<Integer> >();
        for( int[] p : prerequisites) {
            
            List<Integer> m = map.get(p[0]);
            if( m == null) {
                m = new ArrayList<Integer>();
                map.put(p[0], m);
            }
            
            m.add( p[1] );
        }
        
        //0: Not Visited, 1: Visiting, 2 :Visited
        int[] visited = new int[numCourses];
                
        for( int i = 0; i < visited.length; i++ ) {
            if( visited[i] == 0 && !canFinish(i, visited, map)) {
                return false;
            }
        }
        
        return true;
    }
    
    public boolean canFinish( int c, int[] visited, HashMap<Integer, List<Integer> > map ) {
        if( visited[c] == 1 ) {
            return false; //We meet cycle
        } 
        
        if( visited[c] == 2 ) {
            return true;
        }
        
        visited[c] = 1;
        List<Integer> l = map.get(c);
        
        if( l != null ) {
            for( int v : l ) {
                if( !canFinish(v, visited, map) ) {
                    return false;
                }
            }
        }
        
        visited[c] = 2;
        
        return true;
        
    }
}
