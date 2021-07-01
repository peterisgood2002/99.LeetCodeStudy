package com.peter12.solution.easy;

public class EASY_0551_STUDENT_ATTENDANCE_RECORD_I {
	public static boolean checkRecord(String s) {
		 
        int totalA = 0;
        int late = 0;
        
        for( char c : s.toCharArray() ) {
            if( c == 'A' ) {
                totalA++;
            }
            
            if( c == 'L' ) {
                late++;
                
                if( late == 3 ) {
                    return false;
                }
            } else {
                 late = 0;
            }
            
           
            
        }
        
        if( totalA >= 2 ) {
            return false;
        } else {
            return true;
        }
	}
}
