package com.peter12.solution.medium;

public class MEDIUM_0394_DECODE_STRING {
	public String decodeString(String s) {
	    
        if( finished(s) ) {
            return s;
        }
        
        String result = "";
        int i = 0;
        while( i < s.length() ) {
            
            if( '0' <= s.charAt(i) && s.charAt(i) <= '9' ) {
                int left = i;
                while( left < s.length() && s.charAt(left) != '[' ) {
                    left++;
                }
                
                int right = findRight(left, s.length(), s );
                System.out.println(" i = " + i + " left = " + left + " rignt = " + right );
                int count = Integer.parseInt( s.substring(i, left));
                String str = s.substring(left+ 1, right);
            
                System.out.println(" count = " + count + " str = " + str );
                result += decode(count, str);
                i = right + 1;
            } else {
                result += s.substring(i, i + 1);
                i++;
            }
            
                  
        }
        
        
        return decodeString(result);
        
    }
    
    public boolean finished( String s ) {
    
        for( char ch : s.toCharArray() ) {
            if( ch == '[') {
                return false;
            }
        }
        
        return true;
    }
    
    public int findRight( int begin, int end, String s ) {
        int result = begin;
        int count = 0;
        while( result < end ) {
            if( s.charAt(result) == '[') {
                count++;
            } else if ( s.charAt( result) == ']') {
                count--;
            }
            
            if( count == 0 ) {
                return result;
            }
            
            result++;
        }
                
        return result;
    }
    
    public String decode( int count, String str ) {
        //3[aa]
    
        String result = "";
        for( int i = 0; i < count; i++ ) {
            result += str;
        }
        
        //System.out.println(" count = " + count + " str = " + str + " result = " + result);
        return result;
        
    }
}
