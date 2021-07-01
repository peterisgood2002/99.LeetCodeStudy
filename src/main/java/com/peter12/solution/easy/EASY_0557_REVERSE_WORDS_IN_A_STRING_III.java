package com.peter12.solution.easy;

public class EASY_0557_REVERSE_WORDS_IN_A_STRING_III {
	public static String reverseWords(String s) {
		
        String[] split = s.split(" ");
        
        String[] newSplit = new String[ split.length];
        for( int i = 0; i < split.length; i++ ) {
            
            String str = split[i];
           
            String r = "";
            for( int j = str.length() - 1; j >= 0; j-- ) {
                r += str.charAt(j);
            }
            
            newSplit[i] = r;
            
            
        }
        
        
        String result = "";
        
        for( String str : newSplit ) {
            result += str + " ";
        }
        
        return result.substring(0, result.length() - 1);}
}
