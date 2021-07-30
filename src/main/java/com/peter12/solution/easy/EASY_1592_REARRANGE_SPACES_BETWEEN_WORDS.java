package com.peter12.solution.easy;

import java.util.ArrayList;
import java.util.List;

public class EASY_1592_REARRANGE_SPACES_BETWEEN_WORDS {
	public String reorderSpaces(String text) {
        List<String> words = new ArrayList<String>();
        int countw = 0;
        for( int i = 0; i < text.length(); ) {
            if( text.charAt(i) == ' ') {
                countw++;
                
                i++;
            } else {
                int e = i;
                while( e < text.length() && text.charAt(e) != ' ') {
                    e++;
                }
                
                String sub = text.substring(i, e);
                //System.out.println(sub);
                words.add(sub);
                
                i = e;
            }
        }
        
        int space = countw;
        if( words.size() > 1) {
            space = countw / (words.size() - 1);
        }
        
        
        
        //System.out.println(  " count = " + countw + " words = " + words.size() + " space = " + space);
             
        String result = "";
        for( String w : words ) {
            System.out.println( w);
            
            result += w;
            
            for( int j = 0; j < space && countw > 0; j++, countw-- ) {
                result += " ";
            }
        }
        
        
        // put the rest of space
        while( countw > 0 ) {
            result += " ";
            countw--;
        }
        return result;
         
    }
}
