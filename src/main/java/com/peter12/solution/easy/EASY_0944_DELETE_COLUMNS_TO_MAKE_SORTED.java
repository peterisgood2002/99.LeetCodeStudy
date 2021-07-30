package com.peter12.solution.easy;

public class EASY_0944_DELETE_COLUMNS_TO_MAKE_SORTED {
	public int minDeletionSize(String[] strs) {
        int row = strs.length;
        int col = strs[0].length();
        
        boolean[] lex = new boolean[col];
        
        for( int c = 0; c < col; c++ ) {
            lex[c] = true;
            
            for( int r = 0; r < row - 1; r++ ) {
                if( strs[r].charAt(c) > strs[r + 1].charAt(c ) ) {
                    lex[c] = false;
                }
            }
             
        }
        
        int result = 0;
        for( boolean l : lex ) {
            if( l == false ) {
                result++;
            } 
        }
        
        return result;
        
    }
}
