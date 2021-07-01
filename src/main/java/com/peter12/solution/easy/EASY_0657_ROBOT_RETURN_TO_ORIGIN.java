package com.peter12.solution.easy;

public class EASY_0657_ROBOT_RETURN_TO_ORIGIN {
	public static boolean judgeCircle(String moves) {
		int i = 0;
        int j = 0;
        
        for( char c : moves.toCharArray() ) {
            if( c == 'R' ) {
                i++;
            }
            
            if( c == 'L' ) {
                i--;
            }
            
            if( c == 'U' ) {
                j++;
            }
            
            if( c == 'D' ) {
                j--;
            }
        }
        
        if( i == 0 && j == 0 ) {
            return true;
        } else {
            return false;
        }
	}
}
