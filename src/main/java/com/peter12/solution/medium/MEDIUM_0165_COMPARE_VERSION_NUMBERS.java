package com.peter12.solution.medium;

public class MEDIUM_0165_COMPARE_VERSION_NUMBERS {
	public static int compareVersion(String version1, String version2) {
		String[] split1 = version1.split("\\.");
		String[] split2 = version2.split("\\.");

		int size = ( split1.length < split2.length )? split1.length : split2.length;

		for( int i = 0; i < size; i++ ) {
			Integer digit1 = Integer.valueOf( split1[i] );
			Integer digit2 = Integer.valueOf( split2[i] );

			if( digit1 > digit2 ) {
				return 1;
			} else if( digit1 < digit2 ) {
				return -1;
			} 

		}

		if( split1.length == split2.length ) {
			return 0;
		} else {
			 String[] large  = ( split1.length < split2.length )? split2 : split1;
	            
	            for( int i = size; i < large.length; i++ ) {
	                Integer digit = Integer.valueOf( large[i] );
	                
	                if( digit != 0 ) {
	                    
	                    if( large == split1 ) {
	                        return 1;
	                    } else {
	                        return -1;
	                    }
	                    
	                }
	                
	            }
	            
	            return 0;
		}
	}
}
