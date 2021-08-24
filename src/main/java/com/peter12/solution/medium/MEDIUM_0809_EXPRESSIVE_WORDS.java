package com.peter12.solution.medium;

public class MEDIUM_0809_EXPRESSIVE_WORDS {
	public int expressiveWords(String s, String[] words) {
        /*
          Solution: https://www.cnblogs.com/grandyang/p/9426942.html
        */
        int result = 0;
        
        for( String w : words ) {
            if( check(s, w) ) {
                result++;
            }
            
        }
        
        return result;
    } 
    
    public boolean check( String s, String w ) {
        
        int sb = 0, wb = 0;
        
        while( sb < s.length() && wb < w.length() ) {
            if( s.charAt(sb) != w.charAt(wb) ) {
                return false;
            }
            
            int se = sb;
            while( se < s.length() && s.charAt(sb) == s.charAt(se) ) {
                se++;
            }
            
            int we = wb;
            while( we < w.length() && w.charAt(we) == w.charAt(wb) ) {
                we++;
            }
            
            int ls = se - sb;
            int lw = we - wb;
            
            if( ls != lw && ls < Math.max(3, lw ) ) {
                return false;
            }
            
            sb = se;
            wb = we;
        }
        
        return sb == s.length() && wb == w.length();
        
    }
}
